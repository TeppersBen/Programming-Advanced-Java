package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PizzaOrder {

	@Id
	private long id;
	
	private String customerName;
	private String customerEmail;
	private String deliveryDate;
	private String ingredients;
	private String pizzaBottom;
	private boolean spicy;
	private String size;
	private int amount;
	
	public PizzaOrder() {}
	
	public PizzaOrder(long id, String customerName, String customerEmail, String deliveryDate, String ingredients,
			String pizzaBottom, boolean spicy, String size, int amount) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.deliveryDate = deliveryDate;
		this.ingredients = ingredients;
		this.pizzaBottom = pizzaBottom;
		this.spicy = spicy;
		this.size = size;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getPizzaBottom() {
		return pizzaBottom;
	}
	public void setPizzaBottom(String pizzaBottom) {
		this.pizzaBottom = pizzaBottom;
	}
	public boolean isSpicy() {
		return spicy;
	}
	public void setSpicy(boolean spicy) {
		this.spicy = spicy;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + ":[" + id + " " + customerName + " " + customerEmail + " " + pizzaBottom + " " + size + " " + ingredients + " " + amount + " " + deliveryDate + "]";
	}
}