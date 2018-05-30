package com.rcorrent.models;

import javax.persistence.Embeddable;

@Embeddable
public class Phone {
        
    private int ac;
    
    private long number;

    public Phone() {
    }

    public Phone(int ac, long number) {
        this.ac = ac;
        this.number = number;
    }
    
    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    
    
}
