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
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/updatedoctor/")
	public DoctorUser updateDoctor(@Valid @RequestBody DoctorUser doctorUser) {
		return doctorUserDAO.updateDoctor(doctorUser);
	}
	
	@GetMapping("/availabledoctors/{selectedCity}/{selectedDoctorType}/{selectedSlot}/{patientUserId}/{selectedDate}")
	public List<DoctorUser> getAvailableDoctors(ModelMap modelMap, 
			@PathVariable Integer selectedCity, 
			@PathVariable Integer selectedDoctorType, 
			@PathVariable Integer selectedSlot,
			@PathVariable Integer patientUserId,
			@PathVariable Date selectedDate) {
		
		Calendar cal = Calendar.getInstance();
		Date todaysDate = cal.getTime();//
		//System.out.print(selectedDate);
		return doctorUserDAO.getAvailableDoctors(selectedCity, selectedDoctorType, selectedSlot, selectedDate, patientUserId);
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
	
	@GetMapping("/doctorusers")
	public List<DoctorUser> getAll() {
		return doctorUserDAO.findAll();
	}
	
	@GetMapping("/doctorusers/{doctorid}")
	public DoctorUser findOne(@PathVariable(value="doctorid") Integer doctorId) {
		return doctorUserDAO.findOne(doctorId);
	}

}
