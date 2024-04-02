package com.example.doctormanager.Controller;

import com.example.doctormanager.Model.Appointment;
import com.example.doctormanager.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Appointment> getAppointmentById(@PathVariable int id) {
        Appointment appointment = appointmentService.getAppointmentById(id);
        if (appointment != null) {
            return ResponseEntity.ok(appointment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/patient/{id}")
    public ResponseEntity<ArrayList<Appointment>> getAllAppointmentsByPatientId(@PathVariable int id) {
        ArrayList<Appointment> appointments = appointmentService.getAllAppointmentById(id);
        return ResponseEntity.ok(appointments);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointmentById(@PathVariable int id) {
        boolean deleted = appointmentService.deleteAppointmentById(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/take")
    public ResponseEntity<String> takeAppointment(@RequestParam String dateOfAppointment,
                                                  @RequestParam String description,
                                                  @RequestParam String typeOfIllness) {
        boolean success = appointmentService.takeAppointment(dateOfAppointment, description, typeOfIllness);
        if (success) {
            return ResponseEntity.ok("Appointment taken successfully");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to take appointment");
        }
    }

    @GetMapping("/not-fulfilled")
    public ResponseEntity<ArrayList<Appointment>> getNotFulfilledAppointments() {
        ArrayList<Appointment> appointments = appointmentService.ListeAppointmentNF();
        return ResponseEntity.ok(appointments);
    }

    @DeleteMapping("/patient/{id}")
    public ResponseEntity<Void> deleteAppointmentsByPatientId(@PathVariable int id) {
        int deletedCount = appointmentService.SupprimerAppointmentPatient(id);
        if (deletedCount > 0) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/fulfilled")
    public ResponseEntity<ArrayList<Appointment>> getFulfilledAppointments() {
        ArrayList<Appointment> appointments = appointmentService.ListeAppointmentF();
        return ResponseEntity.ok(appointments);
    }
}