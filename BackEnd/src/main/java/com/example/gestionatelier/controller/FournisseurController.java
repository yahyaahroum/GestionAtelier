package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.Fournisseur;
import com.example.gestionatelier.service.FournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Fournisseur")
@AllArgsConstructor
public class FournisseurController{
    private FournisseurService fournisseurService;
    @GetMapping("/All")
    public List<Fournisseur> getAllFournisseur(){
        return fournisseurService.getAllFournisseur();
    }
    @GetMapping("/{id}")
    public Optional<Fournisseur> getFournisseurById(@PathVariable long id){
        return fournisseurService.getFournisseurById(id);
    }
    @PostMapping
    public Fournisseur saveFournisseur(@RequestParam Fournisseur fournisseur){
        return fournisseurService.saveFournisseur(fournisseur);
    }
    @PutMapping
    public Fournisseur updateFournisseur(@RequestParam Fournisseur fournisseur,@PathVariable long id){
        return fournisseurService.updateFournisseur(fournisseur,id);
    }
    @DeleteMapping
    public void deleteFournisseur(@PathVariable long id){
        fournisseurService.deleteFournisseur(id); ;
    }
}
