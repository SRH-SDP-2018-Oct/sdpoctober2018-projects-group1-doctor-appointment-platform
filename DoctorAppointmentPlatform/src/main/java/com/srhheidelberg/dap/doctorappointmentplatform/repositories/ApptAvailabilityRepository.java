package com.srhheidelberg.dap.doctorappointmentplatform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srhheidelberg.dap.doctorappointmentplatform.model.AppointmentAvailability;

public interface ApptAvailabilityRepository extends JpaRepository<AppointmentAvailability, Integer> {

}
