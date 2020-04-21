package com.repository.repositoryh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repository.repositoryh2.models.Customer;
import com.repository.repositoryh2.models.CustomerName;
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
		
		service.insertCustomer(dataRequest);
		
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@PostMapping("${controller.get-data}")
	public CustomerResponse getCustomer(@RequestBody CustomerName nameRequest){
		
		return service.getCustomerByName(nameRequest.getNombre());		
	}
}
