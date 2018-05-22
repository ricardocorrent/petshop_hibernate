package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "cad_pet")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pet {
    
    @Id @GeneratedValue
    @Column(name = "id_pet")
    private int idPet;
    
    @Column(name = "nome_pet")
    private String nmPet;
    
    @ManyToOne
    private Pessoa pessoa; 
    

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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
