package com.srhheidelberg.dap.doctorappointmentplatform.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/appointmentbookingapp")
public class DoctorWebController {
	
	@RequestMapping(value="/doctorlogin", method=RequestMethod.GET)
	public String doctorLoginPageDisplay() {
		return "/doctorlogin";
	}
	
	@RequestMapping(value="/doctordashboard", method=RequestMethod.GET)
	public String doctorDashboardPageDisplay() {
		return "/doctordashboard";
	}
	
	@RequestMapping(value="/doctorappointment", method=RequestMethod.GET)
	public String doctorAppointmentPageDisplay() {
		return "/viewappointment";
	}
	
	@RequestMapping(value="/doctorregistration", method=RequestMethod.GET)
	public String doctorRegistrationPageDisplay() {
		return "/doctorregistration";
	}

}
