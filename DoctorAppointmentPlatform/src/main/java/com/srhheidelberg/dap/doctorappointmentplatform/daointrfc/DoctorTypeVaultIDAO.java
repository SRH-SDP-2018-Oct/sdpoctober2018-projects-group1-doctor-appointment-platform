package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;
import java.util.Optional;

import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorTypeVault;

public interface DoctorTypeVaultIDAO {

	List<DoctorTypeVault> findAll();

	Optional<DoctorTypeVault> findById(Integer id);

}
