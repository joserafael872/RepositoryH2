package com.repository.repositoryh2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.repositoryh2.entity.EntityTableRepository;
import com.repository.repositoryh2.entity.UserEntityTable;
import com.repository.repositoryh2.models.Customer;
import com.repository.repositoryh2.models.CustomerAccounst;
import com.repository.repositoryh2.models.CustomerResponse;
import com.repository.repositoryh2.service.RepositoryService;

@Service
public class RepositoryServiceImpl implements RepositoryService {

	@Autowired
	private EntityTableRepository entityRepository;

	@Override
	public void insertCustomer(Customer dataCustomer) {

		UserEntityTable userData = new UserEntityTable();
		userData.setNombre(dataCustomer.getNombre());
		userData.setApellidos(dataCustomer.getApellidos());
		userData.setSexo(dataCustomer.getSexo());
		userData.setFechaNac(dataCustomer.getFechaNac());
		userData.setNumCuenta(dataCustomer.getNumCuenta());
		userData.setProducto(dataCustomer.getSaldo());
		userData.setSaldo(dataCustomer.getProducto());
		
		entityRepository.save(userData);
	}

	@Override
	public CustomerResponse getCustomerByName(String customerName) {

		List<UserEntityTable> response = entityRepository.findByNombre(customerName);
		
		CustomerResponse customerResponse = null;
		
		if(!response.isEmpty()){
			List<CustomerAccounst> listAccounts = new ArrayList<>();
			response.stream().forEach(p -> listAccounts.add(CustomerAccounst.builder().numCuenta(p.getNumCuenta())
					.producto(p.getProducto()).saldo(p.getSaldo()).build()));
			
			customerResponse = CustomerResponse.builder().nombre(response.get(0).getNombre()).apellidos(response.get(0).getApellidos())
			.fechaNac(response.get(0).getFechaNac()).sexo(response.get(0).getSexo()).cuentas(listAccounts).build();
		}
		
		return customerResponse;
	}

}
