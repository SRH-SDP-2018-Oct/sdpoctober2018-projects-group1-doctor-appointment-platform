package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.AppointmentBookingDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.ApptBookingRepository;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class AppointmentBookingTest {

	 @InjectMocks
	    AppointmentBookingDAO appointmentBooking;

	    @Mock
	    ApptBookingRepository appointmentbookingRepository;

	    @Test
	    public void findAllAppointmentAvailabilityTest() {
	    	/*AppointmentAvailability appointmentAvailabilityobject = mock(AppointmentAvailability.class);*/
	        appointmentBooking.findAll();
	        verify(appointmentbookingRepository).findAll();
	    
	        
	    }

	
	
}




