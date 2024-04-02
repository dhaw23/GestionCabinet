package com.example.doctormanager.Model;


import jakarta.persistence.*;




@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_prescription;
    @Column
    private String title;
    @Column
    private String dateOfPrescription;
    @Column
    private String description;
    @Column
    private String medicationList;

    public Prescription() {

    }

    public int getId_prescription() {
        return id_prescription;
    }

    public void setId_prescription(int id_prescription) {
        this.id_prescription = id_prescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfPrescription() {
        return dateOfPrescription;
    }

    public void setDateOfPrescription(String dateOfPrescription) {
        this.dateOfPrescription = dateOfPrescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(String medicationList) {
        this.medicationList = medicationList;
    }





}
