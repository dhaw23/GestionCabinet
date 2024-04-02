package com.example.doctormanager.Service;

import com.example.doctormanager.Model.Appointment;
import com.example.doctormanager.Model.Doctor;
import com.example.doctormanager.Model.MedicalFile;
import com.example.doctormanager.Model.Patient;
import com.example.doctormanager.Repository.AppointmentRepository;
import com.example.doctormanager.Repository.DoctorRepository;
import com.example.doctormanager.Repository.MedicalFileRepository;
import com.example.doctormanager.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient getPatientById(long id) {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        return optionalPatient.orElse(null);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient) {
        // Check if patient exists
        Optional<Patient> optionalPatient = patientRepository.findById(patient.getId());
        if (optionalPatient.isPresent()) {
            return patientRepository.save(patient);
        } else {
            return null; // Patient not found
        }
    }

    public boolean deletePatientById(long id) {
        // Check if patient exists
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isPresent()) {
            patientRepository.deleteById(id);
            return true;
        } else {
            return false; // Patient not found
        }
    }
}
