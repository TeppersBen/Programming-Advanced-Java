package com.frame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

//fx:controller="com.Controller"
public class Controller {

	@FXML
	private ComboBox<String> pizzaSizeComboBox;
	@FXML
	private ToggleGroup pizzaBottomToggleGroup;
	@FXML
	private TextField pizzaAmountText;
	@FXML
	private MultiSelectListView<String> pizzaIngredientsMultiList;
	@FXML
	private DatePicker deliveryDatePicker;
	@FXML
	private TextField customerNameText;
	@FXML
	private TextField customerEmailText;
	
	@FXML
	private void createOrder(ActionEvent e) {
		System.out.println("#createOrder");
	}
	
	@FXML
	private void createNewOrder(ActionEvent e) {
		System.out.println("#createNewOrder");
	}
	
	@FXML
	private void openAnOrder(ActionEvent e) {
		System.out.println("#openAnOrder");
	}
	
	@FXML
	private void saveAnOrder(ActionEvent e) {
		System.out.println("#saveAnOrder");
	}
	
	@FXML
	private void saveOrderAsXML(ActionEvent e) {
		System.out.println("#saveOrderAsXML");
	}
	
	@FXML
	private void saveOrderAsText(ActionEvent e) {
		System.out.println("#saveOrderAsText");
	}
	
	@FXML
	private void exitApplication(ActionEvent e) {
		System.out.println("#exitApplication");
	}
	
	@FXML
	private void showAboutDetails(ActionEvent e) {
		System.out.println("#showAboutDetails");
	}
}