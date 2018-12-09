package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.CityVaultIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.CityVault;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.CityVaultRepository;

@Service
public class CityVaultDAO implements CityVaultIDAO {

	@Autowired
	private CityVaultRepository cityVaultRepository;
	
	@Override
	public CityVault save(CityVault city) {
		return cityVaultRepository.save(city);
	}
	
	@Override
	public List<CityVault> findAll() {
		return (List<CityVault>) cityVaultRepository.findAll();
	}
	
	@Override
	public Optional<CityVault> findOne(Integer cityId) {
		return cityVaultRepository.findById(cityId);
	}
	
	@Override
	public void delete(CityVault city) {
		cityVaultRepository.delete(city);
	}
}
