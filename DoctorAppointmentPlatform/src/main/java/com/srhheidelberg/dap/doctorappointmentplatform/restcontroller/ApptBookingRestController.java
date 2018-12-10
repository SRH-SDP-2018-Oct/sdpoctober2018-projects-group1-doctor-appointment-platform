package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.AppointmentBookingDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;
import com.srhheidelberg.dap.doctorappointmentplatform.model.CityVault;

@RestController
@RequestMapping("/cityvault")
public class ApptBookingRestController {
	
	@Autowired
	AppointmentBookingDAO appointmentBookingDAO;
	
	@GetMapping("/patientupcomingappointments")
	public List<AppointmentBooking> getPatientUpcomingAppointments() {
		return appointmentBookingDAO.findPatientUpcomingAppointments();
	}
	
	@GetMapping("/doctorupcomingappointments")
	public List<AppointmentBooking> getDoctorUpcomingAppointments() {
		return appointmentBookingDAO.findDoctorUpcomingAppointments();
	}
	
	@GetMapping("/patientpreviousappointments")
	public List<AppointmentBooking> getPatientPreviousAppointments() {
		return appointmentBookingDAO.findPatientPreviousAppointments();
	}
	
	@GetMapping("/doctorpreviousappointments")
	public List<AppointmentBooking> getDoctorPreviousAppointments() {
		return appointmentBookingDAO.findDoctorPreviousAppointments();
	}
	
	@GetMapping("/patientfeebackremaingappointments")
	public List<AppointmentBooking> getPatientFeedbackRemainingAppointments() {
		return appointmentBookingDAO.findPatientFeedbackRemainAppointments();
	}
	
	@GetMapping("/doctorstatusremainingappointments")
	public List<AppointmentBooking> getDoctorStatusRemainingAppointments() {
		return appointmentBookingDAO.findDoctorAppointmentStatusRemainings();
	}
	
	@PostMapping("/bookpatientappointment")
	public AppointmentBooking createAppointmentBooking(@Valid @RequestBody AppointmentBooking appointmentBooking) {
		System.out.println("Booking: " + appointmentBooking);
		return appointmentBookingDAO.save(appointmentBooking);
	}

}
