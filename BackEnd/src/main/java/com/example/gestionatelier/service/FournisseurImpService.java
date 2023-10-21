package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Fournisseur;
import com.example.gestionatelier.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FournisseurImpService implements FournisseurService{
    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Override
    public List<Fournisseur> getAllFournisseur() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Optional<Fournisseur> getFournisseurById(long id) {
        return fournisseurRepository.findById(id);
    }

    @Override
    public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur, long id) {
        fournisseur.setId(id);
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public void deleteFournisseur(long id) {
        fournisseurRepository.deleteById(id);
    }
}
