package com.example.doctormanager.Service;

import com.example.doctormanager.Model.MedicalFile;
import com.example.doctormanager.Repository.MedicalFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalFileService {

    private final MedicalFileRepository medicalFileRepository;

    @Autowired
    public MedicalFileService(MedicalFileRepository medicalFileRepository) {
        this.medicalFileRepository = medicalFileRepository;
    }

    // Method to get a medical file by ID
    public MedicalFile getMedicalFileById(long id) {
        Optional<MedicalFile> medicalFileOptional = medicalFileRepository.findById(id);
        return medicalFileOptional.orElse(null);
    }

    // Method to save or update a medical file
    public MedicalFile saveOrUpdateMedicalFile(MedicalFile medicalFile) {
        return medicalFileRepository.save(medicalFile);
    }

    // Method to delete a medical file by ID
    public void deleteMedicalFileById(long id) {
        medicalFileRepository.deleteById(id);
    }
}