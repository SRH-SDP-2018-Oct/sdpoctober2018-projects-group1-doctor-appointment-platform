/**
 * @author Sagar
 *
 */
package com.srhheidelberg.sdp.dap.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Appointment_Availablity")
public class Appointment_Availability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer AppointmentAvailablity_Id;
	private Integer Doctor_Id;
	private String SlotDay;
	private Integer SlotTime1;
	private Integer SlotTime2;
	private Integer SlotTime3;
	private Integer SlotTime4;
	private Integer SlotTime5;
	private Integer SlotTime6;
	private Integer SlotTime7;
	private Integer SlotTime8;
	private Integer SlotTime9;
	private Integer SlotTime10;
	private Integer SlotTime11;
	private Integer SlotTime12;
	
	public Integer getAppointmentAvailablity_Id() {
		return AppointmentAvailablity_Id;
	}
	public void setAppointmentAvailablity_Id(Integer appointmentAvailablity_Id) {
		AppointmentAvailablity_Id = appointmentAvailablity_Id;
	}
	public Integer getDoctor_Id() {
		return Doctor_Id;
	}
	public void setDoctor_Id(Integer doctor_Id) {
		Doctor_Id = doctor_Id;
	}
	public String getSlotDay() {
		return SlotDay;
	}
	public void setSlotDay(String slotDay) {
		SlotDay = slotDay;
	}
	public Integer getSlotTime1() {
		return SlotTime1;
	}
	public void setSlotTime1(Integer slotTime1) {
		SlotTime1 = slotTime1;
	}
	public Integer getSlotTime2() {
		return SlotTime2;
	}
	public void setSlotTime2(Integer slotTime2) {
		SlotTime2 = slotTime2;
	}
	public Integer getSlotTime3() {
		return SlotTime3;
	}
	public void setSlotTime3(Integer slotTime3) {
		SlotTime3 = slotTime3;
	}
	public Integer getSlotTime4() {
		return SlotTime4;
	}
	public void setSlotTime4(Integer slotTime4) {
		SlotTime4 = slotTime4;
	}
	public Integer getSlotTime5() {
		return SlotTime5;
	}
	public void setSlotTime5(Integer slotTime5) {
		SlotTime5 = slotTime5;
	}
	public Integer getSlotTime6() {
		return SlotTime6;
	}
	public void setSlotTime6(Integer slotTime6) {
		SlotTime6 = slotTime6;
	}
	public Integer getSlotTime7() {
		return SlotTime7;
	}
	public void setSlotTime7(Integer slotTime7) {
		SlotTime7 = slotTime7;
	}
	public Integer getSlotTime8() {
		return SlotTime8;
	}
	public void setSlotTime8(Integer slotTime8) {
		SlotTime8 = slotTime8;
	}
	public Integer getSlotTime9() {
		return SlotTime9;
	}
	public void setSlotTime9(Integer slotTime9) {
		SlotTime9 = slotTime9;
	}
	public Integer getSlotTime10() {
		return SlotTime10;
	}
	public void setSlotTime10(Integer slotTime10) {
		SlotTime10 = slotTime10;
	}
	public Integer getSlotTime11() {
		return SlotTime11;
	}
	public void setSlotTime11(Integer slotTime11) {
		SlotTime11 = slotTime11;
	}
	public Integer getSlotTime12() {
		return SlotTime12;
	}
	public void setSlotTime12(Integer slotTime12) {
		SlotTime12 = slotTime12;
	}
	
	@Override
	public String toString() {
		return "AppointmentAvailability [AppointmentAvailablity_Id=" + AppointmentAvailablity_Id + ", Doctor_Id="
				+ Doctor_Id + ", SlotDay=" + SlotDay + ", SlotTime1=" + SlotTime1 + ", SlotTime2=" + SlotTime2
				+ ", SlotTime3=" + SlotTime3 + ", SlotTime4=" + SlotTime4 + ", SlotTime5=" + SlotTime5 + ", SlotTime6="
				+ SlotTime6 + ", SlotTime7=" + SlotTime7 + ", SlotTime8=" + SlotTime8 + ", SlotTime9=" + SlotTime9
				+ ", SlotTime10=" + SlotTime10 + ", SlotTime11=" + SlotTime11 + ", SlotTime12=" + SlotTime12 + "]";
	}
	
}
