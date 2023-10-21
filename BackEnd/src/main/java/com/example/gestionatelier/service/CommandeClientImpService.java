package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CommandeClient;
import com.example.gestionatelier.repository.CommandeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CommandeClientImpService implements CommandeClientService{
    @Autowired
    private CommandeClientRepository commandeClientRepository;

    @Override
    public List<CommandeClient> getAllCommandeClient() {

        return commandeClientRepository.findAll();
    }

    @Override
    public Optional<CommandeClient> getCommandeClientById(long id) {

        return commandeClientRepository.findById(id);
    }

    @Override
    public CommandeClient saveCommandeClient(CommandeClient commandeClient) {
        return commandeClientRepository.save(commandeClient);
    }

    @Override
    public CommandeClient updateCommandeClient(CommandeClient commandeClient, long id) {
        commandeClient.setId(id);
        return commandeClientRepository.save(commandeClient);
    }

    @Override
    public void deleteCommandeClient(long id) {
        commandeClientRepository.deleteById(id);
    }
}
