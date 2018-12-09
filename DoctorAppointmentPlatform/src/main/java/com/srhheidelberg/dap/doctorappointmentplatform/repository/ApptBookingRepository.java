package com.srhheidelberg.dap.doctorappointmentplatform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;


public interface ApptBookingRepository extends JpaRepository<AppointmentBooking, Integer>{
	
	List<AppointmentBooking> findByAppointmentBookingDoctor(Integer AppointmentBookingDoctor);
	
	List<AppointmentBooking> findByAppointmentBookingPatient(Integer AppointmentBookingPatient);
	
}
