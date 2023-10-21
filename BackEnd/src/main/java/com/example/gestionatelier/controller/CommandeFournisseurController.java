package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.CommandeFournisseur;
import com.example.gestionatelier.service.CommandeFournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CommandeFournisseur")
@AllArgsConstructor
public class CommandeFournisseurController {
    private CommandeFournisseurService commandeFournisseurService;
    @GetMapping("/All")
    public List<CommandeFournisseur> getAllCommandeFournisseur(){
        return commandeFournisseurService.getAllCommandeFournisseur();
    }
    @GetMapping("/{id}")
    public Optional<CommandeFournisseur> getCommandeFournisseurById(@PathVariable long id){
        return commandeFournisseurService.getCommandeFournisseurById(id);
    }
    @PostMapping
    public CommandeFournisseur saveCommandeFournisseur(@RequestParam CommandeFournisseur commandeFournisseur){
        return commandeFournisseurService.saveCommandeFournisseur(commandeFournisseur);
    }
    @PutMapping
    public CommandeFournisseur updateCommandeFournisseur(@RequestParam CommandeFournisseur commandeFournisseur,@PathVariable long id){
        return commandeFournisseurService.updateCommandeFournisseur(commandeFournisseur,id);
    }
   @DeleteMapping
    public void deleteCommandeFournisseur(@PathVariable long id){
       commandeFournisseurService.deleteCommandeFournisseur(id); ;
    }
}
