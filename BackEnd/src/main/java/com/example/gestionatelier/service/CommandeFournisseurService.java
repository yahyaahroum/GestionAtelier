package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CommandeFournisseur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommandeFournisseurService {
    public List<CommandeFournisseur> getAllCommandeFournisseur();
    public CommandeFournisseur getCommandeFournisseurById(long id);
    public CommandeFournisseur saveCommandeFournisseur(CommandeFournisseur commandeFournisseur);
    public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur commandeFournisseur,long id);
    public void deleteCommandeFournisseur(long id);
}
