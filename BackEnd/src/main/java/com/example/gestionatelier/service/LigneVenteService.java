package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneVente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface LigneVenteService {
    public List<LigneVente> getAllLigneVente();
    public Optional<LigneVente> getLigneVenteById(long id);
    public LigneVente saveLigneVente(LigneVente ligneVente);
    public LigneVente updateLigneVente(LigneVente ligneVente,long id);
    public void deleteLigneVente(long id);
}
