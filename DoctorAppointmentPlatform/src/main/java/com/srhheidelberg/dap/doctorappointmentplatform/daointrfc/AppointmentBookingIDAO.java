package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;

public interface AppointmentBookingIDAO {

	AppointmentBooking getById(Integer id);

	List<AppointmentBooking> findAll();

	List<AppointmentBooking> findDoctorUpcomingAppointments();

	List<AppointmentBooking> findPatientUpcomingAppointments();

	List<AppointmentBooking> findDoctorPreviousAppointments();

	List<AppointmentBooking> findPatientPreviousAppointments();

	List<AppointmentBooking> findDoctorAppointmentStatusRemainings();

	List<AppointmentBooking> findPatientFeedbackRemainAppointments();
	
}
