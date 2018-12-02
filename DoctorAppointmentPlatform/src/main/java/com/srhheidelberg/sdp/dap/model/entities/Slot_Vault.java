/**
 * @author Aishwarya
 *
 */
package com.srhheidelberg.sdp.dap.model.entities;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Slot_Vault")
public class Slot_Vault {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer SlotVault_Id;
	private String SlotName;
	private Time SlotStartTime;
	private Time slotEndTime;
	
	public Integer getSlotVault_Id() {
		return SlotVault_Id;
	}
	public void setSlotVault_Id(Integer slotVault_Id) {
		SlotVault_Id = slotVault_Id;
	}
	public String getSlotName() {
		return SlotName;
	}
	public void setSlotName(String slotName) {
		SlotName = slotName;
	}
	public Time getSlotStartTime() {
		return SlotStartTime;
	}
	public void setSlotStartTime(Time slotStartTime) {
		SlotStartTime = slotStartTime;
	}
	public Time getSlotEndTime() {
		return slotEndTime;
	}
	public void setSlotEndTime(Time slotEndTime) {
		this.slotEndTime = slotEndTime;
	}
	
	@Override
	public String toString() {
		return "SlotVault [SlotVault_Id=" + SlotVault_Id + ", SlotName=" + SlotName + ", SlotStartTime=" + SlotStartTime
				+ ", slotEndTime=" + slotEndTime + "]";
	}

}
