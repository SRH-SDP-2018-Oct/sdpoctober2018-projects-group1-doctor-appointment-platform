package com.srhheidelberg.dap.doctorappointmentplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srhheidelberg.dap.doctorappointmentplatform.model.GuardianUser;

public interface GuardianUserRepository extends JpaRepository<GuardianUser, Integer> {

}
