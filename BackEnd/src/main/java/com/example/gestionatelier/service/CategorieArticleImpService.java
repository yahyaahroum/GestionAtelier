package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CategorieArticle;
import com.example.gestionatelier.repository.CategorieArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategorieArticleImpService implements CategorieArticleService {
    @Autowired
    private CategorieArticleRepository categorieArticleRepository;

    @Override
    public List<CategorieArticle> getAllCategorieArticle() {
        return null;
    }

    @Override
    public CategorieArticle getCategorieArticleById(long id) {
        return null;
    }

    @Override
    public CategorieArticle saveCategorieArticle(CategorieArticle categorieArticle) {
        return null;
    }

    @Override
    public CategorieArticle updateCategorieArticle(CategorieArticle categorieArticle, long id) {
        return null;
    }

    @Override
    public void deleteCategorieArticle(long id) {

    }
}
