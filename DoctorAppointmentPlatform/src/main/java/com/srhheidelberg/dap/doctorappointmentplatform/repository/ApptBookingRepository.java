package com.srhheidelberg.dap.doctorappointmentplatform.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;

public interface ApptBookingRepository extends JpaRepository<AppointmentBooking, Integer> {

	List<AppointmentBooking> findByAppointmentBookingDoctor(Integer AppointmentBookingDoctor);

	List<AppointmentBooking> findByAppointmentBookingPatient(Integer AppointmentBookingPatient);

	@Query("SELECT appbo FROM AppointmentBooking appbo WHERE appbo.appointmentBookingSlotDay = :appointmentBookingSlotDay "
			+ "AND appbo.appointmentBookingSlotTime = :appointmentBookingSlotTime "
			+ "AND appbo.appointmentBookingDoctorCity = :appointmentBookingDoctorCity "
			+ "AND appbo.appointmentBookingDoctorType = :appointmentBookingDoctorType "
			+ "AND appbo.appointmentBookingPatient = :appointmentBookingPatient "
			+ "AND appbo.appointmentBookingSlotDate = :appointmentBookingSlotDate ")
	List<AppointmentBooking> getUnvailableAppointments(
			@Param("appointmentBookingSlotDay") String appointmentBookingSlotDay,
			@Param("appointmentBookingSlotTime") Integer appointmentBookingSlotTime, 
			@Param("appointmentBookingDoctorCity") Integer appointmentBookingDoctorCity,
			@Param("appointmentBookingDoctorType") Integer appointmentBookingDoctorType,
			@Param("appointmentBookingPatient") Integer appointmentBookingPatient,
			@Param("appointmentBookingSlotDate")  Date appointmentBookingSlotDate);
	
	AppointmentBooking getOne(Integer id);
	
}
