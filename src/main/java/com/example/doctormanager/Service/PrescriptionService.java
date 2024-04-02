package com.example.doctormanager.Service;

import com.example.doctormanager.Model.Prescription;
import com.example.doctormanager.Repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;

    @Autowired
    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    public Prescription getPrescriptionById(int id) {
        Optional<Prescription> prescriptionOptional = prescriptionRepository.findById(id);
        return prescriptionOptional.orElse(null);
    }

    public Prescription addPrescription(Prescription prescription) {
        return prescriptionRepository.addPrescription(Prescription prescription);
    }

    public boolean deletePrescriptionById(int id) {
        if (prescriptionRepository.deletePrescriptionById(id)) {
            prescriptionRepository.deletePrescriptionById(id);
            return true;
        }
        return false;
    }
}