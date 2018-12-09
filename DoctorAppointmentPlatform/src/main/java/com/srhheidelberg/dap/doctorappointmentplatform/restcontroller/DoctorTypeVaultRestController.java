package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.DoctorTypeVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorTypeVault;

@RestController
@RequestMapping("/cityvault")
public class DoctorTypeVaultRestController {

	@Autowired
	DoctorTypeVaultDAO doctorTypeVaultDAO;
	
	@GetMapping("/doctortypes")
	public List<DoctorTypeVault> getAllDoctorTypes(ModelMap modelMap) {
		return doctorTypeVaultDAO.findAll();
	}
}
