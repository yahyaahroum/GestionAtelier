package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.CommandeFournisseur;
import com.example.gestionatelier.entity.LigneCdeFrs;
import com.example.gestionatelier.service.LigneCdeFrsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/LigneCdeFrs")
@AllArgsConstructor
public class LigneCdeFrsController {
    private LigneCdeFrsService ligneCdeFrsService;
    @GetMapping("/All")
    public List<LigneCdeFrs> getAllLigneCdeFrs(){
        return ligneCdeFrsService.getAllLigneCdeFrs();
    }
    @GetMapping("/{id}")
    public Optional<LigneCdeFrs> getLigneCdeFrsById(@PathVariable long id){
        return ligneCdeFrsService.getLigneCdeFrsById(id);
    }
    @PostMapping
    public LigneCdeFrs saveLigneCdeFrs(@RequestParam LigneCdeFrs ligneCdeFrs){
        return ligneCdeFrsService.saveLigneCdeFrs(ligneCdeFrs);
    }
    @PutMapping
    public LigneCdeFrs updateLigneCdeFrs(@RequestParam LigneCdeFrs ligneCdeFrs,@PathVariable long id){
        return ligneCdeFrsService.updateLigneCdeFrs(ligneCdeFrs,id);
    }
    @DeleteMapping
    public void deleteLigneCdeFrs(@PathVariable long id){
        ligneCdeFrsService.deleteLigneCdeFrs(id); ;
    }
}
