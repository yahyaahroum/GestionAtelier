package com.example.gestionatelier.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CommandeFournisseur extends Auditable<String> implements Serializable {
    @Id
    @Generated
    private Long id;
    private String code;
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name="idfournisseur")
    private Fournisseur fournisseur;
    @JsonIgnore
    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCdeFrs> listeLigneCmdFrs;
}
