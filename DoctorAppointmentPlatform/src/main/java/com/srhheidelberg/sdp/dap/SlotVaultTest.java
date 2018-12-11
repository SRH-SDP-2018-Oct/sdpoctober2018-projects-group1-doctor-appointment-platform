package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.SlotVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.SlotVaultRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class SlotVaultTest {

	@InjectMocks
	SlotVaultDAO slotvaultdao;
	
	@Mock
	SlotVaultRepository slotvaultrepository;
	
	@Test
	public void findAllTest() {
		
		slotvaultdao.findAll();
		verify(slotvaultrepository).findAll();
		
	}
}
