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
import javax.persistence.Transient;
import lombok.Data;

@Data
@Entity
@Table(name = "conge")
public class Conge implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JoinColumn(name = "type")
    @ManyToOne
    private TypeConge type;
    @Transient
    private Integer duree;
    @Column(name = "description")
    private String description;
    private String etat;
    @Column(name = "date_debut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_fin")
    private Date dateFin;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_creation")
    private Date dateCreation;
    @Column(name = "dateModification")
    private Date dateModification;
    private boolean isDelete=false;
     
    public Conge() {
    }

    public Conge(Integer id) {
        this.id = id;
    }
    

}
