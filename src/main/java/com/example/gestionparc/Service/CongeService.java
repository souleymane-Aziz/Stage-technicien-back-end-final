/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestionparc.Service;

import com.example.gestionparc.Model.Conge;
import com.example.gestionparc.Model.Contrat;
import com.example.gestionparc.Repository.CongeRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author dell
 */
@Service
public class CongeService {
    
    @Autowired
    public CongeRepository congeRepository;
    
    public Conge save(Conge conge){
      
        try{
            conge.setDateCreation(new Date());
            conge.setEtat("EN_ATTENTE");
            congeRepository.save(conge);
            return conge;
        }
        catch(Exception e ){
            System.out.println("erreur");
            return null;
        }
      
    }
    public void delete(Integer Id){
       congeRepository.deleteById(Id);

    }
    public List<Conge> findAll(){
       
        return congeRepository.findAll();
    }
    public Conge update(Conge conge){
        return congeRepository.save(conge);
    }
    
    public Conge valide( Conge conge){
            conge.setDateModification(new Date());
            conge.setEtat("VALIDE");
           return congeRepository.save(conge);
            //return conge;
           // System.out.println("erreur");
            // return null;
        
    }
        public Conge annule(Conge conge){
        try{
            conge.setDateModification(new Date());
            conge.setEtat("ANNULE");
            congeRepository.save(conge);
            return conge;
        }
        catch(Exception e ){
            System.out.println("erreur");
            return null;
        }
        
    }
}
