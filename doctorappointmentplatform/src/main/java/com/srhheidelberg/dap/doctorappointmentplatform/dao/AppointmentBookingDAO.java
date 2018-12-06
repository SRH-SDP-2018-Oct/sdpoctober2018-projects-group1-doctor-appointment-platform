package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.ApptBookingRepository;

@Service
public class AppointmentBookingDAO {
	
	@Autowired
	ApptBookingRepository appointmentBookingRepository;
	
	public AppointmentBooking getById(Integer id) {
		return appointmentBookingRepository.getOne(id);
	}
	
	public List<AppointmentBooking> findAll() {
		return appointmentBookingRepository.findAll();
	}
	
}
