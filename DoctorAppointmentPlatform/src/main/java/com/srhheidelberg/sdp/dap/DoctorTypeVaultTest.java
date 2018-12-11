package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.DoctorTypeVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.DoctorTypeVaultRepository;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorTypeVaultTest {

	 @InjectMocks
	 DoctorTypeVaultDAO doctortypeVault;

	    @Mock
	    DoctorTypeVaultRepository doctortypevaultRepository;

	    @Test
	    public void findAllAppointmentAvailabilityTest() {
	    	/*AppointmentAvailability appointmentAvailabilityobject = mock(AppointmentAvailability.class);*/
	    	doctortypeVault.findAll();
	        verify(doctortypevaultRepository).findAll();
	    
	        
	    }

	
	
}




