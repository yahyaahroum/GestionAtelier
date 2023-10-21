package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneVente;
import com.example.gestionatelier.repository.LigneVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LigneVenteImpService implements LigneVenteService{
    @Autowired
    private LigneVenteRepository ligneVenteRepository;

    @Override
    public List<LigneVente> getAllLigneVente() {
        return ligneVenteRepository.findAll();
    }

    @Override
    public Optional<LigneVente> getLigneVenteById(long id) {
        return ligneVenteRepository.findById(id);
    }

    @Override
    public LigneVente saveLigneVente(LigneVente ligneVente) {
        return ligneVenteRepository.save(ligneVente) ;
    }

    @Override
    public LigneVente updateLigneVente(LigneVente ligneVente, long id) {
        ligneVente.setId(id);
        return ligneVenteRepository.save(ligneVente);
    }

    @Override
    public void deleteLigneVente(long id) {
        ligneVenteRepository.deleteById(id);
    }
}
