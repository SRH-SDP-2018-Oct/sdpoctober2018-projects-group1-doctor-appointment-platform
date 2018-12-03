package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.CityVault;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.CityVaultRepository;

@Service
public class CityVaultDAO {

	@Autowired
	private CityVaultRepository cityVaultRepository;
	
	//Save City
	public CityVault save(CityVault city) {
		return cityVaultRepository.save(city);
	}
	
	//Search Cities
	public List<CityVault> findAll() {
		return (List<CityVault>) cityVaultRepository.findAll();
	}
	
	//Get a City
	public Optional<CityVault> findOne(Integer cityId) {
		return cityVaultRepository.findById(cityId);
	}
	
	//Delete a City
	public void delete(CityVault city) {
		cityVaultRepository.delete(city);
	}
}
