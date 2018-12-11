package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.GuardianUserIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.GuardianUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.GuardianUserRepository;

@Service
public class GuardianUserDAO implements GuardianUserIDAO {

	@Autowired
	GuardianUserRepository guardianUserRepository;
	
	@Override
	public GuardianUser save(GuardianUser guardianUser) {
		return guardianUserRepository.save(guardianUser);
	}
	
	@Override
	public GuardianUser findById(Integer id) {
		return guardianUserRepository.getOne(id);
	}
}
