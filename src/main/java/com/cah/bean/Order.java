package com.cah.bean;

import java.util.List;

public class Order {
	
	private String cookName;
	private Customer customer;
	private List<String> selecteditems;
	@Override
	public String toString() {
		return "Order [cookName=" + cookName + ", customer=" + customer + ", selecteditems=" + selecteditems + "]";
	}
	public String getCookName() {
		return cookName;
	}
	public void setCookName(String cookName) {
		this.cookName = cookName;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<String> getSelecteditems() {
		return selecteditems;
	}
	public void setSelecteditems(List<String> selecteditems) {
		this.selecteditems = selecteditems;
	}

}
