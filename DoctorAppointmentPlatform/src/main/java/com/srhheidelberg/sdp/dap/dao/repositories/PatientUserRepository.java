package com.srhheidelberg.sdp.dap.dao.repositories;

import org.springframework.data.repository.CrudRepository;

import com.srhheidelberg.sdp.dap.model.entities.Patient_User;

public interface PatientUserRepository extends CrudRepository<Patient_User, Integer> {

}
