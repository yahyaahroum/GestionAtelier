package com.example.gestionatelier.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CommandeClient extends Auditable<String> implements Serializable {
    @Id
    @Generated
    private Long id;
    private String code;
    private Instant dateCommande;
    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;
    @JsonIgnore
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCdeClt> listeLigneCmdClt;
}