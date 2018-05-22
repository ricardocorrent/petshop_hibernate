package Models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Fone {
        
    private int ddd;
    
    private long numero;

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
    
    
}
