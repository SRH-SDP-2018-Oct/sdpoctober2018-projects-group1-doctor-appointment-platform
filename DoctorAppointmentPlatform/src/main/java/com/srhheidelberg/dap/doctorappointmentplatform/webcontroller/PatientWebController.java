package com.srhheidelberg.dap.doctorappointmentplatform.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/appointmentbookingapp")
public class PatientWebController {
	
	@RequestMapping(value="/patientlogin", method=RequestMethod.GET)
	public String patientLoginPageDisplay() {
		return "/patientlogin";//appointmentbookingapp.patientlogin
	}
	
	@RequestMapping(value="/patientdashboard", method=RequestMethod.GET)
	public String patientDashboardPageDisplay() {
		return "/patientdashboard";
	}
	
	@RequestMapping(value="/patientappointment", method=RequestMethod.GET)
	public String patientAppointmentPageDisplay() {
		return "/viewappointment";
	}
	
	@RequestMapping(value="/patientregistration", method=RequestMethod.GET)
	public String patientRegistrationPageDisplay() {
		return "/patientregistration";
	}
	
	@RequestMapping(value="/patientfeedbackappointment", method=RequestMethod.GET)
	public String patientFeedbackPageDisplay() {
		return "/patientregistration";
	}

}
