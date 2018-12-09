package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.SlotVaultIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.SlotVault;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.SlotVaultRepository;

@Service
public class SlotVaultDAO implements SlotVaultIDAO {
	
	@Autowired
	SlotVaultRepository slotVaultRepository;
	
	@Override
	public List<SlotVault> findAll() {
		return slotVaultRepository.findAll();
	}

}
