package com.webAPI;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.core.Application;

@ApplicationPath("/hello")
public class RestTest extends Application {

	@GET
	public String sayHello() {
		return "hello";
	}
	
}