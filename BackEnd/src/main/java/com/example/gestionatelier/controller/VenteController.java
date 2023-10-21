package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.Vente;
import com.example.gestionatelier.service.VenteService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Ventes")
@AllArgsConstructor
public class VenteController {
    private VenteService venteService;
    @GetMapping("/All")
    public List<Vente> getAllVente(){
        return venteService.getAllVente();
    }
    @GetMapping("/{id}")
    public Optional<Vente> getVenteById(@PathVariable long id){
        return venteService.getVenteById(id);
    }
    @PostMapping()
    public Vente saveVente(@RequestParam Vente vente){
        return venteService.saveVente(vente);
    }
    @PutMapping
    public Vente updateVente(@RequestParam Vente vente,@PathVariable long id){
        return venteService.updateVente(vente,id);
    }
    @DeleteMapping
    public void deleteVente(@PathVariable long id){
        venteService.deleteVente(id); ;
    }
}
