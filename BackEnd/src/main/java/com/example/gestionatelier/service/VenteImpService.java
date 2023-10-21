package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Vente;
import com.example.gestionatelier.repository.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VenteImpService implements VenteService{
    @Autowired
    private VenteRepository venteRepository;

    @Override
    public List<Vente> getAllVente() {
        return null;
    }

    @Override
    public Vente getVenteById(long id) {
        return null;
    }

    @Override
    public Vente saveVente(Vente vente) {
        return null;
    }

    @Override
    public Vente updateVente(Vente vente, long id) {
        return null;
    }

    @Override
    public void deleteVente(long id) {

    }
}
