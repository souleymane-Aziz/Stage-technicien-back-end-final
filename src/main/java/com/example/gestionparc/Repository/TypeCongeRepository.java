/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.gestionparc.Repository;

import com.example.gestionparc.Model.Contrat;
import com.example.gestionparc.Model.TypeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TypeCongeRepository extends JpaRepository<TypeConge,Integer> {

  

}
