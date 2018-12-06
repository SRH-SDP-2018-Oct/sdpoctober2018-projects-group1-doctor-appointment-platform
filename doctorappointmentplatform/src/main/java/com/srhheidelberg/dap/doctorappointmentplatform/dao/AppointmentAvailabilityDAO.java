package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.ApptAvailabilityRepository;

@Service
public class AppointmentAvailabilityDAO {
	
	@Autowired
	ApptAvailabilityRepository appointmentAvailabilityRepository;
	
	public List<AppointmentAvailability> findAll() {
		return appointmentAvailabilityRepository.findAll();
	}

}
