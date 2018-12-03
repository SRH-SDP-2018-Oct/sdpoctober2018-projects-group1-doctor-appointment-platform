package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorTypeVault;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.DoctorTypeVaultRepository;

@Service
public class DoctorTypeVaultDAO {
	
	@Autowired
	DoctorTypeVaultRepository doctorTypeVaultRepository;
	
	public List<DoctorTypeVault> findAll() {
		return doctorTypeVaultRepository.findAll();
	}
	
	public Optional<DoctorTypeVault> findById(Integer id) {
		return doctorTypeVaultRepository.findById(id);
	}

}
