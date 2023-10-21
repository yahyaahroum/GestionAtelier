package com.example.gestionatelier.repository;

import com.example.gestionatelier.entity.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient,Long> {
}
