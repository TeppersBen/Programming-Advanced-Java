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
	
	public void processLogin(Customer customer) throws ServiceException, NoResultException {
		String q = "SELECT c FROM Customer c WHERE c.customerEmail LIKE '" + customer.getCustomerEmail() + "'";
		Query query = EM.createQuery(q);
		try {
			Customer c = (Customer) query.getSingleResult();
			if (c.getCustomerPassword().equals(customer.getCustomerPassword())) {
				System.out.println("Processing Login..");
			} else {
				throw new ServiceException("Customer email or password is incorrect..");
			}
		} catch (NoResultException e) {
			throw new NoResultException("There is no registered customer with this email..");
		}
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