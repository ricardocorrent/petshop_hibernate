/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import Models.Bird;
import Models.DogCat;
import Models.Owner;
import Models.Phone;
import Utils.HibernateUtil;
import java.util.Collection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author rcorrent
 */
public class Petshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session s = sf.openSession();
        
        Owner pes1 = new Owner();
        Owner pes2 = new Owner();
        Bird ave1 = new Bird();
        Bird ave2 = new Bird();
        DogCat gato1 = new DogCat();
        
        Phone phone1 = new Phone(11, 22223333);
        
        ave1.setNmPet("Louro José");
        ave1.setWingSize(13.3);
        ave1.setColor("Verde e amarelo");
        ave1.setOwner(pes1);
        
        ave2.setNmPet("Arara");
        ave2.setWingSize(21.3);
        ave2.setColor("Vermelho, azul e branco");
        ave2.setOwner(pes1);
        
        gato1.setNmPet("Miau");
        gato1.setRace("Vira-lata");
        gato1.setHairType("Colorido");
        gato1.setHeight(45.0);
        gato1.setOwner(pes2);
        
        pes1.setNmOwner("Joaquim Teixeira");
        pes1.getPhones().add(phone1);
        pes2.setNmOwner("Mario Brother");
        
        s.beginTransaction();

        s.persist(pes1);
        s.persist(pes2);
        s.persist(ave1);
        s.persist(ave2);
        s.persist(gato1);
        s.getTransaction().commit();
        s.close();
        
        System.exit(0);
    }
    
}
