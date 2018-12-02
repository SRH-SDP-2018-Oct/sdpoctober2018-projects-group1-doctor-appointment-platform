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
@Table(name = "Doctor_User")
public class Doctor_User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer DoctorUser_Id;
	private String LastName;
	private String FirstName;
	private String AddressLine1;
	private String AddressLine2;
	private Integer PostalCode;
	private Integer Contact;
	private Integer DoctorType_Id;
	private String Experience;
	private Integer Fees;
	private String Gender;
	private String Password;
	private Integer OverallRating; 
	private Boolean Sunday;
	private Boolean Monday; 
	private Boolean Tuesday ;
	private Boolean Wednesday;
	private Boolean Thursday ;
	private Boolean Friday;
	private Boolean Saturday;
	
	public int getDoctorUser_Id() {
		return DoctorUser_Id;
	}
	public void setDoctorUser_Id(int doctorUser_Id) {
		DoctorUser_Id = doctorUser_Id;
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
	public int getDoctorType_Id() {
		return DoctorType_Id;
	}
	public void setDoctorType_Id(int doctorType_Id) {
		DoctorType_Id = doctorType_Id;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		Experience = experience;
	}
	public int getFees() {
		return Fees;
	}
	public void setFees(int fees) {
		Fees = fees;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getOverallRating() {
		return OverallRating;
	}
	public void setOverallRating(int overallRating) {
		OverallRating = overallRating;
	}
	public Boolean getSunday() {
		return Sunday;
	}
	public void setSunday(Boolean sunday) {
		Sunday = sunday;
	}
	public Boolean getMonday() {
		return Monday;
	}
	public void setMonday(Boolean monday) {
		Monday = monday;
	}
	public Boolean getTuesday() {
		return Tuesday;
	}
	public void setTuesday(Boolean tuesday) {
		Tuesday = tuesday;
	}
	public Boolean getWednesday() {
		return Wednesday;
	}
	public void setWednesday(Boolean wednesday) {
		Wednesday = wednesday;
	}
	public Boolean getThursday() {
		return Thursday;
	}
	public void setThursday(Boolean thursday) {
		Thursday = thursday;
	}
	public Boolean getFriday() {
		return Friday;
	}
	public void setFriday(Boolean friday) {
		Friday = friday;
	}
	public Boolean getSaturday() {
		return Saturday;
	}
	public void setSaturday(Boolean saturday) {
		Saturday = saturday;
	}
	
	@Override
	public String toString() {
		return "DoctorUser [DoctorUser_Id=" + DoctorUser_Id + ", LastName=" + LastName + ", FirstName=" + FirstName
				+ ", AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + ", PostalCode=" + PostalCode
				+ ", Contact=" + Contact + ", DoctorType_Id=" + DoctorType_Id + ", Experience=" + Experience + ", Fees="
				+ Fees + ", Gender=" + Gender + ", Password=" + Password + ", OverallRating=" + OverallRating
				+ ", Sunday=" + Sunday + ", Monday=" + Monday + ", Tuesday=" + Tuesday + ", Wednesday=" + Wednesday
				+ ", Thursday=" + Thursday + ", Friday=" + Friday + ", Saturday=" + Saturday + "]";
	}
	
}
