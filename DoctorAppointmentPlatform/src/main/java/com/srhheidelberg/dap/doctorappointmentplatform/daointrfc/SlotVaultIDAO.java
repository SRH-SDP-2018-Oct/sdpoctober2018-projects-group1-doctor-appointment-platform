package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;

import com.srhheidelberg.dap.doctorappointmentplatform.model.SlotVault;

public interface SlotVaultIDAO {

	List<SlotVault> findAll();

}
