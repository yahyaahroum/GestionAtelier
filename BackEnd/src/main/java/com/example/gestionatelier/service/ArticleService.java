package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ArticleService {
    public List<Article> getAllArticle();
    public Optional<Article> getArticleById(long id);
    public Article save(Article article);
    public Article updateArticle(Article article,long id);
    public void deleteArticle(long id);




}
