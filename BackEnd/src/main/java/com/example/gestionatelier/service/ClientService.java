package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    public List<Client> getAllClient();
    public Client getClientById(long id);
    public Client saveClient(Client client);
    public Client updateClient(Client client,long id);
    public void deleteClient(long id);
}
