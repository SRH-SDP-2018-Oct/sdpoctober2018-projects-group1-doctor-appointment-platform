package com.srhheidelberg.dap.doctorappointmentplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srhheidelberg.dap.doctorappointmentplatform.model.PatientUser;

public interface PatientUserRepository extends JpaRepository<PatientUser, Integer> {

	PatientUser findByPatientEmail(String email);
	
}
