package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Vente;
import com.example.gestionatelier.repository.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VenteImpService implements VenteService{
    @Autowired
    private VenteRepository venteRepository;

    @Override
    public List<Vente> getAllVente() {
        return venteRepository.findAll();
    }

    @Override
    public Optional<Vente> getVenteById(long id) {

        return venteRepository.findById(id);
    }

    @Override
    public Vente saveVente(Vente vente) {

        return venteRepository.save(vente);
    }

    @Override
    public Vente updateVente(Vente vente, long id) {
        vente.setId(id);
        return venteRepository.save(vente);
    }

    @Override
    public void deleteVente(long id) {
        venteRepository.deleteById(id);
    }
}
