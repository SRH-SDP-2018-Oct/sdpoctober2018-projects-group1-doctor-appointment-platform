package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.DoctorUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.DoctorUserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class DoctorUserTest {
	
	@InjectMocks
	DoctorUserDAO doctoruserdao;
	
	@Mock
	DoctorUserRepository doctoruserrepository;
	
	@Test
	public void findByAllTest() {
		
		doctoruserdao.findAll();
		verify(doctoruserrepository).findAll();
	}


}
