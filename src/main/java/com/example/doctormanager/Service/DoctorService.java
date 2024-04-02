package com.example.doctormanager.Service;

import com.example.doctormanager.Model.Doctor;
import com.example.doctormanager.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    // Method to save a doctor
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    // Method to retrieve all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    // Method to retrieve a doctor by ID
    public Optional<Doctor> getDoctorById(long id) {
        return doctorRepository.findById(id);
    }

    // Method to retrieve doctors by specialty
    public List<Doctor> getDoctorsBySpecialty(String specialty) {
        return doctorRepository.findBySpecialty(specialty);
    }

    // Method to retrieve a doctor by email
    public Doctor getDoctorByEmail(String email) {
        return doctorRepository.findByEmail(email);
    }

    // Method to retrieve doctors by first name and last name
    public List<Doctor> getDoctorsByFullName(String firstName, String lastName) {
        return doctorRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    // Method to delete a doctor by ID
    public void deleteDoctorById(long id) {
        doctorRepository.deleteById(id);
    }
}