package com.example.doctormanager.Repository;

import com.example.doctormanager.Model.StatistiqueEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatistiqueEntryRepository extends JpaRepository<StatistiqueEntry,Long> {
    public StatistiqueEntry getStatistiquesById(int id_patient);
}
