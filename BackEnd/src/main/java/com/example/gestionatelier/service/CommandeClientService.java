package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CommandeClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommandeClientService {
    public List<CommandeClient> getAllCommandeClient();
    public CommandeClient getCommandeClientById(long id);
    public CommandeClient saveCommandeClient(CommandeClient commandeClient);
    public CommandeClient updateCommandeClient(CommandeClient commandeClient,long id);
    public void deleteCommandeClient(long id);
}
