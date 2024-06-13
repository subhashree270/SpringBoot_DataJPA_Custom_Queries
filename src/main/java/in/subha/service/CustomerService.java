package in.subha.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.subha.dto.CustomerDto;
import in.subha.entity.Customer;
import in.subha.repo.CustomerRepo;

@Service
public class CustomerService {
	
	private CustomerRepo repo;
	
	public CustomerService(CustomerRepo repo) {
		this.repo=repo;
	}
	
	public void saveCustomers() {		
		repo.saveCustomer("Sophia", "Female", 34);
	}
	
	public void updateCustomer() {
		repo.updateCustomer(2, "Maggie", "Female", 34);
	}
	
	public void getProjection() {
		 List<CustomerDto> dto = repo.findProjection();
		 dto.forEach(System.out::println);
	}
	
	
	
	
	

}
