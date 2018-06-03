package com.controllers;

import java.io.IOException;

import javax.persistence.NoResultException;

import com.entities.Customer;
import com.exceptions.ServiceException;
import com.handlers.StageHandler;
import com.services.CustomerService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
	private void processLogin(ActionEvent e) throws IOException {
		if (!checkIfOneOrMoreFieldsAreBlank()) {			
			Customer customer = new Customer();
			
			customer.setCustomerEmail(customerEmail.getText());
			customer.setCustomerPassword(customerPassword.getText());
			
			try {
				customerService.processLogin(customer);
				errorLabel.setText("Logging in..");

                Scene secondScene = new Scene(FXMLLoader.load(getClass().getResource("/fxml/MainWindow.fxml")));
                StageHandler.getStage().setScene(secondScene);				
			} catch (ServiceException ex) {
				errorLabel.setText("Customer email or password is incorrect..");
			} catch (NoResultException ex) {
				errorLabel.setText("There is no registered customer with this email..");
			}
		} else {
			errorLabel.setText("One or more fields are empty..");
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