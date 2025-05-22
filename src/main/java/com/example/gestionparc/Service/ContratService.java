package com.example.gestionparc.Service;

import com.example.gestionparc.Model.Contrat;
import com.example.gestionparc.Repository.ContratRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ContratService {
    @Autowired
    private ContratRepository contratRepository;
  
    public Contrat save(Contrat contrat){
        try{
            contrat.setDateCreation(new Date());
            contrat.setEtat("EN_COURS");
            contratRepository.save(contrat);
            return contrat;
        }
        catch(Exception e ){
            System.out.println("erreur");
            return null;
        }
    }
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);
    }
    public List<Contrat>findAll(){
        try{
        return contratRepository.findAll();
        }catch(Exception e ){
            System.out.println("oups erreur");
            return null;
        }
    }
     public Contrat update(Contrat contrat){
        return contratRepository.save(contrat);
    }
     public Contrat annule(Contrat contrat){
          contrat.setDateModification(new Date());
            contrat.setEtat("ANNULE");
            contratRepository.save(contrat);
            return contrat;
       
     }
}
