package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.TypeClient;
import com.example.gestionatelier.service.TypeClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TypeClient")
@AllArgsConstructor
public class TypeClientController {
    private TypeClientService typeClientService;
    @GetMapping("/All")
    public List<TypeClient> getAllTypeClient(){
        return typeClientService.getAllTypeClient();
    }
    @GetMapping("/{id}")
    public Optional<TypeClient> getTypeClientById(@PathVariable long id){
        return typeClientService.getTypeClientById(id);
    }
    @PostMapping
    public TypeClient saveTypeClient(@RequestParam TypeClient typeClient){
        return typeClientService.saveTypeClient(typeClient);
    }
    @PutMapping
    public TypeClient updateTypeClient(@RequestParam TypeClient typeClient,@PathVariable long id){
        return typeClientService.updateTypeClient(typeClient,id);
    }
    @DeleteMapping
    public void deleteTypeClient(@PathVariable long id){
        typeClientService.deleteTypeClient(id); ;
    }
}
