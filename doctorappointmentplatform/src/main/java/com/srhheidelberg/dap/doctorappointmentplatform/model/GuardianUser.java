package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="guardianuser")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class GuardianUser {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="guardianid")
	private Integer guardianId;
	
	@Column(name="guardianlastname")
	private String guardianLastName;

	@Column(name="guardianfirstname")
	private String guardianFirstName;

	@Column(name="guardianemail")
	private String guardianEmail;

	@Column(name="guardiancontact")
	private Long guardianContact;

	@Column(name="guardianstreetname")
	private String guardianStreetName;

	@Column(name="guardianareaname")
	private String guardianAreaName;

	@Column(name="guardiancity")
	private Integer guardianCity;

	@Column(name="guardianpostalcode")
	private Long guardianPostalCode;

	@Override
	public String toString() {
		return "GuardianUser [guardianId=" + guardianId + ", guardianLastName=" + guardianLastName
				+ ", guardianFirstName=" + guardianFirstName + ", guardianEmail=" + guardianEmail + ", guardianContact="
				+ guardianContact + ", guardianStreetName=" + guardianStreetName + ", guardianAreaName="
				+ guardianAreaName + ", guardianCity=" + guardianCity + ", guardianPostalCode=" + guardianPostalCode
				+ "]";
	}

	public Integer getGuardianId() {
		return guardianId;
	}

	public void setGuardianId(Integer guardianId) {
		this.guardianId = guardianId;
	}

	public String getGuardianLastName() {
		return guardianLastName;
	}

	public void setGuardianLastName(String guardianLastName) {
		this.guardianLastName = guardianLastName;
	}

	public String getGuardianFirstName() {
		return guardianFirstName;
	}

	public void setGuardianFirstName(String guardianFirstName) {
		this.guardianFirstName = guardianFirstName;
	}

	public String getGuardianEmail() {
		return guardianEmail;
	}

	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}

	public Long getGuardianContact() {
		return guardianContact;
	}

	public void setGuardianContact(Long guardianContact) {
		this.guardianContact = guardianContact;
	}

	public String getGuardianStreetName() {
		return guardianStreetName;
	}

	public void setGuardianStreetName(String guardianStreetName) {
		this.guardianStreetName = guardianStreetName;
	}

	public String getGuardianAreaName() {
		return guardianAreaName;
	}

	public void setGuardianAreaName(String guardianAreaName) {
		this.guardianAreaName = guardianAreaName;
	}

	public Integer getGuardianCity() {
		return guardianCity;
	}

	public void setGuardianCity(Integer guardianCity) {
		this.guardianCity = guardianCity;
	}

	public Long getGuardianPostalCode() {
		return guardianPostalCode;
	}

	public void setGuardianPostalCode(Long guardianPostalCode) {
		this.guardianPostalCode = guardianPostalCode;
	}
	
}
