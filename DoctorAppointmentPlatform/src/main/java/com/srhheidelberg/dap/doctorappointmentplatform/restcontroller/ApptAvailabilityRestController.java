package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.repository.ApptBookingRepository;

@RestController
@RequestMapping("/cityvault")
public class ApptAvailabilityRestController {
	
	@Autowired
	ApptBookingRepository apptBookingRepository;

}
