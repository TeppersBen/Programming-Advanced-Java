package com.webAPI.demo;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.entities.Customer;

@Path("/try-out")
@Produces(MediaType.TEXT_PLAIN)
public class RESTfulTest {
	
	@GET
	public String index() {
		return "Welcome in RESTfulTest web controller";
	}
	
	@Path("/information")
	@GET
	public String information() {
		return "This is an useless page :D";
	}
	
	@Path("/person/{firstname}/{lastname}")
	@GET
	public String getFancyStuff(@PathParam("firstname") String firstName,
								@PathParam("lastname") String lastName) {
		return "Hello there, " + firstName + " " + lastName;
	}
	
	@Path("/jsonTest")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setCustomerEmail("Test.Solo@hotmail.com");
		c.setCustomerPassword("You'll never know");
		return c;
	}
	
	@Path("/post")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void postCustomer(Customer customer) {
		System.out.println(customer);
	}
	
}
