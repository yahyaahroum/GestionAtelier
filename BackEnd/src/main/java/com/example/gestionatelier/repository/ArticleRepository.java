package com.example.gestionatelier.repository;

import com.example.gestionatelier.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository <Article,Long> {
}
