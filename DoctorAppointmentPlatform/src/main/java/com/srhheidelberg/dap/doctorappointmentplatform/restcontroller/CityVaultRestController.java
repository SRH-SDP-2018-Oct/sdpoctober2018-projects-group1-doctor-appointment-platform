package com.srhheidelberg.dap.doctorappointmentplatform.restcontroller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srhheidelberg.dap.doctorappointmentplatform.dao.CityVaultDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.CityVault;

@RestController
@RequestMapping("/cityvault")
public class CityVaultRestController {
	
	@Autowired
	CityVaultDAO cityVaultDAO;
	
	@PostMapping("/cities")
	public CityVault createCity(@Valid @RequestBody CityVault city) {
		return cityVaultDAO.save(city);
	}
	
	@GetMapping("/cities")
	public List<CityVault> getAll() {
		return cityVaultDAO.findAll();
	}
	
	@GetMapping("/cities/{id}")
	public Optional<CityVault> getCityById(@PathVariable(value="id") Integer cityId) {
		return cityVaultDAO.findOne(cityId);
	}
	
	
}
