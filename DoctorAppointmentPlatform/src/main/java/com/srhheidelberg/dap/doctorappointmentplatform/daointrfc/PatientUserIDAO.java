package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;

import com.srhheidelberg.dap.doctorappointmentplatform.model.PatientUser;

public interface PatientUserIDAO {

	List<PatientUser> findAll();

	PatientUser getById(Integer id);

	PatientUser findByPatientEmail(String patientEmail);

	PatientUser save(PatientUser patientUser);

}
