package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.AppointmentBookingDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;

@RestController
@RequestMapping("/cityvault")
public class ApptBookingRestController {
	
	@Autowired
	AppointmentBookingDAO appointmentBookingDAO;
	
	@DeleteMapping("/appointmentcancel")
	public void appointmentCancel(AppointmentBooking appointmentBooking) {
		appointmentBookingDAO.deleteAppointment(appointmentBooking);
	}
	
	@GetMapping("/patientupcomingappointments/{patientUserId}")
	public List<AppointmentBooking> getPatientUpcomingAppointments(@PathVariable(value="patientUserId") Integer patientUserId) {
		return appointmentBookingDAO.findPatientUpcomingAppointments(patientUserId);
	}
	
	@GetMapping("/doctorupcomingappointments/{doctorId}")
	public List<AppointmentBooking> getDoctorUpcomingAppointments(@PathVariable(value="doctorId") Integer doctorId) {
		return appointmentBookingDAO.findDoctorUpcomingAppointments(doctorId);
	}
	
	@GetMapping("/patientpreviousappointments/{patientUserId}")
	public List<AppointmentBooking> getPatientPreviousAppointments(@PathVariable(value="patientUserId") Integer patientUserId) {
		return appointmentBookingDAO.findPatientPreviousAppointments(patientUserId);
	}
	
	@GetMapping("/doctorpreviousappointments/{doctorId}")
	public List<AppointmentBooking> getDoctorPreviousAppointments(@PathVariable(value="doctorId") Integer doctorId) {
		return appointmentBookingDAO.findDoctorPreviousAppointments(doctorId);
	}
	
	@GetMapping("/patientfeebackremaingappointments/{patientUserId}")
	public List<AppointmentBooking> getPatientFeedbackRemainingAppointments(@PathVariable(value="patientUserId") Integer patientUserId) {
		return appointmentBookingDAO.findPatientFeedbackRemainAppointments(patientUserId);
	}
	
	@GetMapping("/doctorstatusremainingappointments/{doctorId}")
	public List<AppointmentBooking> getDoctorStatusRemainingAppointments(@PathVariable(value="doctorId") Integer doctorId) {
		return appointmentBookingDAO.findDoctorAppointmentStatusRemainings(doctorId);
	}
	
	@PostMapping("/bookpatientappointment")
	public AppointmentBooking createAppointmentBooking(@Valid @RequestBody AppointmentBooking appointmentBooking) {
		System.out.println("Booking: " + appointmentBooking);
		return appointmentBookingDAO.save(appointmentBooking);
	}
	
	@PutMapping("/patientfeedbackappointment")
	public AppointmentBooking feedbackAppointmentBooking(@Valid @RequestBody AppointmentBooking appointmentBooking) {
		System.out.println("Feeedback: " + appointmentBooking);
		return appointmentBookingDAO.updateAppointmentFeedback(appointmentBooking);
	}
	
	@PutMapping("/doctortreatedappointment")
	public AppointmentBooking treatedAppointmentBooking(@Valid @RequestBody AppointmentBooking appointmentBooking) {
		System.out.println("Treated: " + appointmentBooking);
		return appointmentBookingDAO.updateAppointmentTreatment(appointmentBooking);
	}

	@GetMapping("/appointmentbooking/{appointmentbookingid}")
	public AppointmentBooking findOne(@PathVariable(value="appointmentbookingid") Integer appointmentBookingId) {
		System.out.println(appointmentBookingId + " Here " + appointmentBookingDAO.getById(appointmentBookingId));
		return appointmentBookingDAO.getById(appointmentBookingId);
	}
}
