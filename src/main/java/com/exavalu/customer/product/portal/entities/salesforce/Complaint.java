package com.exavalu.customer.product.portal.entities.salesforce;

public class Complaint {
	
	private String complaintId;
	private String action;
	private String complaint_category;
	private String complaint_date;
	private String customerId;
	
	
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(String complaintId, String action, String complaint_category, String complaint_date,
			String customerId, String date_of_complaint, String description) {
		super();
		this.complaintId = complaintId;
		this.action = action;
		this.complaint_category = complaint_category;
		this.complaint_date = complaint_date;
		this.customerId = customerId;
		this.date_of_complaint = date_of_complaint;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", action=" + action + ", complaint_category="
				+ complaint_category + ", complaint_date=" + complaint_date + ", customerId=" + customerId
				+ ", date_of_complaint=" + date_of_complaint + ", description=" + description + "]";
	}
	public String getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getComplaint_category() {
		return complaint_category;
	}
	public void setComplaint_category(String complaint_category) {
		this.complaint_category = complaint_category;
	}
	public String getComplaint_date() {
		return complaint_date;
	}
	public void setComplaint_date(String complaint_date) {
		this.complaint_date = complaint_date;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDate_of_complaint() {
		return date_of_complaint;
	}
	public void setDate_of_complaint(String date_of_complaint) {
		this.date_of_complaint = date_of_complaint;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String date_of_complaint;
	private String description;
}
