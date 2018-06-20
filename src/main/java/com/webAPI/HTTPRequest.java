package com.webAPI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import com.entities.Customer;

public class HTTPRequest {

	private Client client = ClientBuilder.newClient();
	
	public String getBaseUri() {
		return "http://localhost:8081/Programming-Advanced-Java/api/";
	}
	
	public String getRequest(String request, String mediaType) {
		return client.target(getBaseUri() + request).request(mediaType).get(String.class);
	}
	
	public Customer getCustomerJSON(String request, MediaType mediaType) {
		return client.target(getBaseUri() + request).request(mediaType).get(Customer.class);
	}
	
	public void postObject(String request, Entity<?> entity) {
		client.target(getBaseUri() + request).request().post(entity);
	}
	
}