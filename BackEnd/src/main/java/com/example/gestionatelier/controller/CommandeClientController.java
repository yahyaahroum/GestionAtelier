package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.CommandeClient;
import com.example.gestionatelier.service.CommandeClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CommandeClient")
@AllArgsConstructor
public class CommandeClientController {
    private CommandeClientService commandeClientService;
    @GetMapping("/All")
    public List<CommandeClient> getAllCommandeClient(){
        return commandeClientService.getAllCommandeClient();
    }
    @GetMapping("/{id}")
    public Optional<CommandeClient> getCommandeClientById(@PathVariable long id){
        return commandeClientService.getCommandeClientById(id);
    }
    @PostMapping
    public CommandeClient saveCommandeClient(@RequestParam CommandeClient commandeClient){
        return commandeClientService.saveCommandeClient(commandeClient);
    }
    @PutMapping
    public CommandeClient updateCommandeClient(@RequestParam CommandeClient commandeClient,@PathVariable long id){
        return commandeClientService.updateCommandeClient(commandeClient,id);
    }
    @DeleteMapping
    public void deleteCommandeClient(@PathVariable long id){
        commandeClientService.deleteCommandeClient(id); ;
    }
}
