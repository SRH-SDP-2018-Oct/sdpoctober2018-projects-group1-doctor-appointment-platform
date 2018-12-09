package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.DoctorTypeVaultIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorTypeVault;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.DoctorTypeVaultRepository;

@Service
public class DoctorTypeVaultDAO implements DoctorTypeVaultIDAO {
	
	@Autowired
	DoctorTypeVaultRepository doctorTypeVaultRepository;
	
	@Override
	public List<DoctorTypeVault> findAll() {
		return doctorTypeVaultRepository.findAll();
	}
	
	@Override
	public Optional<DoctorTypeVault> findById(Integer id) {
		return doctorTypeVaultRepository.findById(id);
	}

}
