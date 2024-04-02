package com.example.doctormanager.Repository;

import com.example.doctormanager.Model.MedicalFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalFileRepository extends JpaRepository<MedicalFile, Long> {
    public MedicalFile getMedicalFileById(int id);

    MedicalFile findByPatientId(Long patientId);

}
