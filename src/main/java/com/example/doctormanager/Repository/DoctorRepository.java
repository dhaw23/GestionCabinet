package com.example.doctormanager.Repository;



import com.example.doctormanager.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Custom queries
    List<Doctor> findBySpecialty(String specialty); // Find doctors by specialty

    Doctor findByEmail(String email); // Find a doctor by email

    List<Doctor> findByFirstNameAndLastName(String firstName, String lastName);
}
