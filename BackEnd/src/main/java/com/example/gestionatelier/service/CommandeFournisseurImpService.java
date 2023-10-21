package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CommandeFournisseur;
import com.example.gestionatelier.repository.CommandeFournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CommandeFournisseurImpService implements CommandeFournisseurService{
    @Autowired
    private CommandeFournisseurRepository commandeFournisseurRepository;

    @Override
    public List<CommandeFournisseur> getAllCommandeFournisseur() {
        return commandeFournisseurRepository.findAll();
    }

    @Override
    public Optional<CommandeFournisseur> getCommandeFournisseurById(long id) {
        return commandeFournisseurRepository.findById(id);
    }

    @Override
    public CommandeFournisseur saveCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
        return commandeFournisseurRepository.save(commandeFournisseur);
    }

    @Override
    public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur commandeFournisseur, long id) {
        commandeFournisseur.setId(id);
        return commandeFournisseurRepository.save(commandeFournisseur);
    }

    @Override
    public void deleteCommandeFournisseur(long id) {
        commandeFournisseurRepository.deleteById(id);
    }
}
