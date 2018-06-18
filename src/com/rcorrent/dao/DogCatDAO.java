/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcorrent.dao;

import com.rcorrent.models.DogCat;
import com.rcorrent.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author rcorrent
 */
public class DogCatDAO {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    
    public List getAllDogCat(){
        Session s = sf.openSession();
        s.beginTransaction();
        Query q = s.createQuery("from DogCat");
        try {
            List<DogCat> lDc = (List<DogCat>) q.list();
            return lDc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            s.close();
        }
    }
    
}
