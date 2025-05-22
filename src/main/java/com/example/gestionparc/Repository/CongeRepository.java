package com.example.gestionparc.Repository;

import com.example.gestionparc.Model.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CongeRepository extends JpaRepository <Conge,Integer>{


 
    
}
