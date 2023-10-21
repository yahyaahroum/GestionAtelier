package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.LigneVente;
import com.example.gestionatelier.service.LigneVenteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/LigneVente")
@AllArgsConstructor
public class LigneVenteController {
    private LigneVenteService ligneVenteService;
    @GetMapping("/All")
    public List<LigneVente> getAllLigneVente(){
        return ligneVenteService.getAllLigneVente();
    }
    @GetMapping("/{id}")
    public Optional<LigneVente> getLigneVenteById(@PathVariable long id){
        return ligneVenteService.getLigneVenteById(id);
    }
    @PostMapping
    public LigneVente saveLigneVente(@RequestParam LigneVente ligneVente){
        return ligneVenteService.saveLigneVente(ligneVente);
    }
    @PutMapping
    public LigneVente updateLigneVente(@RequestParam LigneVente ligneVente,@PathVariable long id){
        return ligneVenteService.updateLigneVente(ligneVente,id);
    }
    @DeleteMapping
    public void deleteLigneVente(@PathVariable long id){
        ligneVenteService.deleteLigneVente(id); ;
    }
}
