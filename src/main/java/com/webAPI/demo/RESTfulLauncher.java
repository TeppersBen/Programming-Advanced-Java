package com.webAPI.demo;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import com.entities.Customer;
import com.webAPI.HTTPRequest;

public class RESTfulLauncher {

	public static void main(String[] args) {
		System.out.println(new HTTPRequest().getCustomerJSON("try-out/jsonTest", MediaType.APPLICATION_JSON_TYPE));
		
		Customer c = new Customer();
		c.setCustomerEmail("RESTfulTEST@gmail.com");
		c.setCustomerPassword("RESTfulRULES");
		new HTTPRequest().postObject("try-out/post", Entity.json(c));
	}

}
