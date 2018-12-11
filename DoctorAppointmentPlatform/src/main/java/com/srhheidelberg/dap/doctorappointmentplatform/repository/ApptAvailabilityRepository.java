package com.srhheidelberg.dap.doctorappointmentplatform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;

public interface ApptAvailabilityRepository extends JpaRepository<AppointmentAvailability, Integer> {

	@Query("Select appav FROM AppointmentAvailability appav WHERE appav.appointmentAvailabilitySlotDay = :appointmentAvailabilitySlotDay AND "
			+ "appav.appointmentAvailabilityDoctorType = :appointmentAvailabilityDoctorType AND appav.appointmentAvailabilityDoctorCity = :appointmentAvailabilityDoctorCity")
	List<AppointmentAvailability> findByParameters(
			@Param("appointmentAvailabilitySlotDay") String appointmentAvailabilitySlotDay,
			@Param("appointmentAvailabilityDoctorType") int appointmentAvailabilityDoctorType,
			@Param("appointmentAvailabilityDoctorCity") int appointmentAvailabilityDoctorCity);
	
}
