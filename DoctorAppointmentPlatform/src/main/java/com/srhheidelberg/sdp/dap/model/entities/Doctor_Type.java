/**
 * @author Sunny
 *
 */
package com.srhheidelberg.sdp.dap.model.entities;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Doctor_Type")
@EntityListeners(AuditingEntityListener.class)
public class Doctor_Type {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long DoctorTypeId;
	
	private String DoctorType;
	
	public Long getDoctortypeid() {
		return DoctorTypeId;
	}
	public void setDoctortypeid(Long DoctorTypeId) {
		this.DoctorTypeId = DoctorTypeId;
	}
	public String getDoctortype() {
		return DoctorType;
	}
	public void setDoctortype(String DoctorType) {
		this.DoctorType = DoctorType;
	}

	@Override
	public String toString() {
		return "Doctortype [doctortypeid=" + DoctorTypeId + ", doctortype=" + DoctorType + "]";
	}

}
