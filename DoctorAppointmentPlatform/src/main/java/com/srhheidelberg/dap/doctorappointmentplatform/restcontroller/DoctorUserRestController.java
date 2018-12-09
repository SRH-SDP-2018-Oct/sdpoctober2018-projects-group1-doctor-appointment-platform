package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.DoctorUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;

@RestController
@RequestMapping("/cityvault")
public class DoctorUserRestController {
	
	@Autowired
	DoctorUserDAO doctorUserDAO;
	
	@GetMapping("/availabledoctors/{selectedCity}/{selectedDoctorType}/{selectedSlot}")
	public List<DoctorUser> getAvailableDoctors(ModelMap modelMap, 
			@PathVariable Integer selectedCity, 
			@PathVariable Integer selectedDoctorType, 
			@PathVariable Integer selectedSlot) {
		
		Calendar cal = Calendar.getInstance();
		Long todaysDate = cal.getTime().getTime();
		return doctorUserDAO.getAvailableDoctors(selectedCity, selectedDoctorType, selectedSlot, todaysDate);
	}
	
	@GetMapping("/doctorusers")
	public List<DoctorUser> getAllDoctors() {
		return doctorUserDAO.findAll();
	}

}
