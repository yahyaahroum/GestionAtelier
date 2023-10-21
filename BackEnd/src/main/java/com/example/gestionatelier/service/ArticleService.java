package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Article;
import com.example.gestionatelier.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ArticleService {
    public List<Article> getAllArticle();
    public Article getArticleById(long id);
    public Article save(Article article);
    public Article updateArticle(Article article,long id);
    public void deleteArticle(long id);




}
