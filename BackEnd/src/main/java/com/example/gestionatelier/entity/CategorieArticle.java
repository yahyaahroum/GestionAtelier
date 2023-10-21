package com.example.gestionatelier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategorieArticle extends Auditable<String> implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String libelle;


}
