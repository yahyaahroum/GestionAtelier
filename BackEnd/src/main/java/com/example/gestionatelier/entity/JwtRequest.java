package com.example.gestionatelier.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtRequest {

    private String userName;
    private String userPassword;

}
