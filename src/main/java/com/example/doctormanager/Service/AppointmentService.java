package com.example.doctormanager.Service;

import com.example.doctormanager.Model.Appointment;
import com.example.doctormanager.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public Appointment getAppointmentById(int id) {
        return appointmentRepository.getAppointmentById(id);
    }

    public ArrayList<Appointment> getAllAppointmentById(int id_patient) {
        return appointmentRepository.getAllAppointmentById(id_patient);
    }

    public boolean deleteAppointmentById(int id) {
        return appointmentRepository.deleteAppointmentById(id);
    }

    public boolean takeAppointment(String dateOfAppointment, String description, String typeOfIllness) {
        try {
            Appointment appointment = new Appointment(dateOfAppointment, description, typeOfIllness, false, null);

            appointmentRepository.save(appointment);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<Appointment> ListeAppointmentNF() {
        return appointmentRepository.ListeAppointmentNF();
    }

    public int SupprimerAppointmentPatient(int id_p) {
        return appointmentRepository.SupprimerAppointmentPatient(id_p);
    }

    public ArrayList<Appointment> ListeAppointmentF() {
        return appointmentRepository.ListeAppointmentF();
    }
}