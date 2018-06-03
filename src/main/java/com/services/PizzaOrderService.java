package com.services;

import com.entities.PizzaOrder;

public class PizzaOrderService implements ProtocolService  {

	public void createOrder(PizzaOrder order) {
		TX.begin();
		EM.persist(order);
		TX.commit();
		System.out.println("Order Created: " + order);
	}
	
}
