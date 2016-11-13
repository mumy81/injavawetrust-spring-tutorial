package _37.aspectj.transaction.dao;

import java.util.List;

import _37.aspectj.transaction.model.Customer;

public interface CustomerDAO {
	
	public void insertCustomer(Customer product);
	public List<Customer> findAllCustomers();

}
