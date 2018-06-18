/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcorrent.dao;

import com.rcorrent.models.Pet;
import com.rcorrent.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author rcorrent
 */
public class PetDAO {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    
    public Object getPetById(int id){
        Session s = sf.openSession();
        s.beginTransaction();
        Object object = null;
        try {
            return object = s.get(Pet.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            s.close();
        }
    }
    
    public List listPet(int id){
        Session s = sf.openSession();
        try{
            Criteria criteria = s.createCriteria(Pet.class);
            criteria.add(Restrictions.ne("idOwner", id));
            return criteria.list();
        } finally {
            //s.close();
        }
    }
    
    public List findPet(String value){
        Session s = sf.openSession();
        try{
            Query q = s.createQuery("from reg_pet where name_pet:VName");
            q.setString("VName", value);            
            return q.list();
        } finally {
            s.close();
        }
    }
}
