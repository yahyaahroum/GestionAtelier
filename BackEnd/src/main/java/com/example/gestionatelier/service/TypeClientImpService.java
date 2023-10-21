package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.TypeClient;
import com.example.gestionatelier.repository.TypeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TypeClientImpService implements TypeClientService{
    @Autowired
    private TypeClientRepository typeClientRepository;

    @Override
    public List<TypeClient> getAllTypeClient() {
        return null;
    }

    @Override
    public TypeClient getTypeClientById(long id) {
        return null;
    }

    @Override
    public TypeClient saveTypeClient(TypeClient typeClient) {
        return null;
    }

    @Override
    public TypeClient updateTypeClient(TypeClient typeClient, long id) {
        return null;
    }

    @Override
    public void deleteTypeClient(long id) {

    }
}
