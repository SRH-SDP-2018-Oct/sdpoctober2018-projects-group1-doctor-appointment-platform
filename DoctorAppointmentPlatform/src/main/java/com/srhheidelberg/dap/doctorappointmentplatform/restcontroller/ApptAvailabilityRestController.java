package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.AppointmentAvailabilityDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;

@RestController
@RequestMapping("/cityvault")
public class ApptAvailabilityRestController {
	
	@Autowired
	AppointmentAvailabilityDAO appointmentAvailabilityDAO;
	
	//AppointmentAvailability
	@PostMapping("/doctoruserregistration/availability")
	public List<AppointmentAvailability> createAppointmentBooking(@Valid @RequestBody List<AppointmentAvailability> appointmentAvailabilities) {
		System.out.println("Booking: " + appointmentAvailabilities);
		return appointmentAvailabilityDAO.saveForRegistration(appointmentAvailabilities);
	}

}
