package com.exavalu.customer.product.portal.entities.salesforce;

public class OrderDetails {
	private String customerId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getDelivered_Date() {
		return delivered_Date;
	}

	public void setDelivered_Date(String delivered_Date) {
		this.delivered_Date = delivered_Date;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(String customerId, String delivered_Date, String feedback, String items, String order_date,
			String payment_Mode, String status, String total_Price) {
		super();
		this.customerId = customerId;
		this.delivered_Date = delivered_Date;
		this.feedback = feedback;
		this.items = items;
		this.order_date = order_date;
		this.payment_Mode = payment_Mode;
		this.status = status;
		this.total_Price = total_Price;
	}

	@Override
	public String toString() {
		return "OrderDetails [customerId=" + customerId + ", delivered_Date=" + delivered_Date + ", feedback="
				+ feedback + ", items=" + items + ", order_date=" + order_date + ", payment_Mode=" + payment_Mode
				+ ", status=" + status + ", total_Price=" + total_Price + "]";
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getPayment_Mode() {
		return payment_Mode;
	}

	public void setPayment_Mode(String payment_Mode) {
		this.payment_Mode = payment_Mode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotal_Price() {
		return total_Price;
	}

	public void setTotal_Price(String total_Price) {
		this.total_Price = total_Price;
	}

	private String delivered_Date;
	private String feedback;
	private String items;
	private String order_date;
	private String payment_Mode;
	private String status;
	private String total_Price;

}
