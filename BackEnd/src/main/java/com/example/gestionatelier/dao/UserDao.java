package com.example.gestionatelier.dao;


import com.example.gestionatelier.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<Utilisateur, String> {
}
