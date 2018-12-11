package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="slotvault")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SlotVault {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="slotid")
	private Integer slotId;
	
	@Column(name="slotname")
	private String slotName;
	
	@Column(name="slotstarttime")
	private String slotStartTime;
	
	@Column(name="slotendtime")
	private String slotEndTime;

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	public String getSlotStartTime() {
		return slotStartTime;
	}

	public void setSlotStartTime(String slotStartTime) {
		this.slotStartTime = slotStartTime;
	}

	public String getSlotEndTime() {
		return slotEndTime;
	}

	public void setSlotEndTime(String slotEndTime) {
		this.slotEndTime = slotEndTime;
	}

	@Override
	public String toString() {
		return "SlotVault [slotId=" + slotId + ", slotName=" + slotName + ", slotStartTime=" + slotStartTime
				+ ", slotEndTime=" + slotEndTime + "]";
	}
	
}
