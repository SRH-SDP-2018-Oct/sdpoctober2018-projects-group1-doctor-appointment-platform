/**
 * @author Sunny
 *
 */
package com.srhheidelberg.sdp.dap.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Doctor_Type")
@EntityListeners(AuditingEntityListener.class)
public class Doctor_Type {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DoctorTypeId")
	private Long doctorTypeId;
	
	@Column(name="DoctorType")
	private String doctorType;
	
	@OneToOne(mappedBy = "doctorTypeId")
    private Doctor_User doctorUser;
	
	public Long getDoctortypeid() {
		return doctorTypeId;
	}
	public void setDoctortypeid(Long DoctorTypeId) {
		this.doctorTypeId = DoctorTypeId;
	}
	public String getDoctortype() {
		return doctorType;
	}
	public void setDoctortype(String DoctorType) {
		this.doctorType = DoctorType;
	}

	@Override
	public String toString() {
		return "Doctortype [doctortypeid=" + doctorTypeId + ", doctortype=" + doctorType + "]";
	}

}
