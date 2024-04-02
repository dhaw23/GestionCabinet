package com.example.doctormanager.Repository;

import com.example.doctormanager.Model.Appointment;
import com.example.doctormanager.Model.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long>{

    public Consultation getConsultationById(int id);
    public ArrayList<Consultation> getAllConsultationById(int id_patient);
    public boolean addConsultation(Consultation consultation);
    public boolean deleteConsultationById(int id_appointment);
}
