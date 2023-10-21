package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneCdeClt;
import com.example.gestionatelier.repository.LigneCdeCltRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LigneCdeCltImpService implements LigneCdeCltService{
    @Autowired
    private LigneCdeCltRepository ligneCdeCltRepository;

    @Override
    public List<LigneCdeClt> getAllLigneCdeClt() {
        return ligneCdeCltRepository.findAll();
    }

    @Override
    public Optional<LigneCdeClt> getLigneCdeCltById(long id) {
        return ligneCdeCltRepository.findById(id);
    }

    @Override
    public LigneCdeClt saveLigneCdeClt(LigneCdeClt ligneCdeClt) {

        return ligneCdeCltRepository.save(ligneCdeClt);
    }

    @Override
    public LigneCdeClt updateLigneCdeClt(LigneCdeClt ligneCdeClt, long id) {
        ligneCdeClt.setId(id);
        return ligneCdeCltRepository.save(ligneCdeClt);
    }

    @Override
    public void deleteLigneCdeClt(long id) {
        ligneCdeCltRepository.deleteById(id);
    }
}
