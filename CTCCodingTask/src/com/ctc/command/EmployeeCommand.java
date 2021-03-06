package com.ctc.command;

import java.util.Date;

public class EmployeeCommand {
	
	private String Id;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private Date dateOfJoining;
	private String status;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Date getDate() {
		return dateOfJoining;
	}
	public void setDate(Date date) {
		this.dateOfJoining = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
