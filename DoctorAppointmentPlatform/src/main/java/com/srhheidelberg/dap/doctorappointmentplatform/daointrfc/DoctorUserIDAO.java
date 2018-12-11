package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.Date;
import java.util.List;

import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;

public interface DoctorUserIDAO {

	List<DoctorUser> findAll();

	DoctorUser save(DoctorUser doctorUser);

	List<DoctorUser> getAvailableDoctors(Integer selectedCity, Integer selectedDoctorType, Integer selectedSlot,
			Date selectedDate, Integer patientUserId);

}
