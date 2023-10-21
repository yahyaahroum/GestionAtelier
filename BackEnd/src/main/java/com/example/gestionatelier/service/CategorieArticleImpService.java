package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.CategorieArticle;
import com.example.gestionatelier.repository.CategorieArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategorieArticleImpService implements CategorieArticleService {
    @Autowired
    private CategorieArticleRepository categorieArticleRepository;

    @Override
    public List<CategorieArticle> getAllCategorieArticle() {

        return categorieArticleRepository.findAll();
    }

    @Override
    public Optional<CategorieArticle> getCategorieArticleById(long id) {

        return categorieArticleRepository.findById(id);
    }

    @Override
    public CategorieArticle saveCategorieArticle(CategorieArticle categorieArticle) {

        return categorieArticleRepository.save(categorieArticle);
    }

    @Override
    public CategorieArticle updateCategorieArticle(CategorieArticle categorieArticle, long id) {
        categorieArticle.setId(id);
        return categorieArticleRepository.save(categorieArticle);
    }

    @Override
    public void deleteCategorieArticle(long id) {
        categorieArticleRepository.deleteById(id);
    }
}
