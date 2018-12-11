package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="patientuser")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PatientUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="patientid")
	private Integer patientId;
	
	@Column(name="patientlastname")
	private String patientLastName;

	@Column(name="patientfirstname")
	private String patientFirstName;

	@Column(name="patientemail")
	private String patientEmail;

	@Column(name="patientcontact")
	private Long patientContact;

	@Column(name="patientareaname")
	private String patientStreetName;

	@Column(name="patientstreetname")
	private String patientAreaName;

	@Column(name="patientcity")
	private Integer patientCity;

	@Column(name="patientpostalcode")
	private Long patientPostalCode;
	
	@Column(name="patientgender")
	private String patientGender;
	
	@Column(name="patientpassword")
	private String patientPassword;
	
	@Column(name="patientguardian")
	private Integer patientGuardian;

	@Override
	public String toString() {
		return "PatientUser [patientId=" + patientId + ", patientLastName=" + patientLastName + ", patientFirstName="
				+ patientFirstName + ", patientEmail=" + patientEmail + ", patientContact=" + patientContact
				+ ", patientStreetName=" + patientStreetName + ", patientAreaName=" + patientAreaName + ", patientCity="
				+ patientCity + ", patientPostalCode=" + patientPostalCode + ", patientGender=" + patientGender
				+ ", patientPassword=" + patientPassword + ", patientGuardian=" + patientGuardian + "]";
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public Long getPatientContact() {
		return patientContact;
	}

	public void setPatientContact(Long patientContact) {
		this.patientContact = patientContact;
	}

	public String getPatientStreetName() {
		return patientStreetName;
	}

	public void setPatientStreetName(String patientStreetName) {
		this.patientStreetName = patientStreetName;
	}

	public String getPatientAreaName() {
		return patientAreaName;
	}

	public void setPatientAreaName(String patientAreaName) {
		this.patientAreaName = patientAreaName;
	}

	public Integer getPatientCity() {
		return patientCity;
	}

	public void setPatientCity(Integer patientCity) {
		this.patientCity = patientCity;
	}

	public Long getPatientPostalCode() {
		return patientPostalCode;
	}

	public void setPatientPostalCode(Long patientPostalCode) {
		this.patientPostalCode = patientPostalCode;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public Integer getPatientGuardian() {
		return patientGuardian;
	}

	public void setPatientGuardian(Integer patientGuardian) {
		this.patientGuardian = patientGuardian;
	}
}
