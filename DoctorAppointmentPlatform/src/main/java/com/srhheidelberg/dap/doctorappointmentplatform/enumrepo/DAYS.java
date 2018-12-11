package com.srhheidelberg.dap.doctorappointmentplatform.enumrepo;

public enum DAYS {
	
	Sunday,
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday;
	
	int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
