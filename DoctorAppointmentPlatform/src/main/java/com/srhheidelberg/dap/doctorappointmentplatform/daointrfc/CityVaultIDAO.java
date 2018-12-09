package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;
import java.util.Optional;

import com.srhheidelberg.dap.doctorappointmentplatform.model.CityVault;

public interface CityVaultIDAO {

	CityVault save(CityVault city);

	void delete(CityVault city);

	Optional<CityVault> findOne(Integer cityId);

	List<CityVault> findAll();

}
