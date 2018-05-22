package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cad_aves")
public class Aves extends Pet{
    
    @Column(name = "tamanho_asa")
    private Double tamAsa;
    
    private String cor;

    public Aves() {
    }
   
    public Double getTamAsa() {
        return tamAsa;
    }

    public void setTamAsa(Double tamAsa) {
        this.tamAsa = tamAsa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
