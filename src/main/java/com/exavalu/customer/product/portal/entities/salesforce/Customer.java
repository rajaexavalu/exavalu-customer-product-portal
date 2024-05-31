package com.exavalu.customer.product.portal.entities.salesforce;

public class Customer {
	
	private String address;
	private String cardDetails;
	private String emailId;
	private String firstName;
	private String lastName;
	private String gender;
	private String location;
	private String phoneNumber;
	private String pincode;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String address, String cardDetails, String emailId, String firstName, String lastName,
			String gender, String location, String phoneNumber, String pincode) {
		super();
		this.address = address;
		this.cardDetails = cardDetails;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Customer [address=" + address + ", cardDetails=" + cardDetails + ", emailId=" + emailId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", gender=" + gender + ", location=" + location
				+ ", phoneNumber=" + phoneNumber + ", pincode=" + pincode + "]";
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(String cardDetails) {
		this.cardDetails = cardDetails;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
