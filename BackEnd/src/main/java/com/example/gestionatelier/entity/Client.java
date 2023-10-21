package com.example.gestionatelier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client extends Auditable<String> implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String kissaria;
    private String numMagasin;
    private String ville;
    @ManyToOne
    @JoinColumn(name="id_typeclient")
    private TypeClient typeClient;
}
