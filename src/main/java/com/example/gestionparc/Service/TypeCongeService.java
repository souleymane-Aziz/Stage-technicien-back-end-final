/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestionparc.Service;

import com.example.gestionparc.Model.TypeConge;
import com.example.gestionparc.Repository.TypeCongeRepository;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dell
 */
@Service
public class TypeCongeService {
     @Autowired
    private TypeCongeRepository typeCongeRepository;
     
    public List<TypeConge> findAll(){
       
        return typeCongeRepository.findAll();
    }
}
