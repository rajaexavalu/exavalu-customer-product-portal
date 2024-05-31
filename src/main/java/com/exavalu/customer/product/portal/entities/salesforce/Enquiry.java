package com.exavalu.customer.product.portal.entities.salesforce;

public class Enquiry {
	private String emailId;
	private String productTitle;
	private String quantity;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public Enquiry() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enquiry(String emailId, String productTitle, String quantity) {
		super();
		this.emailId = emailId;
		this.productTitle = productTitle;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Enquiry [emailId=" + emailId + ", productTitle=" + productTitle + ", quantity=" + quantity + "]";
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
