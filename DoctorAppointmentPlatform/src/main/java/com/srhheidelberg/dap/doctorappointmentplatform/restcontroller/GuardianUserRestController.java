package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.GuardianUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.GuardianUser;

@RestController
@RequestMapping("/cityvault")
public class GuardianUserRestController {

	@Autowired
	GuardianUserDAO guardianUserDAO;
	
	@PostMapping("/guardianuserregistration")
	public GuardianUser save(@Valid @RequestBody GuardianUser guardianUser) {
		System.out.println("Guardian Create" + guardianUser);
		return guardianUserDAO.save(guardianUser);
	}
}
