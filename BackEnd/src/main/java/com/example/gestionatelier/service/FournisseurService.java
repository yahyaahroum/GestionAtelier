package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Fournisseur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FournisseurService {
    public List<Fournisseur> getAllFournisseur();
    public Fournisseur getFournisseurById(long id);
    public Fournisseur saveFournisseur(Fournisseur fournisseur);
    public Fournisseur updateFournisseur(Fournisseur fournisseur,long id);

    public void deleteFournisseur(long id);
}
