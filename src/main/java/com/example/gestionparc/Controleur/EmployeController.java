/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestionparc.Controleur;

import com.example.gestionparc.Model.Employe;
import com.example.gestionparc.Service.EmployeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dell
 */
@RestController
@RequestMapping("/employe")
public class EmployeController {
    @Autowired
    private EmployeService employeService;
    @PostMapping("/save")
     public Employe save(@RequestBody Employe employe) {
        return employeService.save(employe);
    }
    @GetMapping("/findAll")
    public List<Employe> findAll(){
        List <Employe> employes = employeService.findAll();
        return employes;
    }
}
