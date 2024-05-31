package com.exavalu.customer.product.portal.entities.salesforce;

public class CartDetails {
 
	private String customerEmail;
	private String customerId;
	private String Items;
	private String Nearest_Db_Location;
	private String Status;
	private int Total_Amount;
	
	
	public CartDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDetails(String customerEmail, String customerId, String items, String nearest_Db_Location, String status,
			int total_Amount) {
		super();
		this.customerEmail = customerEmail;
		this.customerId = customerId;
		Items = items;
		Nearest_Db_Location = nearest_Db_Location;
		Status = status;
		Total_Amount = total_Amount;
	}
	@Override
	public String toString() {
		return "CartDetails [customerEmail=" + customerEmail + ", customerId=" + customerId + ", Items=" + Items
				+ ", Nearest_Db_Location=" + Nearest_Db_Location + ", Status=" + Status + ", Total_Amount="
				+ Total_Amount + "]";
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public String getNearest_Db_Location() {
		return Nearest_Db_Location;
	}
	public void setNearest_Db_Location(String nearest_Db_Location) {
		Nearest_Db_Location = nearest_Db_Location;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getTotal_Amount() {
		return Total_Amount;
	}
	public void setTotal_Amount(int total_Amount) {
		Total_Amount = total_Amount;
	}
}
