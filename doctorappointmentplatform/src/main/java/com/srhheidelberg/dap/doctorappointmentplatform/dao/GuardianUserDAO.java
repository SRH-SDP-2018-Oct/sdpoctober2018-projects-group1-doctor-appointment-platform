package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.GuardianUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.GuardianUserRepository;

@Service
public class GuardianUserDAO {

	@Autowired
	GuardianUserRepository guardianUserRepository;
	
	public void save(GuardianUser guardianUser) {
		guardianUserRepository.save(guardianUser);
	}
	
	public GuardianUser findById(Integer id) {
		return guardianUserRepository.getOne(id);
	}
}
