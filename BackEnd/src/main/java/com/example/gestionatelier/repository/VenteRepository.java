package com.example.gestionatelier.repository;

import com.example.gestionatelier.entity.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente,Long> {
}
