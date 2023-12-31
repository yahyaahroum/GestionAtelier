package com.example.gestionatelier.service;

import com.example.gestionatelier.entity.TypeClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TypeClientService {
    public List<TypeClient> getAllTypeClient();
    public TypeClient getTypeClientById(long id);
    public TypeClient saveTypeClient(TypeClient typeClient);
    public TypeClient updateTypeClient(TypeClient typeClient,long id);
    public void deleteTypeClient(long id);
}
