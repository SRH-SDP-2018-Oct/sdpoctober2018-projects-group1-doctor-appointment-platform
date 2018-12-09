package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;

import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;

public interface DoctorUserIDAO {

	List<DoctorUser> findAll();

	void save(DoctorUser doctorUser);

	List<DoctorUser> getAvailableDoctors(Integer selectedCity, Integer selectedDoctorType, Integer selectedSlot,
			Long todaysDate);

}
