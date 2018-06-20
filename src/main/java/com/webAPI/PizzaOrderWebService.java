package com.webAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.entities.PizzaOrder;
import com.services.PizzaOrderService;

@Path("/pizza-order")
public class PizzaOrderWebService {

	@Path("/post")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createPizzaOrder(PizzaOrder order) {
		PizzaOrderService service = new PizzaOrderService();
		service.createOrder(order);
	}
	
	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getPizzaOrder(@javax.ws.rs.PathParam("id") int id) {
		return "";
	}
	
}