package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.LigneCdeClt;
import com.example.gestionatelier.service.LigneCdeCltService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/LigneCdeClt")
@AllArgsConstructor
public class LigneCdeCltController{
    private LigneCdeCltService ligneCdeCltService;
    @GetMapping("/All")
    public List<LigneCdeClt> getAllLigneCdeClt(){
        return ligneCdeCltService.getAllLigneCdeClt();
    }
    @GetMapping("/{id}")
    public Optional<LigneCdeClt> getLigneCdeCltById(@PathVariable long id){
        return ligneCdeCltService.getLigneCdeCltById(id);
    }
    @PostMapping
    public LigneCdeClt saveLigneCdeClt(@RequestParam LigneCdeClt ligneCdeClt){
        return ligneCdeCltService.saveLigneCdeClt(ligneCdeClt);
    }
    @PutMapping
    public LigneCdeClt updateLigneCdeClt(@RequestParam LigneCdeClt ligneCdeClt,@PathVariable long id){
        return ligneCdeCltService.updateLigneCdeClt(ligneCdeClt,id);
    }
    @DeleteMapping
    public void deleteLigneCdeClt(@PathVariable long id){
        ligneCdeCltService.deleteLigneCdeClt(id); ;
    }
}
