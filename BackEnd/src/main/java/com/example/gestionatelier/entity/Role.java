package com.example.gestionatelier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
public class Role extends Auditable<String> implements Serializable {

    @Id
    private String roleName;
    private String roleDescription;

    public Role() {

    }
}
