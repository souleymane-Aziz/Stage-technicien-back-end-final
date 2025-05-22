package com.example.gestionparc.Model;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="contrat")
public class Contrat implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    @Column(name="description")
    private String description;
    @Column(name="date_debut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebut;
    @Column(name="date_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFin;
    private String etat;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreation;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateModification;
    @JoinColumn(name = "employe")
    @ManyToOne
    private Employe employe;
    
public Contrat(){}

}
