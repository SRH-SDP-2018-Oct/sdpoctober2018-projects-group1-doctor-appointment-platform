/**
 * @author Sunny
 *
 */
package com.srhheidelberg.sdp.dap.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_user")
public class Patient_User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer PatientUserId;
	private String Lastname;
	private String Firstname;
	private String AddressLine1;
	private String AddressLine2;
	private Integer PostalCode;
	private Integer Contact;
	private String Gender;
	private String Email;
	private Integer City_Id;
	private String Password;
	
	public Integer getPatientUserId() {
		return PatientUserId;
	}
	public void setPatientUserId(Integer patientUserId) {
		PatientUserId = patientUserId;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public Integer getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(Integer postalCode) {
		PostalCode = postalCode;
	}
	public Integer getContact() {
		return Contact;
	}
	public void setContact(Integer contact) {
		Contact = contact;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getCity_Id() {
		return City_Id;
	}
	public void setCity_Id(Integer city_Id) {
		City_Id = city_Id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	@Override
	public String toString() {
		return "Patient_User [PatientUserId=" + PatientUserId + ", Lastname=" + Lastname + ", Firstname=" + Firstname
				+ ", AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + ", PostalCode=" + PostalCode
				+ ", Contact=" + Contact + ", Gender=" + Gender + ", Email=" + Email + ", City_Id=" + City_Id
				+ ", Password=" + Password + "]";
	}
	
}
