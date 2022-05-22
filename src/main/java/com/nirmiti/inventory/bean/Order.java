package com.nirmiti.inventory.bean;

import java.util.Date;

public class Order {

	private Product product;
	private int quantity; 
	private int orderId; 
	private Date orderDate;
	private Customer customer;
	
		
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double calculateBill() {
		return this.product.getPrice()*this.quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getOrderId() {
		return orderId;
	}
	
	
}
