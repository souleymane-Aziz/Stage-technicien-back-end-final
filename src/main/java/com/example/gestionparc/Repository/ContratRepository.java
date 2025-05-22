package com.example.gestionparc.Repository;

import com.example.gestionparc.Model.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Integer> {

  

}
