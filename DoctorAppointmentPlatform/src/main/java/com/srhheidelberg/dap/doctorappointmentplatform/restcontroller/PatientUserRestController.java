package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.PatientUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.PatientUser;

@RestController
@RequestMapping("/cityvault")
public class PatientUserRestController {
	
	@Autowired
	PatientUserDAO patientUserDAO;
	
	@GetMapping("/patientusers")
	public List<PatientUser> getAllPatients() {
		return patientUserDAO.findAll();
	}
	
	@GetMapping("/patientuserlogin/{patientEmail}")
	public PatientUser getPatientUserByEmail(@PathVariable(value="patientEmail") String patientEmail) {
		return patientUserDAO.findByPatientEmail(patientEmail);
	}

}
