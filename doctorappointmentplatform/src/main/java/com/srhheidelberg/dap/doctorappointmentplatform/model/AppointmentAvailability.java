package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="appointmentavailability")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AppointmentAvailability {
	
	public AppointmentAvailability() {
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="appointmentavailabilityid")
	private Integer appointmentAvailabilityId;
	
	@Column(name="appointmentavailabilitydoctor")
	private Integer appointmentAvailabilityDoctor;
	
	@Column(name="appointmentavailabilityslotday")
	private String appointmentAvailabilitySlotDay;
	
	@Column(name="appointmentavailabilitydoctortype")
	private Integer appointmentAvailabilityDoctorType;
	
	@Column(name="appointmentavailabilitydoctorcity")
	private Integer appointmentAvailabilityDoctorCity;
	
	@Column(name="appointmentavailabilityslottime1")
	private Boolean appointmentAvailabilitySlotTime1;
	
	@Column(name="appointmentavailabilityslottime2")
	private Boolean appointmentAvailabilitySlotTime2;
	
	@Column(name="appointmentavailabilityslottime3")
	private Boolean appointmentAvailabilitySlotTime3;
	
	@Column(name="appointmentavailabilityslottime4")
	private Boolean appointmentAvailabilitySlotTime4;
	
	@Column(name="appointmentavailabilityslottime5")
	private Boolean appointmentAvailabilitySlotTime5;
	
	@Column(name="appointmentavailabilityslottime6")
	private Boolean appointmentAvailabilitySlotTime6;
	
	@Column(name="appointmentavailabilityslottime7")
	private Boolean appointmentAvailabilitySlotTime7;
	
	@Column(name="appointmentavailabilityslottime8")
	private Boolean appointmentAvailabilitySlotTime8;
	
	@Column(name="appointmentavailabilityslottime9")
	private Boolean appointmentAvailabilitySlotTime9;
	
	@Column(name="appointmentavailabilityslottime10")
	private Boolean appointmentAvailabilitySlotTime10;
	
	@Column(name="appointmentavailabilityslottime11")
	private Boolean appointmentAvailabilitySlotTime11;
	
	@Column(name="appointmentavailabilityslottime12")
	private Boolean appointmentAvailabilitySlotTime12;

	@Override
	public String toString() {
		return "AppointmentAvailability [appointmentAvailabilityId=" + appointmentAvailabilityId
				+ ", appointmentAvailabilityDoctor=" + appointmentAvailabilityDoctor
				+ ", appointmentAvailabilitySlotDay=" + appointmentAvailabilitySlotDay
				+ ", appointmentAvailabilityDoctorType=" + appointmentAvailabilityDoctorType
				+ ", appointmentAvailabilityDoctorCity=" + appointmentAvailabilityDoctorCity
				+ ", appointmentAvailabilitySlotTime1=" + appointmentAvailabilitySlotTime1
				+ ", appointmentAvailabilitySlotTime2=" + appointmentAvailabilitySlotTime2
				+ ", appointmentAvailabilitySlotTime3=" + appointmentAvailabilitySlotTime3
				+ ", appointmentAvailabilitySlotTime4=" + appointmentAvailabilitySlotTime4
				+ ", appointmentAvailabilitySlotTime5=" + appointmentAvailabilitySlotTime5
				+ ", appointmentAvailabilitySlotTime6=" + appointmentAvailabilitySlotTime6
				+ ", appointmentAvailabilitySlotTime7=" + appointmentAvailabilitySlotTime7
				+ ", appointmentAvailabilitySlotTime8=" + appointmentAvailabilitySlotTime8
				+ ", appointmentAvailabilitySlotTime9=" + appointmentAvailabilitySlotTime9
				+ ", appointmentAvailabilitySlotTime10=" + appointmentAvailabilitySlotTime10
				+ ", appointmentAvailabilitySlotTime11=" + appointmentAvailabilitySlotTime11
				+ ", appointmentAvailabilitySlotTime12=" + appointmentAvailabilitySlotTime12 + "]";
	}

	public Integer getAppointmentAvailabilityDoctorType() {
		return appointmentAvailabilityDoctorType;
	}

	public void setAppointmentAvailabilityDoctorType(Integer appointmentAvailabilityDoctorType) {
		this.appointmentAvailabilityDoctorType = appointmentAvailabilityDoctorType;
	}

	public Integer getAppointmentAvailabilityDoctorCity() {
		return appointmentAvailabilityDoctorCity;
	}

	public void setAppointmentAvailabilityDoctorCity(Integer appointmentAvailabilityDoctorCity) {
		this.appointmentAvailabilityDoctorCity = appointmentAvailabilityDoctorCity;
	}

	public Integer getAppointmentAvailabilityId() {
		return appointmentAvailabilityId;
	}

	public void setAppointmentAvailabilityId(Integer appointmentAvailabilityId) {
		this.appointmentAvailabilityId = appointmentAvailabilityId;
	}

	public Integer getAppointmentAvailabilityDoctor() {
		return appointmentAvailabilityDoctor;
	}

	public void setAppointmentAvailabilityDoctor(Integer appointmentAvailabilityDoctor) {
		this.appointmentAvailabilityDoctor = appointmentAvailabilityDoctor;
	}

	public String getAppointmentAvailabilitySlotDay() {
		return appointmentAvailabilitySlotDay;
	}

	public void setAppointmentAvailabilitySlotDay(String appointmentAvailabilitySlotDay) {
		this.appointmentAvailabilitySlotDay = appointmentAvailabilitySlotDay;
	}

	public Boolean getAppointmentAvailabilitySlotTime1() {
		return appointmentAvailabilitySlotTime1;
	}

	public void setAppointmentAvailabilitySlotTime1(Boolean appointmentAvailabilitySlotTime1) {
		this.appointmentAvailabilitySlotTime1 = appointmentAvailabilitySlotTime1;
	}

	public Boolean getAppointmentAvailabilitySlotTime2() {
		return appointmentAvailabilitySlotTime2;
	}

	public void setAppointmentAvailabilitySlotTime2(Boolean appointmentAvailabilitySlotTime2) {
		this.appointmentAvailabilitySlotTime2 = appointmentAvailabilitySlotTime2;
	}

	public Boolean getAppointmentAvailabilitySlotTime3() {
		return appointmentAvailabilitySlotTime3;
	}

	public void setAppointmentAvailabilitySlotTime3(Boolean appointmentAvailabilitySlotTime3) {
		this.appointmentAvailabilitySlotTime3 = appointmentAvailabilitySlotTime3;
	}

	public Boolean getAppointmentAvailabilitySlotTime4() {
		return appointmentAvailabilitySlotTime4;
	}

	public void setAppointmentAvailabilitySlotTime4(Boolean appointmentAvailabilitySlotTime4) {
		this.appointmentAvailabilitySlotTime4 = appointmentAvailabilitySlotTime4;
	}

	public Boolean getAppointmentAvailabilitySlotTime5() {
		return appointmentAvailabilitySlotTime5;
	}

	public void setAppointmentAvailabilitySlotTime5(Boolean appointmentAvailabilitySlotTime5) {
		this.appointmentAvailabilitySlotTime5 = appointmentAvailabilitySlotTime5;
	}

	public Boolean getAppointmentAvailabilitySlotTime6() {
		return appointmentAvailabilitySlotTime6;
	}

	public void setAppointmentAvailabilitySlotTime6(Boolean appointmentAvailabilitySlotTime6) {
		this.appointmentAvailabilitySlotTime6 = appointmentAvailabilitySlotTime6;
	}

	public Boolean getAppointmentAvailabilitySlotTime7() {
		return appointmentAvailabilitySlotTime7;
	}

	public void setAppointmentAvailabilitySlotTime7(Boolean appointmentAvailabilitySlotTime7) {
		this.appointmentAvailabilitySlotTime7 = appointmentAvailabilitySlotTime7;
	}

	public Boolean getAppointmentAvailabilitySlotTime8() {
		return appointmentAvailabilitySlotTime8;
	}

	public void setAppointmentAvailabilitySlotTime8(Boolean appointmentAvailabilitySlotTime8) {
		this.appointmentAvailabilitySlotTime8 = appointmentAvailabilitySlotTime8;
	}

	public Boolean getAppointmentAvailabilitySlotTime9() {
		return appointmentAvailabilitySlotTime9;
	}

	public void setAppointmentAvailabilitySlotTime9(Boolean appointmentAvailabilitySlotTime9) {
		this.appointmentAvailabilitySlotTime9 = appointmentAvailabilitySlotTime9;
	}

	public Boolean getAppointmentAvailabilitySlotTime10() {
		return appointmentAvailabilitySlotTime10;
	}

	public void setAppointmentAvailabilitySlotTime10(Boolean appointmentAvailabilitySlotTime10) {
		this.appointmentAvailabilitySlotTime10 = appointmentAvailabilitySlotTime10;
	}

	public Boolean getAppointmentAvailabilitySlotTime11() {
		return appointmentAvailabilitySlotTime11;
	}

	public void setAppointmentAvailabilitySlotTime11(Boolean appointmentAvailabilitySlotTime11) {
		this.appointmentAvailabilitySlotTime11 = appointmentAvailabilitySlotTime11;
	}

	public Boolean getAppointmentAvailabilitySlotTime12() {
		return appointmentAvailabilitySlotTime12;
	}

	public void setAppointmentAvailabilitySlotTime12(Boolean appointmentAvailabilitySlotTime12) {
		this.appointmentAvailabilitySlotTime12 = appointmentAvailabilitySlotTime12;
	}

	

}
