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
@Table(name = "guardian_user")
public class Guardian_User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long GuardianUserId;
	private String LastName;
	private String FirstName;
	private String AddressLine1;
	private String AddressLine2;
	private String City;
	private Integer PostalCode;
	private Integer Contact;
	private String Email;
	
	public Long getGuardianUserId() {
		return GuardianUserId;
	}
	public void setGuardianUserId(Long guardianUserId) {
		GuardianUserId = guardianUserId;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
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
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return "GuardianUser [GuardianUserId=" + GuardianUserId + ", LastName=" + LastName + ", FirstName=" + FirstName
				+ ", AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + ", City=" + City
				+ ", PostalCode=" + PostalCode + ", Contact=" + Contact + ", Email=" + Email + "]";
	}
	
}
