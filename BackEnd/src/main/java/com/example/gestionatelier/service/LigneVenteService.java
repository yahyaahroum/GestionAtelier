package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.TypeClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LigneVenteService {
    public List<TypeClient> getAllLigneVente();
    public TypeClient getLigneVenteById(long id);
    public TypeClient saveLigneVente(TypeClient typeClient);
    public TypeClient updateLigneVente(TypeClient typeClient,long id);
    public void deleteLigneVente(long id);
}
