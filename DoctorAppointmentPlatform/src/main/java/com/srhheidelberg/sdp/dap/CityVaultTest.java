package com.srhheidelberg.dap.doctorappointmentplatform.repositorytest;


import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.CityVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.CityVault;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.CityVaultRepository;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class CityVaultTest  {
    
    @InjectMocks
    CityVaultDAO cityvault;
    
    @Mock
    CityVaultRepository cityvaultRepository;
    
    @Test
    public void createTest() {
        
        CityVault cityvaultobject = mock(CityVault.class);
        cityvault.save(cityvaultobject);
        verify(cityvaultRepository).save(cityvaultobject);
    }
    
    

}




