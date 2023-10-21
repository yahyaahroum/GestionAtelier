package com.example.gestionatelier.repository;

import com.example.gestionatelier.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client,Long>{
}
