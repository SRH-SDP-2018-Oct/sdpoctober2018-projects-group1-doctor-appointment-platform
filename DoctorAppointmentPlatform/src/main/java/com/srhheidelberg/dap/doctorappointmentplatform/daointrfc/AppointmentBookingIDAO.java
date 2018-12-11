package com.srhheidelberg.dap.doctorappointmentplatform.daointrfc;

import java.util.List;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;

public interface AppointmentBookingIDAO {

	AppointmentBooking getById(Integer id);

	List<AppointmentBooking> findAll();

	List<AppointmentBooking> findDoctorUpcomingAppointments(Integer doctorId);

	List<AppointmentBooking> findPatientUpcomingAppointments(Integer patientUserId);

	List<AppointmentBooking> findDoctorPreviousAppointments(Integer doctorId);

	List<AppointmentBooking> findPatientPreviousAppointments(Integer patientUserId);

	List<AppointmentBooking> findDoctorAppointmentStatusRemainings(Integer doctorId);

	List<AppointmentBooking> findPatientFeedbackRemainAppointments(Integer patientUserId);
	
}
