package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.PatientUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.PatientUserRepository;

@Service
public class PatientUserDAO {

	@Autowired
	PatientUserRepository patientUserRepository;
	
	public List<PatientUser> findAll() {
		return patientUserRepository.findAll();
	}
	
	public PatientUser getById(Integer id) {
		return patientUserRepository.getOne(id);
	}
	
	public PatientUser findByPatientEmail(String patientEmail) {
		return patientUserRepository.findByPatientEmail(patientEmail);
	}
}
