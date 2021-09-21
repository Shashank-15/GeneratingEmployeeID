package com.example.GenratingIdStandard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {

    @Autowired
    private EntityRepository repository;

    public List<Model> fetchId(){
        return repository.findAll();
    }






}
