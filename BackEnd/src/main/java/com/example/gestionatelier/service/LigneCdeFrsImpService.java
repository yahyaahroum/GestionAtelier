package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneCdeFrs;
import com.example.gestionatelier.repository.LigneCdeFrsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LigneCdeFrsImpService implements LigneCdeFrsService{
    @Autowired
    private LigneCdeFrsRepository ligneCdeFrsRepository;

    @Override
    public List<LigneCdeFrs> getAllLigneCdeFrs() {
        return ligneCdeFrsRepository.findAll();
    }

    @Override
    public Optional<LigneCdeFrs> getLigneCdeFrsById(long id) {
        return ligneCdeFrsRepository.findById(id);
    }

    @Override
    public LigneCdeFrs saveLigneCdeFrs(LigneCdeFrs ligneCdeFrs) {
        return ligneCdeFrsRepository.save(ligneCdeFrs);
    }

    @Override
    public LigneCdeFrs updateLigneCdeFrs(LigneCdeFrs ligneCdeFrs, long id) {
        ligneCdeFrs.setId(id);
        return ligneCdeFrsRepository.save(ligneCdeFrs);
    }

    @Override
    public void deleteLigneCdeFrs(long id) {
        ligneCdeFrsRepository.deleteById(id);
    }
}
