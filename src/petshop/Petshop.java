/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import Models.Aves;
import Models.CaesGatos;
import Models.Pessoa;
import Utils.HibernateUtil;
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
        
        Pessoa pes1 = new Pessoa();
        Pessoa pes2 = new Pessoa();
        Aves ave1 = new Aves();
        Aves ave2 = new Aves();
        CaesGatos gato1 = new CaesGatos();
        
        ave1.setNmPet("Louro José");
        ave1.setTamAsa(13.3);
        ave1.setCor("Verde e amarelo");
        ave1.setPessoa(pes1);
        
        ave2.setNmPet("Arara");
        ave2.setTamAsa(21.3);
        ave2.setCor("Vermelho, azul e branco");
        ave2.setPessoa(pes1);
        
        gato1.setNmPet("Miau");
        gato1.setRaca("Vira-lata");
        gato1.setTipoPelo("Colorido");
        gato1.setAltura(45.0);
        gato1.setPessoa(pes2);
        
        pes1.setNmPessoa("Joaquim Teixeira");
        pes2.setNmPessoa("Mario Brother");
        
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
