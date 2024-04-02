package com.example.doctormanager.Repository;

import com.example.doctormanager.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    public Appointment getAppointmentById(int id);
    public ArrayList<Appointment> getAllAppointmentById(int id_patient);
    public boolean deleteAppointmentById(int id);

    public boolean takeAppointment(Appointment appointment);

    public ArrayList<Appointment> ListeAppointmentNF();
    public int SupprimerAppointmentPatient(int id_p);
    public ArrayList<Appointment> ListeAppointmentF();

}
