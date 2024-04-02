package com.example.doctormanager.Model;

import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name ="patients")
public class Patient extends User {

    private String birthDate;
    private String sex;
    private MedicalFile medicalFile;

    public Patient() {

    }

    public Patient(int id,String cin,String firstName, String lastName, String phone,String specialty ,String email, String password) {
        super(id,cin,firstName,lastName,phone,email, password);

    }

    public Patient(int id, String cin, String firstName, String lastName, String phone, String email, String password, String birthDate, String sex) {
        super(id,cin,firstName,lastName,phone,email, password);
        this.birthDate = birthDate;
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public void setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
    }
}
