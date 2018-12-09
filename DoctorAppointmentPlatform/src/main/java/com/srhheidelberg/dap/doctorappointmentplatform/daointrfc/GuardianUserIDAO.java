package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import com.srhheidelberg.dap.doctorappointmentplatform.model.GuardianUser;

public interface GuardianUserIDAO {

	void save(GuardianUser guardianUser);

	GuardianUser findById(Integer id);

}
