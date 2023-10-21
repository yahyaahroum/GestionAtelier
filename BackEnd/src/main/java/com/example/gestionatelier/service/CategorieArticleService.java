package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CategorieArticle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorieArticleService {
    public List<CategorieArticle> getAllCategorieArticle();
    public CategorieArticle getCategorieArticleById(long id);
    public CategorieArticle saveCategorieArticle(CategorieArticle categorieArticle);
    public CategorieArticle updateCategorieArticle(CategorieArticle categorieArticle,long id);
    public void deleteCategorieArticle(long id);

}
