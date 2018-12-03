package com.srhheidelberg.dap.doctorappointmentplatform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="slotvault")
public class SlotVault {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="slotid")
	private Integer slotId;
	
	@Column(name="slotname")
	private Integer slotName;
	
	@Column(name="slotstarttime")
	private Integer slotStartTime;
	
	@Column(name="slotendtime")
	private Integer slotEndTime;

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	public Integer getSlotName() {
		return slotName;
	}

	public void setSlotName(Integer slotName) {
		this.slotName = slotName;
	}

	public Integer getSlotStartTime() {
		return slotStartTime;
	}

	public void setSlotStartTime(Integer slotStartTime) {
		this.slotStartTime = slotStartTime;
	}

	public Integer getSlotEndTime() {
		return slotEndTime;
	}

	public void setSlotEndTime(Integer slotEndTime) {
		this.slotEndTime = slotEndTime;
	}

	@Override
	public String toString() {
		return "SlotVault [slotId=" + slotId + ", slotName=" + slotName + ", slotStartTime=" + slotStartTime
				+ ", slotEndTime=" + slotEndTime + "]";
	}
	
}
