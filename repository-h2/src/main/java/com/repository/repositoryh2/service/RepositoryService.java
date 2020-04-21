package com.repository.repositoryh2.service;

import com.repository.repositoryh2.models.Customer;
import com.repository.repositoryh2.models.CustomerResponse;

public interface RepositoryService {
	
	void putCustomer(Customer dataCustomer);
	
	CustomerResponse getCustomerByName(String customerName);

}