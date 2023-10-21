package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneCdeFrs;
import com.example.gestionatelier.repository.LigneCdeFrsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LigneCdeFrsImpService implements LigneCdeFrsService{
    @Autowired
    private LigneCdeFrsRepository ligneCdeFrsRepository;

    @Override
    public List<LigneCdeFrs> getAllLigneCdeFrs() {
        return null;
    }

    @Override
    public LigneCdeFrs getLigneCdeFrsById(long id) {
        return null;
    }

    @Override
    public LigneCdeFrs saveLigneCdeFrs(LigneCdeFrs ligneCdeFrs) {
        return null;
    }

    @Override
    public LigneCdeFrs updateLigneCdeFrs(LigneCdeFrs ligneCdeFrs, long id) {
        return null;
    }

    @Override
    public void deleteLigneCdeFrs(long id) {

    }
}
