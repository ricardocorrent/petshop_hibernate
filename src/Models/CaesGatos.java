package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cad_cao_gato")
public class CaesGatos extends Pet {
    
    private Double altura;
    
    private String raca;
    
    @Column(name = "tipo_pelo")
    private String tipoPelo;

    public CaesGatos() {
    } 
    
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
    
    
    
}
