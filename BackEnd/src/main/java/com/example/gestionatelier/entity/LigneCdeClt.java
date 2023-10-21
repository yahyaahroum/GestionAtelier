package com.example.gestionatelier.entity;


import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LigneCdeClt extends Auditable<String> implements Serializable {
    @Id
    @Generated
    private Long id;
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;
    @ManyToOne
    @JoinColumn(name="idcommandeclient")
    private CommandeClient commandeClient;
}
