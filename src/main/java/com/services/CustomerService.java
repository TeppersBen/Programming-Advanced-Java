package com.services;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.entities.Customer;
import com.exceptions.ServiceException;

public class CustomerService implements ProtocolService {

	public void createUserIfNotExists(Customer customer) throws ServiceException {
		if (!checkIfCustomerExists(customer.getCustomerEmail())) {
			TX.begin();
			EM.persist(customer);
			TX.commit();
			System.out.println("Customer Created: " + customer);
		} else {
			throw new ServiceException("Customer already exists..");
		}
	}
	
	public void processLogin(Customer customer) throws ServiceException {
		throw new ServiceException("Not Implemented Yet!");
	}
	
	private boolean checkIfCustomerExists(String email) {
		String q = "SELECT c.customerEmail FROM Customer c WHERE c.customerEmail LIKE '" + email + "'";
		Query query = EM.createQuery(q);
		try {
			return ((String)query.getSingleResult()).equalsIgnoreCase(email);
		} catch (NoResultException e) {
			return false;
		}
	}
	
}