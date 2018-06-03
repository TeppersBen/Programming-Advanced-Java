package com.handlers;

import com.entities.Customer;

import javafx.stage.Stage;

public class Session {

	private static Stage stage;
	private static Customer customer;
	
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		Session.stage = stage;
	}

	public static Customer getCustomer() {
		return customer;
	}

	public static void setCustomer(Customer customer) {
		Session.customer = customer;
	}

}