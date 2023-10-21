package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.CategorieArticle;
import com.example.gestionatelier.service.CategorieArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/CategorieArticle")
@AllArgsConstructor
public class CategorieArticleController{
    private CategorieArticleService categorieArticleService;
    @GetMapping("/All")
    public List<CategorieArticle> getAllCategorieArticle(){
    return categorieArticleService.getAllCategorieArticle();
}
    @GetMapping("/{id}")
    public Optional<CategorieArticle> getCategorieArticleById(@PathVariable long id){
        return categorieArticleService.getCategorieArticleById(id);
    }
    @PostMapping
    public CategorieArticle saveCategorieArticle(@RequestParam CategorieArticle categorieArticle){
        return categorieArticleService.saveCategorieArticle(categorieArticle);
    }
    @PutMapping
    public CategorieArticle updateCategorieArticle(@RequestParam CategorieArticle categorieArticle,@PathVariable long id){
        return categorieArticleService.updateCategorieArticle(categorieArticle,id);
    }
    @DeleteMapping
    public void deleteCategorieArticle(@PathVariable long id){
        categorieArticleService.deleteCategorieArticle(id); ;
    }

}
