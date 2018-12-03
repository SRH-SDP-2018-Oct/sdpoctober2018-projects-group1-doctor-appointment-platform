package com.srhheidelberg.dap.doctorappointmentplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentBooking;

public interface AppointmentBookingRepository extends JpaRepository<AppointmentBooking, Integer> {

}
