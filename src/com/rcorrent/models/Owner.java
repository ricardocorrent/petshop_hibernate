package com.rcorrent.models;

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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reg_owner")
public class Owner {
    
    @Id @GeneratedValue
    @Column(name = "owner_id")
    private int idOwner;
    
    @Column(name = "owner_name")
    private String nmOwner;
    

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable (name="owner_phones" , joinColumns = @JoinColumn (name="owner_id")) //nome da tabela e nome do atributo da tabela
    @AttributeOverrides({
        @AttributeOverride(name = "ac", column = @Column(name = "AreaCode")), //sobrescreve o nome da tabela
        @AttributeOverride(name = "number", column = @Column(name = "Number"))
    })
    private Collection<Phone> phones = new ArrayList();
    
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Collection<Pet> pets = new ArrayList<Pet>();
    
    public Owner() {
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getNmOwner() {
        return nmOwner;
    }

    public void setNmOwner(String nmOwner) {
        this.nmOwner = nmOwner;
    }

    public Collection<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Collection<Phone> phones) {
        this.phones = phones;
    }    

    public Collection<Pet> getPets() {
        return pets;
    }

    public void setPets(Collection<Pet> pets) {
        this.pets = pets;
    }

    
    
    
}
