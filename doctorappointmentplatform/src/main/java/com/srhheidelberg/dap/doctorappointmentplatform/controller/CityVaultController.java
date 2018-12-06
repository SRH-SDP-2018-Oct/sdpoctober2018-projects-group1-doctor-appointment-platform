package com.srhheidelberg.dap.doctorappointmentplatform.controller;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.AppointmentBookingDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.dao.CityVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.dao.DoctorTypeVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.dao.DoctorUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.dao.PatientUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.dao.SlotVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;
import com.srhheidelberg.dap.doctorappointmentplatform.model.CityVault;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorTypeVault;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;
import com.srhheidelberg.dap.doctorappointmentplatform.model.PatientUser;
import com.srhheidelberg.dap.doctorappointmentplatform.model.SlotVault;

@RestController
@RequestMapping("/cityvault")
public class CityVaultController {
	
	@Autowired
	CityVaultDAO cityVaultDAO;
	
	@Autowired
	DoctorTypeVaultDAO doctorTypeVaultDAO;
	
	@Autowired
	SlotVaultDAO slotVaultDAO;
	
	@Autowired
	DoctorUserDAO doctorUserDAO;
	
	@Autowired
	PatientUserDAO patientUserDAO;
	
	@Autowired
	AppointmentBookingDAO appointmentBookingDAO;
	
	@PostMapping("/cities")
	public CityVault createCity(@Valid @RequestBody CityVault city) {
		return cityVaultDAO.save(city);
	}
	
	@GetMapping("/cities")
	public List<CityVault> getAllEmployees(ModelMap modelMap) {
		return cityVaultDAO.findAll();
	}
	
	@GetMapping("/doctortypes")
	public List<DoctorTypeVault> getAllDoctorTypes(ModelMap modelMap) {
		return doctorTypeVaultDAO.findAll();
	}
	
	@GetMapping("/slots")
	public List<SlotVault> getAllSlots(ModelMap modelMap) {
		return slotVaultDAO.findAll();
	}
	
	@GetMapping("/availabledoctors/{selectedCity}/{selectedDoctorType}/{selectedSlot}")
	public List<DoctorUser> getAvailableDoctors(ModelMap modelMap, 
			@PathVariable Integer selectedCity, 
			@PathVariable Integer selectedDoctorType, 
			@PathVariable Integer selectedSlot) {
		
		Calendar cal = Calendar.getInstance();
		Long todaysDate = cal.getTime().getTime();
		return doctorUserDAO.getAvailableDoctors(selectedCity, selectedDoctorType, selectedSlot, todaysDate);
	}
	
	@GetMapping("/patientupcomingappointments")
	public List<AppointmentBooking> getPatientUpcomingAppointments() {
		return appointmentBookingDAO.findAll();
	}
	
	@GetMapping("/patientpreviousappointments")
	public List<AppointmentBooking> getPatientPreviousAppointments() {
		return appointmentBookingDAO.findAll();
	}
	
	@GetMapping("/patientfeebackremaingappointments")
	public List<AppointmentBooking> getPatientFeedbackRemainingAppointments() {
		return appointmentBookingDAO.findAll();
	}
	
	@GetMapping("/doctorusers")
	public List<DoctorUser> getAllDoctors() {
		return doctorUserDAO.findAll();
	}
	
	@GetMapping("/patientusers")
	public List<PatientUser> getAllPatients() {
		return patientUserDAO.findAll();
	}
	
	@GetMapping("/cities/{id}")
	public Optional<CityVault> getCityById(@PathVariable(value="id") Integer cityId) {
		return cityVaultDAO.findOne(cityId);
	}
}
