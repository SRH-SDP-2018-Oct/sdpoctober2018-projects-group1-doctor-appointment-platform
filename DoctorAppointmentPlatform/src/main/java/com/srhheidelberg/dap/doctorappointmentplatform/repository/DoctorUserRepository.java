package com.srhheidelberg.dap.doctorappointmentplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;

public interface DoctorUserRepository extends JpaRepository<DoctorUser, Integer> {
	
	DoctorUser findByDoctorEmail(String email);
	
	DoctorUser save(DoctorUser doctorUser);
	
	DoctorUser getByDoctorUserId(Integer doctorUserId);
}
