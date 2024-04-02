package com.example.doctormanager.Repository;

import com.example.doctormanager.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    public Patient getPatientById(long id);
    List<Patient> findByFirstName(String firstName);
    List<Patient> findByLastName(String lastName);
    Patient findByEmail(String email);




}
