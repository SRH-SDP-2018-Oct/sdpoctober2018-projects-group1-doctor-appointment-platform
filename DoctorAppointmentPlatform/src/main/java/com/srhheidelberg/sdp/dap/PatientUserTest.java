package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.PatientUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.PatientUserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class PatientUserTest {
	
	@InjectMocks
	PatientUserDAO patientuserdao;
	
	@Mock
	PatientUserRepository patientuserrepository;
	
	private static final Integer ID =1;
	
	@Test
	public void findByIdTest() {
		
		patientuserdao.getById(ID);
		verify(patientuserrepository).getOne(ID);
	}

}
