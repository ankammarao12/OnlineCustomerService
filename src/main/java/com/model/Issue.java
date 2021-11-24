package com.model;

public class Issue {
	private String issueId;
	private String issueType;
	private String description;
	private String issueStatus;
	
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIssueStatus() {
		return issueStatus;
	}
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", issueType=" + issueType + ", description=" + description
				+ ", issueStatus=" + issueStatus + "]";
	}

}
