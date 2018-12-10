package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;

public interface AppointmentAvailabilityIDAO {
	
	List<AppointmentAvailability> findAll();

	List<AppointmentAvailability> saveForRegistration(List<AppointmentAvailability> appointmentAvailabilities);
}
