package com.rcorrent.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reg_bird")
public class Bird extends Pet{
    
    @Column(name = "wing_size")
    private Double wingSize;
    
    private String color;

    public Bird() {
    }

    public Double getWingSize() {
        return wingSize;
    }

    public void setWingSize(Double wingSize) {
        this.wingSize = wingSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
