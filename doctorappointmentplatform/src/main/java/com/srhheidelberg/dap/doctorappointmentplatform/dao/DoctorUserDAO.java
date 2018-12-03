package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.DoctorUserRepository;

@Service
public class DoctorUserDAO {
	
	@Autowired
	DoctorUserRepository doctorUserRepository;
	
	public List<DoctorUser> findAll() {
		return doctorUserRepository.findAll();
	}
	
	public void save(DoctorUser doctorUser) {
		doctorUserRepository.save(doctorUser);
	}

}
