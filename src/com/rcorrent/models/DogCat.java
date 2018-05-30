package com.rcorrent.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reg_dog_cat")
public class DogCat extends Pet {
    
    private Double height;
    
    private String breed;
    
    @Column(name = "hair_type")
    private String hairType;

    public DogCat() {
    } 

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }
    
    
    
    
    
}
