package com.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entities.PizzaOrder;

public class PizzaOrderService {

	private final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("pizzahouse");
	private final EntityManager EM = EMF.createEntityManager();
	private final EntityTransaction TX = EM.getTransaction();
	
	public void createOrder(PizzaOrder order) {
		TX.begin();
		EM.persist(order);
		TX.commit();
		System.out.println("Order Created: " + order);
	}
	
}
