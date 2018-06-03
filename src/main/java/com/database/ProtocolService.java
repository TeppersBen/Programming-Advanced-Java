package com.database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public interface ProtocolService {

	final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("pizzahouse");
	final EntityManager EM = EMF.createEntityManager();
	final EntityTransaction TX = EM.getTransaction();
	
}