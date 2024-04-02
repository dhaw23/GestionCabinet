package com.example.doctormanager.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
public class MedicalFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idmed;

    @OneToOne
    private Patient patient;

    @OneToMany
    private List<Appointment> appointmentList = new ArrayList<>();

    @OneToMany
    private List<Consultation> consultationList = new ArrayList<>();

    @OneToMany(mappedBy = "medicalFile", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StatistiqueEntry> statistiques;


    public String getIdmed() {
        return idmed;
    }

    public void setIdmed(String idmed) {
        this.idmed = idmed;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<Consultation> getConsultationList() {
        return consultationList;
    }

    public void setConsultationList(List<Consultation> consultationList) {
        this.consultationList = consultationList;
    }

    public List<StatistiqueEntry> getStatistiques() {
        return statistiques;
    }

    public void setStatistiques(List<StatistiqueEntry> statistiques) {
        this.statistiques = statistiques;
    }

    public MedicalFile() {
    }
}
