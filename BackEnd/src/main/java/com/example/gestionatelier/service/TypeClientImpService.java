package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.TypeClient;
import com.example.gestionatelier.repository.TypeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TypeClientImpService implements TypeClientService{
    @Autowired
    private TypeClientRepository typeClientRepository;

    @Override
    public List<TypeClient> getAllTypeClient() {
        return typeClientRepository.findAll();
    }

    @Override
    public Optional<TypeClient> getTypeClientById(long id) {
        return typeClientRepository.findById(id);
    }

    @Override
    public TypeClient saveTypeClient(TypeClient typeClient) {
        return typeClientRepository.save(typeClient);
    }

    @Override
    public TypeClient updateTypeClient(TypeClient typeClient, long id) {
        typeClient.setId(id);
        return typeClientRepository.save(typeClient);
    }

    @Override
    public void deleteTypeClient(long id) {
        typeClientRepository.deleteById(id);
    }
}
