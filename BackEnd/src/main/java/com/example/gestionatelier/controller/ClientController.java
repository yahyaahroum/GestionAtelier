package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.Client;
import com.example.gestionatelier.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Client")
@AllArgsConstructor
public class ClientController {
    private ClientService clientService;
    @GetMapping("/All")
    public List<Client> getAllClient(){
        return clientService.getAllClient();
    }
    @GetMapping("/{id}")
    public Optional<Client> getClientById(@PathVariable long id){
        return clientService.getClientById(id);
    }
    @PostMapping
    public Client saveClient(@RequestParam Client client){
        return clientService.saveClient(client);
    }
    @PutMapping
    public Client updateClient(@RequestParam Client client,@PathVariable long id){
        return clientService.updateClient(client,id);
    }
    @DeleteMapping
    public void deleteClient(@PathVariable long id){
        clientService.deleteClient(id); ;
    }
}
