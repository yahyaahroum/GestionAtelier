package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CommandeClient;
import com.example.gestionatelier.repository.CommandeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommandeClientImpService implements CommandeClientService{
    @Autowired
    private CommandeClientRepository commandeClientRepository;

    @Override
    public List<CommandeClient> getAllCommandeClient() {
        return null;
    }

    @Override
    public CommandeClient getCommandeClientById(long id) {
        return null;
    }

    @Override
    public CommandeClient saveCommandeClient(CommandeClient commandeClient) {
        return null;
    }

    @Override
    public CommandeClient updateCommandeClient(CommandeClient commandeClient, long id) {
        return null;
    }

    @Override
    public void deleteCommandeClient(long id) {

    }
}
