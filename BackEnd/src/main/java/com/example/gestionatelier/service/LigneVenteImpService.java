package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.TypeClient;
import com.example.gestionatelier.repository.LigneVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LigneVenteImpService implements LigneVenteService{
    @Autowired
    private LigneVenteRepository ligneVenteRepository;

    @Override
    public List<TypeClient> getAllLigneVente() {
        return null;
    }

    @Override
    public TypeClient getLigneVenteById(long id) {
        return null;
    }

    @Override
    public TypeClient saveLigneVente(TypeClient typeClient) {
        return null;
    }

    @Override
    public TypeClient updateLigneVente(TypeClient typeClient, long id) {
        return null;
    }

    @Override
    public void deleteLigneVente(long id) {

    }
}
