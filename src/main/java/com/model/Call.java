package com.model;

import java.util.Date;

public class Call {
	private int callId;
	private Date callDate;
	private double callDuration;
	private String phoneNumber;
	
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
	public Date getCallDate() {
		return callDate;
	}
	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}
	public double getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(double callDuration) {
		this.callDuration = callDuration;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	public Operator getReceivedBy() {
		return receivedBy;
	}
	public void setReceivedBy(Operator receivedBy) {
		this.receivedBy = receivedBy;
	}
	
	
	
	@Override
	public String toString() {
		return "Call [callId=" + callId + ", callDate=" + callDate + ", callDuration=" + callDuration + ", phoneNumber="
				+ phoneNumber + ", customer=" + customer + ", issue=" + issue + ", receivedBy=" + receivedBy + "]";
	}



	private Customer customer;
	private Issue issue;
	private Operator receivedBy;
}