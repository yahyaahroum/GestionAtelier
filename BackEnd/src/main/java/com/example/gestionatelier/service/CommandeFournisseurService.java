package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CommandeClient;
import com.example.gestionatelier.entity.CommandeFournisseur;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface CommandeFournisseurService {
    public List<CommandeFournisseur> getAllCommandeFournisseur();
    public Optional<CommandeFournisseur> getCommandeFournisseurById(long id);
    public CommandeFournisseur saveCommandeFournisseur(CommandeFournisseur commandeFournisseur);
    public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur commandeFournisseur,long id);
    public void deleteCommandeFournisseur(long id);
}
