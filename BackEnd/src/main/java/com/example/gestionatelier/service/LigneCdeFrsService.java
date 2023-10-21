package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneCdeFrs;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
public interface LigneCdeFrsService {
    public List<LigneCdeFrs> getAllLigneCdeFrs();
    public Optional<LigneCdeFrs> getLigneCdeFrsById(long id);
    public LigneCdeFrs saveLigneCdeFrs(LigneCdeFrs ligneCdeFrs);
    public LigneCdeFrs updateLigneCdeFrs(LigneCdeFrs ligneCdeFrs,long id);
    public void deleteLigneCdeFrs(long id);
}
