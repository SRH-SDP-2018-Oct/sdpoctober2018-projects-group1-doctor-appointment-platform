package com.srhheidelberg.dap.doctorappointmentplatform.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srhheidelberg.dap.doctorappointmentplatform.daointrfc.DoctorUserIDAO;
import com.srhheidelberg.dap.doctorappointmentplatform.enumrepo.DAYS;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;
import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;
import com.srhheidelberg.dap.doctorappointmentplatform.model.DoctorUser;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.ApptAvailabilityRepository;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.ApptBookingRepository;
import com.srhheidelberg.dap.doctorappointmentplatform.repository.DoctorUserRepository;

@Service
public class DoctorUserDAO implements DoctorUserIDAO {

	@Autowired
	DoctorUserRepository doctorUserRepository;

	@Autowired
	ApptBookingRepository apptBookingRepository;
	
	@Autowired
	ApptAvailabilityRepository apptAvailabilityRepository;

	public DoctorUser updateDoctor(DoctorUser doctorUser) {
		return doctorUserRepository.save(doctorUser);
	}
	
	@Override
	public List<DoctorUser> findAll() {
		return doctorUserRepository.findAll();
	}

	@Override
	public DoctorUser save(DoctorUser doctorUser) {
		return doctorUserRepository.save(doctorUser);
	}
	
	public DoctorUser findByDoctorEmail(String doctorEmail) {
		return doctorUserRepository.findByDoctorEmail(doctorEmail);
	}

	@Override
	public List<DoctorUser> getAvailableDoctors(Integer selectedCity, Integer selectedDoctorType, Integer selectedSlot,
			Date selectedDate, Integer patientUserId) {
		
		Calendar c = Calendar.getInstance();
		//selectedDate = c.getTime();
		System.out.println("Selcted Date" + selectedDate);
		c.setTime(selectedDate);
		String selectedDayString = getDayfromInteger(c.get(Calendar.DAY_OF_WEEK));
		
		List<AppointmentAvailability> apptAvailByTimeDay = findBySlotTime(selectedSlot, 
				apptAvailabilityRepository.findByParameters(selectedDayString, selectedDoctorType, selectedCity));
		System.out.println("apptAvailByDay" + apptAvailabilityRepository.findByParameters(selectedDayString, selectedDoctorType, selectedCity));
		List<AppointmentBooking> apptBookedByTimeDayCityType = apptBookingRepository.getUnvailableAppointments(selectedDayString, selectedSlot,
				selectedCity, selectedDoctorType, patientUserId, selectedDate);
		System.out.println(selectedDayString + selectedSlot + selectedCity + selectedDoctorType +"apptBookedByTimeDayCityType" + apptBookedByTimeDayCityType);
		return doctorUserRepository.findAllById(getAvailableDoctors(apptAvailByTimeDay, apptBookedByTimeDayCityType));
	}
	
	private List<Integer> getAvailableDoctors(List<AppointmentAvailability> apptAvailByTimeDay, List<AppointmentBooking> apptBookedByTimeDayCityType) {
		
		List<Integer> availableDoctorList = new ArrayList<>();
		for(AppointmentAvailability appointmentAvailability : apptAvailByTimeDay) {
			availableDoctorList.add(appointmentAvailability.getAppointmentAvailabilityDoctor());
			System.out.println("Added" + appointmentAvailability.getAppointmentAvailabilityDoctor());
		}
		for(AppointmentBooking appointmentBooking : apptBookedByTimeDayCityType) {
			availableDoctorList.remove(appointmentBooking.getAppointmentBookingDoctor());
			System.out.println("Removed" + appointmentBooking.getAppointmentBookingDoctor());
		}
		return availableDoctorList;
		
	}

	private String getDayfromInteger(Integer dayInteger) {
		String dayString = null;
		switch (dayInteger) {
		case 1:
			dayString = DAYS.Sunday.toString();
			break;
		case 2:
			dayString = DAYS.Monday.toString();
			break;
		case 3:
			dayString = DAYS.Tuesday.toString();
			break;
		case 4:
			dayString = DAYS.Wednesday.toString();
			break;
		case 5:
			dayString = DAYS.Thursday.toString();
			break;
		case 6:
			dayString = DAYS.Friday.toString();
			break;
		case 7:
			dayString = DAYS.Saturday.toString();
			break;
		}
		return dayString;
	}

	private List<AppointmentAvailability> findBySlotTime(Integer slotTime,
			List<AppointmentAvailability> appointmentAvailabilitiesList) {

		List<AppointmentAvailability> apptAvailabilityListBySlotTime = new ArrayList<>();

		for (AppointmentAvailability appointmentAvailability : appointmentAvailabilitiesList) {

			String slotTimeName = new String();
			switch (slotTime) {
			case 1: {
				slotTimeName = "Slot1";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime1()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			}
			case 2:
				slotTimeName = "Slot2";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime2()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 3:
				slotTimeName = "Slot3";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime3()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 4:
				slotTimeName = "Slot4";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime4()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 5:
				slotTimeName = "Slot5";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime5()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 6:
				slotTimeName = "Slot6";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime6()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 7:
				slotTimeName = "Slot7";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime7()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 8:
				slotTimeName = "Slot8";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime8()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 9:
				slotTimeName = "Slot9";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime9()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 10:
				slotTimeName = "Slot10";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime10()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 11:
				slotTimeName = "Slot11";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime11()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			case 12:
				slotTimeName = "Slot12";
				if (appointmentAvailability.getAppointmentAvailabilitySlotTime12()) {
					apptAvailabilityListBySlotTime.add(appointmentAvailability);
				}
				break;
			}
			System.out.println(slotTimeName);
		}

		return apptAvailabilityListBySlotTime;
	}
	
	public DoctorUser findOne(Integer doctorId) {
		return doctorUserRepository.getByDoctorUserId(doctorId);
	}

}
