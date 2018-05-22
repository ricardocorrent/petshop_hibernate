package Models;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cad_pessoa")
public class Pessoa {
    
    @Id @GeneratedValue
    @Column(name = "id_pessoa")
    private int idPessoa;
    
    @Column(name = "nome_pessoa")
    private String nmPessoa;
    
    @ElementCollection
    @CollectionTable (name="Telefones_das_pessoas" , joinColumns = @JoinColumn (name="pessoa_id")) //nome da tabela e nome do atributo da tabela
    @AttributeOverrides({
        @AttributeOverride(name = "ddd", column = @Column(name = "DDD")), //sobrescreve o nome da tabela
        @AttributeOverride(name = "numero", column = @Column(name = "Numero"))
    })
    private Collection<Fone> fones;
    
    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Collection<Pet> pets;
    
    public Pessoa() {
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

    public Collection<Fone> getFones() {
        return fones;
    }

    public void setFones(Collection<Fone> fones) {
        this.fones = fones;
    }

    public Collection<Pet> getPets() {
        return pets;
    }

    public void setPets(Collection<Pet> pets) {
        this.pets = pets;
    }
    
    
}
