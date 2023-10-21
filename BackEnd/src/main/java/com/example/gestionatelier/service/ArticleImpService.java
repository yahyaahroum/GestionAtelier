package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.Article;
import com.example.gestionatelier.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ArticleImpService implements ArticleService{
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticle() {

        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> getArticleById(long id) {
        return articleRepository.findById(id);
    }

    @Override
    public Article save(Article article) {

        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article article, long id) {
        article.setId(id);
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticle(long id) {
        articleRepository.deleteById(id);
    }
}
