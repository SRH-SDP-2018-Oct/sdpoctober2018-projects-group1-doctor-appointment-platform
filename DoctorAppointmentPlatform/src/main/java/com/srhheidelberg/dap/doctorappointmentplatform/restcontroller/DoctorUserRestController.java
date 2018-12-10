package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.DoctorUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;

@RestController
@RequestMapping("/cityvault")
public class DoctorUserRestController {
	
	@Autowired
	DoctorUserDAO doctorUserDAO;
	
	@GetMapping("/availabledoctors/{selectedCity}/{selectedDoctorType}/{selectedSlot}/{selectedDate}")
	public List<DoctorUser> getAvailableDoctors(ModelMap modelMap, 
			@PathVariable Integer selectedCity, 
			@PathVariable Integer selectedDoctorType, 
			@PathVariable Integer selectedSlot,
			@PathVariable Date selectedDate) {
		
		Calendar cal = Calendar.getInstance();
		Date todaysDate = cal.getTime();//
		return doctorUserDAO.getAvailableDoctors(selectedCity, selectedDoctorType, selectedSlot, selectedDate);
	}
	
	@GetMapping("/doctoruserlogin/{doctorEmail}")
	public DoctorUser getDoctorUserByEmail(@PathVariable(value="doctorEmail") String doctorEmail) {
		System.out.println("DocEmail ...... " + doctorUserDAO.findByDoctorEmail(doctorEmail));
		return doctorUserDAO.findByDoctorEmail(doctorEmail);
	}
	
	@PostMapping("/doctoruserregistration")
	public DoctorUser createDoctorUser(@Valid @RequestBody DoctorUser doctorUser) {
		System.out.println("Doctor User Create: " + doctorUser);
		return doctorUserDAO.save(doctorUser);
	}

}
