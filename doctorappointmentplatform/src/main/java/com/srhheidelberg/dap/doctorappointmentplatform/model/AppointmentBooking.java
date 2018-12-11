package com.srhheidelberg.dap.doctorappointmentplatform.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="appointmentbooking")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AppointmentBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="appointmentbookingid")
	private Integer appointmentBookingId;
	
	@Column(name="appointmentbookingslotdate")
	private Date appointmentBookingSlotDate;
	
	@Column(name="appointmentbookingslotday")
	private String appointmentBookingSlotDay;
	
	@Column(name="appointmentbookingslottime")
	private Integer appointmentBookingSlotTime;
	
	@Column(name="appointmentbookingdoctor")
	private Integer appointmentBookingDoctor;
	
	@Column(name="appointmentbookingpatient")
	private Integer appointmentBookingPatient;
	
	@Column(name="appointmentbookingtreatment")
	private String appointmentBookingTreatment;
	
	@Column(name="appointmentbookingprescription")
	private String appointmentBookingPrescription;
	
	@Column(name="appointmentbookingrating")
	private Integer appointmentBookingRating;
	
	@Column(name="appointmentbookingfeedback")
	private String appointmentBookingFeedback;
	
	@Column(name="appointmentbookingstatus")
	private String appointmentBookingStatus;
	
	@Column(name="appointmentbookingdoctortype")
	private Integer appointmentBookingDoctorType;

	@Column(name="appointmentbookingdoctortcity")
	private Integer appointmentBookingDoctorCity;

	@Override
	public String toString() {
		return "AppointmentBooking [appointmentBookingId=" + appointmentBookingId + ", appointmentBookingSlotDate="
				+ appointmentBookingSlotDate + ", appointmentBookingSlotDay=" + appointmentBookingSlotDay
				+ ", appointmentBookingSlotTime=" + appointmentBookingSlotTime + ", appointmentBookingDoctor="
				+ appointmentBookingDoctor + ", appointmentBookingPatient=" + appointmentBookingPatient
				+ ", appointmentBookingTreatment=" + appointmentBookingTreatment + ", appointmentBookingPrescription="
				+ appointmentBookingPrescription + ", appointmentBookingRating=" + appointmentBookingRating
				+ ", appointmentBookingFeedback=" + appointmentBookingFeedback + ", appointmentBookingStatus="
				+ appointmentBookingStatus + ", appointmentBookingDoctorType=" + appointmentBookingDoctorType
				+ ", appointmentBookingDoctorCity=" + appointmentBookingDoctorCity + "]";
	}

	public Integer getAppointmentBookingDoctorCity() {
		return appointmentBookingDoctorCity;
	}

	public void setAppointmentBookingDoctorCity(Integer appointmentBookingDoctorCity) {
		this.appointmentBookingDoctorCity = appointmentBookingDoctorCity;
	}

	public Integer getAppointmentBookingDoctorType() {
		return appointmentBookingDoctorType;
	}

	public void setAppointmentBookingDoctorType(Integer appointmentBookingDoctorType) {
		this.appointmentBookingDoctorType = appointmentBookingDoctorType;
	}

	public Integer getAppointmentBookingId() {
		return appointmentBookingId;
	}

	public void setAppointmentBookingId(Integer appointmentBookingId) {
		this.appointmentBookingId = appointmentBookingId;
	}

	public Date getAppointmentBookingSlotDate() {
		return appointmentBookingSlotDate;
	}

	public void setAppointmentBookingSlotDate(Date appointmentBookingSlotDate) {
		this.appointmentBookingSlotDate = appointmentBookingSlotDate;
	}

	public String getAppointmentBookingSlotDay() {
		return appointmentBookingSlotDay;
	}

	public void setAppointmentBookingSlotDay(String appointmentBookingSlotDay) {
		this.appointmentBookingSlotDay = appointmentBookingSlotDay;
	}

	public Integer getAppointmentBookingSlotTime() {
		return appointmentBookingSlotTime;
	}

	public void setAppointmentBookingSlotTime(Integer appointmentBookingSlotTime) {
		this.appointmentBookingSlotTime = appointmentBookingSlotTime;
	}

	public Integer getAppointmentBookingDoctor() {
		return appointmentBookingDoctor;
	}

	public void setAppointmentBookingDoctor(Integer appointmentBookingDoctor) {
		this.appointmentBookingDoctor = appointmentBookingDoctor;
	}

	public Integer getAppointmentBookingPatient() {
		return appointmentBookingPatient;
	}

	public void setAppointmentBookingPatient(Integer appointmentBookingPatient) {
		this.appointmentBookingPatient = appointmentBookingPatient;
	}

	public String getAppointmentBookingTreatment() {
		return appointmentBookingTreatment;
	}

	public void setAppointmentBookingTreatment(String appointmentBookingTreatment) {
		this.appointmentBookingTreatment = appointmentBookingTreatment;
	}

	public String getAppointmentBookingPrescription() {
		return appointmentBookingPrescription;
	}

	public void setAppointmentBookingPrescription(String appointmentBookingPrescription) {
		this.appointmentBookingPrescription = appointmentBookingPrescription;
	}

	public Integer getAppointmentBookingRating() {
		return appointmentBookingRating;
	}

	public void setAppointmentBookingRating(Integer appointmentBookingRating) {
		this.appointmentBookingRating = appointmentBookingRating;
	}

	public String getAppointmentBookingFeedback() {
		return appointmentBookingFeedback;
	}

	public void setAppointmentBookingFeedback(String appointmentBookingFeedback) {
		this.appointmentBookingFeedback = appointmentBookingFeedback;
	}

	public String getAppointmentBookingStatus() {
		return appointmentBookingStatus;
	}

	public void setAppointmentBookingStatus(String appointmentBookingStatus) {
		this.appointmentBookingStatus = appointmentBookingStatus;
	}
	
}
