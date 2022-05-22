package com.nirmiti.inventory.bean;

public class Payment {

	private int billNumber;
	private String paymentType;
	private String paymentStatus;
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getBillNumber() {
		return billNumber;
	}
	
	
}
