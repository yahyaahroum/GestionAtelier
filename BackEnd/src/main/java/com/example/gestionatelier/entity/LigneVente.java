package com.example.gestionatelier.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LigneVente extends Auditable<String> implements Serializable {
    @Id
    @Generated
    private Long id;
    @ManyToOne
    @JoinColumn(name="idvente")
    private Vente vente;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;
}
