/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcorrent.dao;

import com.rcorrent.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author rcorrent
 */
public class OwnerDAO {
    SessionFactory sf = HibernateUtil.getSessionFactory();

    public List findOwner(String value){
    
        Session s = sf.openSession();
        try{
            Query q = s.createQuery("from Owner where nmOwner=:VValue OR idOwner=:VValue");
            q.setString("VValue", value);   
            
            return q.list();
        } finally {
//            s.close();
        }
    }
    
}
