package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="doctortypevault")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DoctorTypeVault {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctortypeid")
	private Integer doctorTypeId;
	
	@Column(name="doctortypename")
	private String doctorTypeName;

	@Column(name="doctortypedescription")
	private String doctorTypeDescription;

	@Override
	public String toString() {
		return "DoctorTypeVault [doctorTypeId=" + doctorTypeId + ", doctorTypeName=" + doctorTypeName
				+ ", doctorTypeDescription=" + doctorTypeDescription + "]";
	}

	public Integer getDoctorTypeId() {
		return doctorTypeId;
	}

	public void setDoctorTypeId(Integer doctorTypeId) {
		this.doctorTypeId = doctorTypeId;
	}

	public String getDoctorTypeName() {
		return doctorTypeName;
	}

	public void setDoctorTypeName(String doctorTypeName) {
		this.doctorTypeName = doctorTypeName;
	}

	public String getDoctorTypeDescription() {
		return doctorTypeDescription;
	}

	public void setDoctorTypeDescription(String doctorTypeDescription) {
		this.doctorTypeDescription = doctorTypeDescription;
	}
	
}
