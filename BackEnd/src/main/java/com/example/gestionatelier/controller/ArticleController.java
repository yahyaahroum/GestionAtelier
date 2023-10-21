package com.example.gestionatelier.controller;

import com.example.gestionatelier.entity.Article;
import com.example.gestionatelier.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Article")
@AllArgsConstructor
public class ArticleController {

     private ArticleService articleService;
    @GetMapping("/All")
    public List<Article> getAllArticle(){
        return articleService.getAllArticle();
    }
    @GetMapping("/{id}")
    public Optional<Article> getArticleById(@PathVariable long id){
        return articleService.getArticleById(id);
    }
    @PostMapping
    public Article save(@RequestParam Article article){
        return articleService.save(article);
    }
    @PutMapping
    public Article updateArticle(@RequestParam Article article,@PathVariable long id){
        return articleService.updateArticle(article,id);
    }
    @DeleteMapping
    public void deleteArticle(@PathVariable long id){
        articleService.deleteArticle(id); ;
    }
}
