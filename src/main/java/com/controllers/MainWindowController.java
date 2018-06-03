package com.controllers;

import java.time.format.DateTimeFormatter;

import com.entities.PizzaOrder;
import com.services.PizzaOrderService;
import com.utils.MultiSelectListView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

//fx:controller="com.Controller"
public class MainWindowController {

	private PizzaOrderService pizzaService = new PizzaOrderService();
	
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
	private CheckBox pizzaSpicy;
	
	@FXML
	private void createOrder(ActionEvent e) {
		PizzaOrder order = new PizzaOrder();
		
		order.setCustomerName(customerNameText.getText());
		order.setCustomerEmail(customerEmailText.getText());
		order.setPizzaBottom(pizzaBottomToggleGroup.getSelectedToggle().toString().substring(
				pizzaBottomToggleGroup.getSelectedToggle().toString().indexOf("'")+1,
				pizzaBottomToggleGroup.getSelectedToggle().toString().length()-1));
		order.setSize(pizzaSizeComboBox.getValue());
		order.setSpicy(pizzaSpicy.isSelected());
		order.setIngredients(pizzaIngredientsMultiList.getSelectionModel().getSelectedItems().toString());
		order.setAmount(Integer.parseInt(pizzaAmountText.getText()));
		order.setDeliveryDate(deliveryDatePicker.getValue().format(DateTimeFormatter.ofPattern("dd LLLL yyyy")));
		
		pizzaService.createOrder(order);
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