package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "doctoruser")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DoctorUser {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="docotorid")
	private Integer doctorUserId;

	@Column(name="doctorlastname")
	private String doctorLastName;
	
	@Column(name="doctorfirstname")
	private String doctorFirstName;
	
	@Column(name="doctorsteetaddress")
	private String doctorSteetAddress;

	@Column(name="doctorareaaddress")
	private String doctorAreaAddress;

	@Column(name="doctorpostalcode")
	private Long doctorPostalCode;

	@Column(name="doctorcity")
	private Integer doctorCity;

	@Column(name="doctoremail")
	private String doctorEmail;

	@Column(name="doctorcontact")
	private Long doctorContact;

	@Column(name="doctorpassword")
	private String doctorPassword;

	@Column(name="doctorfees")
	private Integer doctorFees;

	@Column(name="doctortype")
	private Integer doctorType;

	@Column(name="doctorexperience")
	private String doctorExperience;

	@Column(name="doctorsunday")
	private Boolean doctorSunday;

	@Column(name="doctormonday")
	private Boolean doctorMonday;

	@Column(name="doctortuesday")
	private Boolean doctorTuesday;

	@Column(name="doctorwednesday")
	private Boolean doctorWednesday;

	@Column(name="doctorthursday")
	private Boolean doctorThursday;

	@Column(name="doctorfriday")
	private Boolean doctorFriday;

	@Column(name="doctorsaturday")
	private Boolean doctorSaturday;

	@Override
	public String toString() {
		return "DoctorUser [doctorUserId=" + doctorUserId + ", doctorLastName=" + doctorLastName + ", doctorFirstName="
				+ doctorFirstName + ", doctorSteetAddress=" + doctorSteetAddress + ", doctorAreaAddress="
				+ doctorAreaAddress + ", doctorPostalCode=" + doctorPostalCode + ", doctorCity=" + doctorCity
				+ ", doctorEmail=" + doctorEmail + ", doctorContact=" + doctorContact + ", doctorPassword="
				+ doctorPassword + ", doctorFees=" + doctorFees + ", doctorType=" + doctorType + ", doctorExperience="
				+ doctorExperience + ", doctorSunday=" + doctorSunday + ", doctorMonday=" + doctorMonday
				+ ", doctorTuesday=" + doctorTuesday + ", doctorWednesday=" + doctorWednesday + ", doctorThursday="
				+ doctorThursday + ", doctorFriday=" + doctorFriday + ", doctorSaturday=" + doctorSaturday + "]";
	}

	public Integer getDoctorUserId() {
		return doctorUserId;
	}

	public void setDoctorUserId(Integer doctorUserId) {
		this.doctorUserId = doctorUserId;
	}

	public String getDoctorLastName() {
		return doctorLastName;
	}

	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}

	public String getDoctorFirstName() {
		return doctorFirstName;
	}

	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}

	public String getDoctorSteetAddress() {
		return doctorSteetAddress;
	}

	public void setDoctorSteetAddress(String doctorSteetAddress) {
		this.doctorSteetAddress = doctorSteetAddress;
	}

	public String getDoctorAreaAddress() {
		return doctorAreaAddress;
	}

	public void setDoctorAreaAddress(String doctorAreaAddress) {
		this.doctorAreaAddress = doctorAreaAddress;
	}

	public Long getDoctorPostalCode() {
		return doctorPostalCode;
	}

	public void setDoctorPostalCode(Long doctorPostalCode) {
		this.doctorPostalCode = doctorPostalCode;
	}

	public Integer getDoctorCity() {
		return doctorCity;
	}

	public void setDoctorCity(Integer doctorCity) {
		this.doctorCity = doctorCity;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public Long getDoctorContact() {
		return doctorContact;
	}

	public void setDoctorContact(Long doctorContact) {
		this.doctorContact = doctorContact;
	}

	public String getDoctorPassword() {
		return doctorPassword;
	}

	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	public Integer getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(Integer doctorFees) {
		this.doctorFees = doctorFees;
	}

	public Integer getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(Integer doctorType) {
		this.doctorType = doctorType;
	}

	public String getDoctorExperience() {
		return doctorExperience;
	}

	public void setDoctorExperience(String doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	public Boolean getDoctorSunday() {
		return doctorSunday;
	}

	public void setDoctorSunday(Boolean doctorSunday) {
		this.doctorSunday = doctorSunday;
	}

	public Boolean getDoctorMonday() {
		return doctorMonday;
	}

	public void setDoctorMonday(Boolean doctorMonday) {
		this.doctorMonday = doctorMonday;
	}

	public Boolean getDoctorTuesday() {
		return doctorTuesday;
	}

	public void setDoctorTuesday(Boolean doctorTuesday) {
		this.doctorTuesday = doctorTuesday;
	}

	public Boolean getDoctorWednesday() {
		return doctorWednesday;
	}

	public void setDoctorWednesday(Boolean doctorWednesday) {
		this.doctorWednesday = doctorWednesday;
	}

	public Boolean getDoctorThursday() {
		return doctorThursday;
	}

	public void setDoctorThursday(Boolean doctorThursday) {
		this.doctorThursday = doctorThursday;
	}

	public Boolean getDoctorFriday() {
		return doctorFriday;
	}

	public void setDoctorFriday(Boolean doctorFriday) {
		this.doctorFriday = doctorFriday;
	}

	public Boolean getDoctorSaturday() {
		return doctorSaturday;
	}

	public void setDoctorSaturday(Boolean doctorSaturday) {
		this.doctorSaturday = doctorSaturday;
	}
	

}
