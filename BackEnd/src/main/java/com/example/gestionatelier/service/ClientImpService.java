package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Client;
import com.example.gestionatelier.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientImpService implements ClientService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClient() {
        return null;
    }

    @Override
    public Client getClientById(long id) {
        return null;
    }

    @Override
    public Client saveClient(Client client) {
        return null;
    }

    @Override
    public Client updateClient(Client client, long id) {
        return null;
    }

    @Override
    public void deleteClient(long id) {

    }
}
