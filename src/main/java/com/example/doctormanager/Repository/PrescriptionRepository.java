package com.example.doctormanager.Repository;

import com.example.doctormanager.Model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRepository extends JpaRepository<PatientRepository,Long> {

    public Prescription getPrescriptionById(int id);
    public int addPrescription(Prescription prescription);
    public boolean deletePrescriptionById(int id_prescription);
}
