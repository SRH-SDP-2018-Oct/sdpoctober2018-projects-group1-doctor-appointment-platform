package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.DoctorUserIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.DoctorUserRepository;

@Service
public class DoctorUserDAO implements DoctorUserIDAO {
	
	@Autowired
	DoctorUserRepository doctorUserRepository;
	
	@Override
	public List<DoctorUser> findAll() {
		return doctorUserRepository.findAll();
	}
	
	@Override
	public void save(DoctorUser doctorUser) {
		doctorUserRepository.save(doctorUser);
	}
	
	@Override
	public List<DoctorUser> getAvailableDoctors(Integer selectedCity, Integer selectedDoctorType, Integer selectedSlot, Long todaysDate) {
		
		return doctorUserRepository.findAll();
	}

}
