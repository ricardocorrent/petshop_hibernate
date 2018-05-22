package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reg_dog_cat")
public class DogCat extends Pet {
    
    private Double height;
    
    private String race;
    
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }
    
    
    
    
    
}
