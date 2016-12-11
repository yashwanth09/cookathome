package com.cah.bean;

public class Cook {
	private double cookExp;
	private String cookFname;
	private String cookLname;
	private String cookState;
	private String cookcity;
	private String cookEmail;
	private int cookMobile;
	private String cookPassword;
	public String getCookFname() {
		return cookFname;
	}
	public void setCookFname(String cookFname) {
		this.cookFname = cookFname;
	}
	public String getCookLname() {
		return cookLname;
	}
	public void setCookLname(String cookLname) {
		this.cookLname = cookLname;
	}
	public String getCookEmail() {
		return cookEmail;
	}
	public void setCookEmail(String cookEmail) {
		this.cookEmail = cookEmail;
	}
	public int getCookMobile() {
		return cookMobile;
	}
	public void setCookMobile(int cookMobile) {
		this.cookMobile = cookMobile;
	}
	public String getCookPassword() {
		return cookPassword;
	}
	public void setCookPassword(String cookPassword) {
		this.cookPassword = cookPassword;
	}
	private double cookrating;
	@Override
	public String toString() {
		return "Cook [cookExp=" + cookExp + ", cookFname=" + cookFname + ", cookLname="
				+ cookLname + ", cookState=" + cookState + ", cookcity=" + cookcity + ", cookEmail=" + cookEmail
				+ ", cookMobile=" + cookMobile + ", cookPassword=" + cookPassword + ", cookrating=" + cookrating + "]";
	}
	
	public double getCookExp() {
		return cookExp;
	}
	public void setCookExp(double cookExp) {
		this.cookExp = cookExp;
	}
	public String getCookState() {
		return cookState;
	}
	public void setCookState(String cookState) {
		this.cookState = cookState;
	}
	public String getCookcity() {
		return cookcity;
	}
	public void setCookcity(String cookcity) {
		this.cookcity = cookcity;
	}
	public double getCookrating() {
		return cookrating;
	}
	public void setCookrating(double cookrating) {
		this.cookrating = cookrating;
	}
}
