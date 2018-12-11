package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.AppointmentAvailabilityDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.ApptAvailabilityRepository;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class AppointmentAvailabilityTest {

	 @InjectMocks
	    AppointmentAvailabilityDAO appointmentAvailability;

	    @Mock
	    ApptAvailabilityRepository appointmentavailabilityRepository;

	    @Test
	    public void findAllAppointmentAvailabilityTest() {
	    	/*AppointmentAvailability appointmentAvailabilityobject = mock(AppointmentAvailability.class);*/
	        appointmentAvailability.findAll();
	        verify(appointmentavailabilityRepository).findAll();
	    
	        
	    }

	
	
}




