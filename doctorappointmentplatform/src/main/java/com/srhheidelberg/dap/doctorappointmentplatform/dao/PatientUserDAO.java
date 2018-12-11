package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.PatientUserIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.PatientUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.PatientUserRepository;

@Service
public class PatientUserDAO implements PatientUserIDAO {

	@Autowired
	PatientUserRepository patientUserRepository;
	
	@Override
	public List<PatientUser> findAll() {
		return patientUserRepository.findAll();
	}
	
	@Override
	public PatientUser getById(Integer id) {
		return patientUserRepository.getOne(id);
	}
	
	@Override
	public PatientUser findByPatientEmail(String patientEmail) {
		return patientUserRepository.findByPatientEmail(patientEmail);
	}
	
	@Override
	public PatientUser save(PatientUser patientUser) {
		return patientUserRepository.save(patientUser);
	}
}
