package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.LigneCdeClt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LigneCdeCltService {
    public List<LigneCdeClt> getAllLigneCdeClt();
    public LigneCdeClt getLigneCdeCltById(long id);
    public LigneCdeClt saveLigneCdeClt(LigneCdeClt ligneCdeClt);
    public LigneCdeClt updateLigneCdeClt(LigneCdeClt ligneCdeClt, long id);
    public void deleteLigneCdeClt(long id);
}
