package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Fournisseur;
import com.example.gestionatelier.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FournisseurImpService implements FournisseurService{
    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Override
    public List<Fournisseur> getAllFournisseur() {
        return null;
    }

    @Override
    public Fournisseur getFournisseurById(long id) {
        return null;
    }

    @Override
    public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        return null;
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur, long id) {
        return null;
    }

    @Override
    public void deleteFournisseur(long id) {

    }
}
