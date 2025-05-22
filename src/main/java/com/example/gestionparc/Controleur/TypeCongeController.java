/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestionparc.Controleur;

import com.example.gestionparc.Model.TypeConge;
import com.example.gestionparc.Service.TypeCongeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dell
 */
@RestController
@RequestMapping("/typeconge")
public class TypeCongeController {
    @Autowired
    public TypeCongeService typeCongeService;
    
    @GetMapping("/findAll")
    public List<TypeConge> findAll() {
        List <TypeConge> TypeConges = typeCongeService.findAll();
        return TypeConges;
    }
}
