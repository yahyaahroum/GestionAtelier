package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Vente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface VenteService {
    public List<Vente> getAllVente();
    public Optional<Vente> getVenteById(long id);
    public Vente saveVente(Vente vente);
    public Vente updateVente(Vente vente,long id);
    public void deleteVente(long id);
}
