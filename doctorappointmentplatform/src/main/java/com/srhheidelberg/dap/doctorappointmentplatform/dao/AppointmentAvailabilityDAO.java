package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.AppointmentAvailabilityIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.ApptAvailabilityRepository;

@Service
public class AppointmentAvailabilityDAO implements AppointmentAvailabilityIDAO {

	@Autowired
	ApptAvailabilityRepository appointmentAvailabilityRepository;

	@Override
	public List<AppointmentAvailability> findAll() {
		return appointmentAvailabilityRepository.findAll();
	}

	@Override
	public List<AppointmentAvailability> saveForRegistration(List<AppointmentAvailability> appointmentAvailabilities) {
		
		return appointmentAvailabilityRepository.saveAll(appointmentAvailabilities);
	}
	
}
