package com.karam.doctorpatientappointment.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.karam.doctorpatientappointment.dal.entities.Guardian_User;
import com.karam.doctorpatientappointment.dal.entities.Patient_User;
import com.karam.doctorpatientappointment.dal.respository.GuardianUserRepository;
import com.karam.doctorpatientappointment.dal.respository.PatientUserRepository;



@Controller
public class patientUserController {
	
	@Autowired
	private PatientUserRepository patientuserRepository;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return"login/registerUser";
		
	}

	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String register(@ModelAttribute("patient_User")Patient_User patientUser)   {
		
		patientuserRepository.save(patientUser);
		return"login/dashboard";		
	}
	
	//http://localhost:8080/patientRegistration/showReg/login/email/password
	@GetMapping(value="/login/{patientemail}/{patientpassword}")
	public String login(@PathVariable("patientemail")String patientemail,
			@PathVariable("patientpassword")String patientpassword,
			ModelMap modelMap) {
		
		Patient_User patient_User = patientuserRepository.getBypatientemail(patientemail);
		if (patient_User.getPatientpassword().equals(patientpassword)) {
			
			return"dashboard";
		} else {
			modelMap.addAttribute("msg","Invalid Credentials");
			return"login/login";
		}
	}
	
	@RequestMapping("/registerUser")
	public String showDashboardPage() {
		return"login/dashboard";
		
	}
	// guardian registration 
	public class guardianUserController {
		
		@Autowired
		private GuardianUserRepository guardianuserRepository;
		
		@RequestMapping("/showReg")
		public String showRegistrationPage() {
			return"login/registerUser";
			
		}

		@RequestMapping(value="registerUser",method=RequestMethod.POST)
		public String register(@ModelAttribute("Guardian_User")Guardian_User guardianuser)   {
			
			guardianuserRepository.save(guardianuser);
			return"login/dashboard";		
		}
}
}
