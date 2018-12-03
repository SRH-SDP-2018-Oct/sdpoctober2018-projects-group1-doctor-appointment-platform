package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patientuser")
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

	@Column(name="patientstreetname")
	private String patientStreetName;

	@Column(name="patientareaname")
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
}
