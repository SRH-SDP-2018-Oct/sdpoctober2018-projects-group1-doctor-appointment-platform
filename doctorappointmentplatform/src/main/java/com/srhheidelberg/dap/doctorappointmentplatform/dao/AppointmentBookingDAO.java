package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;
import com.srhheidelberg.dap.doctorappointmentplatform.repositories.ApptBookingRepository;

@Service
public class AppointmentBookingDAO {

	@Autowired
	ApptBookingRepository appointmentBookingRepository;

	public AppointmentBooking getById(Integer id) {
		return appointmentBookingRepository.getOne(id);
	}

	public List<AppointmentBooking> findAll() {
		return appointmentBookingRepository.findAll();
	}

	public List<AppointmentBooking> findDoctorUpcomingAppointments() {

		Integer docId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingDoctor(docId);
		return getUpcomingApptBooking(appointmentBookingList);
	}

	public List<AppointmentBooking> findPatientUpcomingAppointments() {

		Integer patId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingPatient(patId);
		return getUpcomingApptBooking(appointmentBookingList);
	}

	private List<AppointmentBooking> getUpcomingApptBooking(List<AppointmentBooking> appointmentBookingList) {
		List<AppointmentBooking> bookedUpcomingAppointments = new ArrayList<AppointmentBooking>();
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		for (AppointmentBooking appointmentBooking : appointmentBookingList) {
			Date appointmentDate = null;
			try {
				appointmentDate = new SimpleDateFormat("yyyy-MM-dd")
						.parse(appointmentBooking.getAppointmentBookingSlotDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if (appointmentDate.after(currentDate)) {
				bookedUpcomingAppointments.add(appointmentBooking);
			}
		}
		return bookedUpcomingAppointments;
	}

	public List<AppointmentBooking> findDoctorPreviousAppointments() {

		Integer docId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingDoctor(docId);
		return getPreviousApptBooking(appointmentBookingList);
	}

	public List<AppointmentBooking> findPatientPreviousAppointments() {

		Integer patId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingPatient(patId);
		return getPreviousApptBooking(appointmentBookingList);
	}
	
	private List<AppointmentBooking> getPreviousApptBooking(List<AppointmentBooking> appointmentBookingList) {
		List<AppointmentBooking> bookedPreviousAppointments = new ArrayList<AppointmentBooking>();
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		for (AppointmentBooking appointmentBooking : appointmentBookingList) {
			Date appointmentDate = null;
			try {
				appointmentDate = new SimpleDateFormat("yyyy-MM-dd")
						.parse(appointmentBooking.getAppointmentBookingSlotDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if (appointmentDate.before(currentDate)) {
				bookedPreviousAppointments.add(appointmentBooking);
			}
		}
		return bookedPreviousAppointments;
	}

	public List<AppointmentBooking> findDoctorAppointmentStatusRemainings() {
		Integer patId = 1;//Doctored
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingDoctor(patId);
		return getAppointmentByStatus(getPreviousApptBooking(appointmentBookingList), "Doctored");
	}

	public List<AppointmentBooking> findPatientFeedbackRemainAppointments() {

		Integer patId = 1;//Treated
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingPatient(patId);
		return getAppointmentByStatus(getPreviousApptBooking(appointmentBookingList), "Treated");
	}

	private List<AppointmentBooking> getAppointmentByStatus(List<AppointmentBooking> appointmentBookingList,
			String status) {
			List<AppointmentBooking> statuswiseAppointments = new ArrayList<AppointmentBooking>();
			
		for (AppointmentBooking appointmentBooking : appointmentBookingList) {
			if (appointmentBooking.getAppointmentBookingStatus().equalsIgnoreCase(status)) {
				statuswiseAppointments.add(appointmentBooking);
			}
		}
		return statuswiseAppointments;
	}
	
	private List<AppointmentBooking> getAppointmentByToday(List<AppointmentBooking> appointmentBookingList) {
		List<AppointmentBooking> bookedTodayAppointments = new ArrayList<AppointmentBooking>();
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		for (AppointmentBooking appointmentBooking : appointmentBookingList) {
			Date appointmentDate = null;
			try {
				appointmentDate = new SimpleDateFormat("yyyy-MM-dd")
						.parse(appointmentBooking.getAppointmentBookingSlotDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if (appointmentDate.equals(currentDate)) {
				bookedTodayAppointments.add(appointmentBooking);
			}
		}
		return bookedTodayAppointments;
	}

}
