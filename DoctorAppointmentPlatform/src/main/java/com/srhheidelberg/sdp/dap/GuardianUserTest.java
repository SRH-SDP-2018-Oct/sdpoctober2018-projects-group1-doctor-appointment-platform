package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.GuardianUserDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.GuardianUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.GuardianUserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class GuardianUserTest {
	
	@InjectMocks
	GuardianUserDAO guardianuserdao;
	
	@Mock
	GuardianUserRepository guardianuserrepository;
	
	@Test
	public void SaveGuardianTest() {

		GuardianUser guardian = mock(GuardianUser.class);
		guardianuserdao.save(guardian);
		verify(guardianuserrepository).save(guardian);
	}



}
