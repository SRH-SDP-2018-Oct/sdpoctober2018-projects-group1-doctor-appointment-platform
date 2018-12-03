package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.SlotVault;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.SlotVaultRepository;

@Service
public class SlotVaultDAO {
	
	@Autowired
	SlotVaultRepository slotVaultRepository;
	
	public List<SlotVault> findAll() {
		return slotVaultRepository.findAll();
	}

}
