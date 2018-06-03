package com.controllers;

import com.services.CustomerService;
import com.entities.Customer;
import com.exceptions.ServiceException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CustomerLoginController {

	private CustomerService customerService = new CustomerService();

	@FXML
	private Label errorLabel;
	
	@FXML
	private TextField customerEmail;

	@FXML
	private PasswordField customerPassword;

	@FXML
	private void processLogin(ActionEvent e) {
		try {
			customerService.processLogin(null);
		} catch (ServiceException e1) {
			System.out.println(e1);
		}
	}

	@FXML
	private void processRegister(ActionEvent e) {
		if (!checkIfOneOrMoreFieldsAreBlank()) {
			Customer customer = new Customer();

			customer.setCustomerEmail(customerEmail.getText());
			customer.setCustomerPassword(customerPassword.getText());

			try {
				customerService.createUserIfNotExists(customer);
				errorLabel.setText("Customer created..");
			} catch (ServiceException ex) {
				errorLabel.setText("Customer already exists..");
			}
		} else {
			errorLabel.setText("One or more fields are empty..");
		}
	}
	
	private boolean checkIfOneOrMoreFieldsAreBlank() {
		return customerEmail.getText().isEmpty() || customerPassword.getText().isEmpty();
	}
}