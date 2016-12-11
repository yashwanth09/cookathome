package com.cah.bean;

public class Customer {
	private String customer_Name;
	private String customer_Email;
	private int customer_Mobile;
	private int customer_Pincode;
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCustomer_Email() {
		return customer_Email;
	}
	public void setCustomer_Email(String customer_Email) {
		this.customer_Email = customer_Email;
	}
	public int getCustomer_Mobile() {
		return customer_Mobile;
	}
	public void setCustomer_Mobile(int customer_Mobile) {
		this.customer_Mobile = customer_Mobile;
	}
	public int getCustomer_Pincode() {
		return customer_Pincode;
	}
	public void setCustomer_Pincode(int customer_Pincode) {
		this.customer_Pincode = customer_Pincode;
	}
	public String getCustomer_Address() {
		return customer_Address;
	}
	public void setCustomer_Address(String customer_Address) {
		this.customer_Address = customer_Address;
	}
	@Override
	public String toString() {
		return "Customer [customer_Name=" + customer_Name + ", customer_Email=" + customer_Email + ", customer_Mobile="
				+ customer_Mobile + ", customer_Pincode=" + customer_Pincode + ", customer_Address=" + customer_Address
				+ "]";
	}
	private String customer_Address;

}
