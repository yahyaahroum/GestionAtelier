package com.example.gestionatelier.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Vente extends Auditable<String> implements Serializable {
    @Id
    @Generated
    private Long id;
    private Instant dateVente;
    private String commentaire;
    @ManyToOne
    @JoinColumn(name = "id_commandeclient")
    private CommandeClient commandeClient;

}
