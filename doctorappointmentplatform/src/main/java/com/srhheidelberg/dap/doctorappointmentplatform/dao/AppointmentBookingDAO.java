package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.AppointmentBookingIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.ApptBookingRepository;

@Service
public class AppointmentBookingDAO implements AppointmentBookingIDAO {

	@Autowired
	ApptBookingRepository appointmentBookingRepository;

	public AppointmentBooking save(AppointmentBooking appointmentBooking) {
		return appointmentBookingRepository.save(appointmentBooking);
	}
	
	@Override
	public AppointmentBooking getById(Integer id) {
		System.out.println("Single Appt" + appointmentBookingRepository.getOne(id));
		return appointmentBookingRepository.getOne(id);
	}

	@Override
	public List<AppointmentBooking> findAll() {
		return appointmentBookingRepository.findAll();
	}

	@Override
	public List<AppointmentBooking> findDoctorUpcomingAppointments(Integer doctorId) {

		Integer docId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingDoctor(docId);
		return getUpcomingApptBooking(appointmentBookingList);
	}

	public List<AppointmentBooking> findPatientUpcomingAppointments(Integer patientUserId) {

		//Integer patId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingPatient(patientUserId);
		return getUpcomingApptBooking(appointmentBookingList);
	}

	private List<AppointmentBooking> getUpcomingApptBooking(List<AppointmentBooking> appointmentBookingList) {
		List<AppointmentBooking> bookedUpcomingAppointments = new ArrayList<AppointmentBooking>();
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		for (AppointmentBooking appointmentBooking : appointmentBookingList) {
			Date appointmentDate = null;
				appointmentDate = appointmentBooking.getAppointmentBookingSlotDate();
			
			if (appointmentDate.after(currentDate)) {
				bookedUpcomingAppointments.add(appointmentBooking);
			}
		}
		return bookedUpcomingAppointments;
	}

	public List<AppointmentBooking> findDoctorPreviousAppointments(Integer doctorId) {

		Integer docId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingDoctor(docId);
		return getPreviousApptBooking(appointmentBookingList);
	}

	public List<AppointmentBooking> findPatientPreviousAppointments(Integer patientUserId) {

		//Integer patId = 1;
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingPatient(patientUserId);
		return getPreviousApptBooking(appointmentBookingList);
	}
	
	private List<AppointmentBooking> getPreviousApptBooking(List<AppointmentBooking> appointmentBookingList) {
		List<AppointmentBooking> bookedPreviousAppointments = new ArrayList<AppointmentBooking>();
		Calendar cal = Calendar.getInstance();
		Date currentDate = cal.getTime();
		for (AppointmentBooking appointmentBooking : appointmentBookingList) {
			Date appointmentDate = null;
				appointmentDate = appointmentBooking.getAppointmentBookingSlotDate();
			if (appointmentDate.before(currentDate)) {
				bookedPreviousAppointments.add(appointmentBooking);
			}
		}
		return bookedPreviousAppointments;
	}

	@Override
	public List<AppointmentBooking> findDoctorAppointmentStatusRemainings(Integer doctorId) {
		Integer patId = 1;//Doctored
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingDoctor(doctorId);
		System.out.println("Booked1" + appointmentBookingList);
		System.out.println("Booked2" + getPreviousApptBooking(appointmentBookingList));
		return getAppointmentByStatus(getPreviousApptBooking(appointmentBookingList), "Booked");
	}

	@Override
	public List<AppointmentBooking> findPatientFeedbackRemainAppointments(Integer patientUserId) {

		Integer patId = 1;//Treated
		List<AppointmentBooking> appointmentBookingList = appointmentBookingRepository
				.findByAppointmentBookingPatient(patientUserId);
		System.out.println("Treated " +getAppointmentByStatus(getPreviousApptBooking(appointmentBookingList), "Treated"));
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
	
	public AppointmentBooking updateAppointmentFeedback(AppointmentBooking appointmentBooking) {
		
		AppointmentBooking ab = appointmentBookingRepository.getOne(appointmentBooking.getAppointmentBookingId());
		ab.setAppointmentBookingRating(appointmentBooking.getAppointmentBookingRating());
		ab.setAppointmentBookingFeedback(appointmentBooking.getAppointmentBookingFeedback());
		ab.setAppointmentBookingStatus("Completed");
		System.out.println("Appt Bok9ing feedcak" + ab);
		return appointmentBookingRepository.save(ab);
	}
	
	public AppointmentBooking updateAppointmentTreatment(AppointmentBooking appointmentBooking) {
		
		AppointmentBooking ab = appointmentBookingRepository.getOne(appointmentBooking.getAppointmentBookingId());
		ab.setAppointmentBookingTreatment(appointmentBooking.getAppointmentBookingTreatment());
		ab.setAppointmentBookingPrescription(appointmentBooking.getAppointmentBookingPrescription());
		ab.setAppointmentBookingStatus("Treated");
		System.out.println("Appt Bok9ing Presc" + ab);
		return appointmentBookingRepository.save(ab);
	}


}
