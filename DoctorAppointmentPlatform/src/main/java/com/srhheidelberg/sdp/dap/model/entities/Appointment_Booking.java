/**
 * @author Aishwarya
 * 
 */
package com.srhheidelberg.sdp.dap.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment_Booking")
public class Appointment_Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AppointmentBookingId;
	private String SlotDate;
	private String SlotDay;
	private Integer Doctor_Id;
	private Integer Patient_Id;
	private String TreatmentDescription;
	private String PrescriptionDescription;
	private String Feedback;
	private String Status;
	private Integer Rating;
	
	public Integer getAppointmentBookingId() {
		return AppointmentBookingId;
	}
	public void setAppointmentBookingId(Integer appointmentBookingId) {
		AppointmentBookingId = appointmentBookingId;
	}
	public String getSlotDate() {
		return SlotDate;
	}
	public void setSlotDate(String slotDate) {
		SlotDate = slotDate;
	}
	public String getSlotDay() {
		return SlotDay;
	}
	public void setSlotDay(String slotDay) {
		SlotDay = slotDay;
	}
	public Integer getDoctor_Id() {
		return Doctor_Id;
	}
	public void setDoctor_Id(Integer doctor_Id) {
		Doctor_Id = doctor_Id;
	}
	public Integer getPatient_Id() {
		return Patient_Id;
	}
	public void setPatient_Id(Integer patient_Id) {
		Patient_Id = patient_Id;
	}
	public String getTreatmentDescription() {
		return TreatmentDescription;
	}
	public void setTreatmentDescription(String treatmentDescription) {
		TreatmentDescription = treatmentDescription;
	}
	public String getPrescriptionDescription() {
		return PrescriptionDescription;
	}
	public void setPrescriptionDescription(String prescriptionDescription) {
		PrescriptionDescription = prescriptionDescription;
	}
	public Integer getRating() {
		return Rating;
	}
	public void setRating(Integer rating) {
		Rating = rating;
	}
	public String getFeedback() {
		return Feedback;
	}
	public void setFeedback(String feedback) {
		Feedback = feedback;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	@Override
	public String toString() {
		return "AppointmentBooking [AppointmentBookingId=" + AppointmentBookingId + ", SlotDate=" + SlotDate
				+ ", SlotDay=" + SlotDay + ", Doctor_Id=" + Doctor_Id + ", Patient_Id=" + Patient_Id
				+ ", TreatmentDescription=" + TreatmentDescription + ", PrescriptionDescription="
				+ PrescriptionDescription + ", Rating=" + Rating + ", Feedback=" + Feedback + ", Status=" + Status
				+ "]";
	}
	
}
