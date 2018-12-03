package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.AppointmentAvailabilityRepository;

@Service
public class AppointmentAvailabilityDAO {
	
	@Autowired
	AppointmentAvailabilityRepository appointmentAvailabilityRepository;
	
	public List<AppointmentAvailability> findAll() {
		return appointmentAvailabilityRepository.findAll();
	}

}
