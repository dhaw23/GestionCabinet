package com.example.doctormanager.Model;


import jakarta.persistence.Entity;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name ="doctors")
public class Doctor extends User {
    private String specialty;

    public Doctor(long Iddoc, String cin, String firstName, String lastName, String phone, String email, String password, String specialty) {
        super(Iddoc, cin, firstName, lastName, phone, email, password);
        this.specialty = specialty;
    }

    public Doctor() {

    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}