/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestionparc.Controleur;

import com.example.gestionparc.Model.Conge;
import com.example.gestionparc.Model.Contrat;
import com.example.gestionparc.Repository.ContratRepository;
import com.example.gestionparc.Service.ContratService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/contrats")
public class ContratController {
    @Autowired
    public ContratService contratService;
    
    @PostMapping("/save")
    public Contrat save(@RequestBody Contrat contrat){
        contrat.setEtat("EN_ATTENTE");
        return contratService.save(contrat);
    }
    @GetMapping("/findAll")
    public List<Contrat> findAll() {
        List<Contrat> contrats = contratService.findAll();
        return contrats;
    }
    @PostMapping("/update")
    public Contrat update(@RequestBody Contrat contrat){
        contrat.setDateModification(new Date());
        return contratService.save(contrat);
        
    }
    @PutMapping("/annule")
    public Contrat annule(@RequestBody Contrat contrat){
        return contratService.annule(contrat);
    }
}
