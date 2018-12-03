package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.PatientUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.PatientUserRepository;

@Service
public class PatientUserDAO {

	@Autowired
	PatientUserRepository patientUserRepository;
	
	public PatientUser getById(Integer id) {
		return patientUserRepository.getOne(id);
	}
}
