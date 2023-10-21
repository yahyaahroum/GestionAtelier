package com.example.gestionatelier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponse {
    private Utilisateur user;
    private String jwtToken;
}
