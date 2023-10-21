package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Fournisseur;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface FournisseurService {
    public List<Fournisseur> getAllFournisseur();
    public Optional<Fournisseur> getFournisseurById(long id);
    public Fournisseur saveFournisseur(Fournisseur fournisseur);
    public Fournisseur updateFournisseur(Fournisseur fournisseur,long id);

    public void deleteFournisseur(long id);
}
