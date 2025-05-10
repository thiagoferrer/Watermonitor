package com.waterwatch.watermonitor.repository;

import com.waterwatch.watermonitor.model.Medicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicaoRepository extends JpaRepository<Medicao, Long> {
}

