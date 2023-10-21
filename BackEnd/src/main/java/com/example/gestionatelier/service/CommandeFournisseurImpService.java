package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CommandeFournisseur;
import com.example.gestionatelier.repository.CommandeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommandeFournisseurImpService implements CommandeFournisseurService{
    @Autowired
    private CommandeClientRepository commandeClientRepository;

    @Override
    public List<CommandeFournisseur> getAllCommandeFournisseur() {
        return null;
    }

    @Override
    public CommandeFournisseur getCommandeFournisseurById(long id) {
        return null;
    }

    @Override
    public CommandeFournisseur saveCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
        return null;
    }

    @Override
    public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur commandeFournisseur, long id) {
        return null;
    }

    @Override
    public void deleteCommandeFournisseur(long id) {

    }
}
