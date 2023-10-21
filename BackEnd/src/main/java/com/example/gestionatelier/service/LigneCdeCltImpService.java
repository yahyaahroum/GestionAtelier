package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneCdeClt;
import com.example.gestionatelier.repository.LigneCdeCltRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LigneCdeCltImpService implements LigneCdeCltService{
    @Autowired
    private LigneCdeCltRepository ligneCdeCltRepository;

    @Override
    public List<LigneCdeClt> getAllLigneCdeClt() {
        return null;
    }

    @Override
    public LigneCdeClt getLigneCdeCltById(long id) {
        return null;
    }

    @Override
    public LigneCdeClt saveLigneCdeClt(LigneCdeClt ligneCdeClt) {
        return null;
    }

    @Override
    public LigneCdeClt updateLigneCdeClt(LigneCdeClt ligneCdeClt, long id) {
        return null;
    }

    @Override
    public void deleteLigneCdeClt(long id) {

    }
}
