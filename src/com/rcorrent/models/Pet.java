package com.rcorrent.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "reg_pet")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pet {
    
    @Id @GeneratedValue
    @Column(name = "id_pet")
    private int idPet;
    
    @Column(name = "name_pet")
    private String nmPet;
    
    @Column(name = "age_pet")
    private String agePet;
    
    @ManyToOne
    private Owner owner; 
    

    public Pet() {
    }    

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNmPet() {
        return nmPet;
    }

    public void setNmPet(String nmPet) {
        this.nmPet = nmPet;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }    

    public String getAgePet() {
        return agePet;
    }

    public void setAgePet(String agePet) {
        this.agePet = agePet;
    }

    
    
}
