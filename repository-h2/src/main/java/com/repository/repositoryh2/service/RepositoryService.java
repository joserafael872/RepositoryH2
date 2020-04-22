package com.repository.repositoryh2.service;

import com.repository.repositoryh2.models.CustomerData;
import com.repository.repositoryh2.models.CustomerResponse;

public interface RepositoryService {
	
	void insertCustomer(CustomerData dataCustomer);
	
	CustomerResponse getCustomerByName(String customerName);

}
