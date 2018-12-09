package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.SlotVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.SlotVault;

@RestController
@RequestMapping("/cityvault")
public class SlotVaultRestController {

	@Autowired
	SlotVaultDAO slotVaultDAO;
	
	@GetMapping("/slots")
	public List<SlotVault> getAllSlots(ModelMap modelMap) {
		return slotVaultDAO.findAll();
	}
}
