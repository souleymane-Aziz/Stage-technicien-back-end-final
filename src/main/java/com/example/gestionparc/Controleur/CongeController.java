/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestionparc.Controleur;

import com.example.gestionparc.Model.Conge;
import com.example.gestionparc.Service.CongeService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author dell
 */
@RestController
@RequestMapping("/conges")
public class CongeController {

    @Autowired
    public CongeService congeService;

    @PostMapping("/save")
    public Conge save(@RequestBody Conge conge) {
        return congeService.save(conge);
    }
  
    @GetMapping("/findAll")
    public List<Conge> findAll() {
        List <Conge> conges = congeService.findAll();
        return conges;
    }
  
    @PostMapping("/update")
    public Conge update(@RequestBody Conge conge){
        conge.setDateModification(new Date());
        return congeService.save(conge);
        
    }
    @PutMapping("/valide")
    public Conge valide(@RequestBody Conge conge){
        return congeService.valide(conge);
    }
     @PutMapping("/annule")
    public Conge annule(@RequestBody Conge conge){
        return congeService.annule(conge);
    }
    @RequestMapping("/test")
    public String test() {
        return "index.html";
    }
    
  
    
   
}
