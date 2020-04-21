package com.repository.repositoryh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repository.repositoryh2.models.Customer;
import com.repository.repositoryh2.models.CustomerResponse;
import com.repository.repositoryh2.service.RepositoryService;

@CrossOrigin
@RestController
@Validated
@RequestMapping("${controller.base-path}")
public class RepositoryController {

	@Autowired
	RepositoryService service;
	
	@PostMapping("${controller.insert-data}")
	public ResponseEntity<String> insertDataCustomer(@RequestBody Customer dataRequest){
		
		service.putCustomer(dataRequest);
		
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@GetMapping("${controller.get-data}")
	public CustomerResponse getCustomer(@PathVariable("nombre") String nombre){
		
		CustomerResponse response = service.getCustomerByName(nombre);
		
		return response;		
	}
}
