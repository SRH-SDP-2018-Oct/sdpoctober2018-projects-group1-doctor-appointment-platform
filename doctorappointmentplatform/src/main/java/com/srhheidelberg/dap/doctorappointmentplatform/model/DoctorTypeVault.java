package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctortypevault")
public class DoctorTypeVault {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="doctortypeid")
	private Integer doctorTypeId;
	
	@Column(name="doctortypename")
	private Integer doctorTypeName;

	@Column(name="doctortypedescription")
	private Integer doctorTypeDescription;

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

	public Integer getDoctorTypeName() {
		return doctorTypeName;
	}

	public void setDoctorTypeName(Integer doctorTypeName) {
		this.doctorTypeName = doctorTypeName;
	}

	public Integer getDoctorTypeDescription() {
		return doctorTypeDescription;
	}

	public void setDoctorTypeDescription(Integer doctorTypeDescription) {
		this.doctorTypeDescription = doctorTypeDescription;
	}
	
}
