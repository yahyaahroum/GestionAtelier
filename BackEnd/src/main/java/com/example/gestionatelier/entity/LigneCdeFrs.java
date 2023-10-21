package com.example.gestionatelier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LigneCdeFrs extends Auditable<String> implements Serializable {
    @Id
    @Generated
    private Long id;

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;
    @ManyToOne
    @JoinColumn
    private CommandeFournisseur commandeFournisseur;

}
