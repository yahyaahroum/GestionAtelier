package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Article;
import com.example.gestionatelier.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleImpService implements ArticleService{
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticle() {
        return null;
    }

    @Override
    public Article getArticleById(long id) {
        return null;
    }

    @Override
    public Article save(Article article) {
        return null;
    }

    @Override
    public Article updateArticle(Article article, long id) {
        return null;
    }

    @Override
    public void deleteArticle(long id) {

    }
}
