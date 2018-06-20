package com.webAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.entities.Customer;
import com.exceptions.ServiceException;
import com.services.CustomerService;

@Path("/customer")
public class CustomerWebService {

	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("id") int id) {
		return new CustomerService().get(id);
	}
	
	@Path("/post")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postCustomer(Customer customer) throws ServiceException {
		new CustomerService().createUserIfNotExists(customer);
	}
	
}