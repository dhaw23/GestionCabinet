package com.example.doctormanager.Service;

import com.example.doctormanager.Model.Consultation;
import com.example.doctormanager.Repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {

    private final ConsultationRepository consultationRepository;

    @Autowired
    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Consultation getConsultationById(int id) {
        return consultationRepository.getConsultationById(id);
    }

    public List<Consultation> getAllConsultationsByPatientId(int patientId) {
        return consultationRepository.getAllConsultationById(patientId);
    }

    public boolean addConsultation(Consultation consultation) {
        try {
            consultationRepository.save(consultation);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteConsultationById(int id) {
        try {
            consultationRepository.deleteConsultationById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
