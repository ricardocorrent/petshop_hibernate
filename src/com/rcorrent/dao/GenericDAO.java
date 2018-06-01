/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcorrent.dao;

import com.rcorrent.utils.HibernateUtil;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author rcorrent
 */
public class GenericDAO {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    
    public Boolean save(Object object){
        Session s = sf.openSession();
        s.beginTransaction();
        try {
            s.persist(object);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }finally{
            s.close();
        }
    }
    
    public Boolean update(Object object){
        Session s = sf.openSession();
        s.beginTransaction();
        try {
            s.saveOrUpdate(object);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }finally{
            s.close();
        }
    }
    
    public Boolean delete(Object object){
        Session s = sf.openSession();
        s.beginTransaction();
        try {
            s.delete(object);
            s.getTransaction().commit();
            return true;
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
            return false;
        }finally{
            s.close();
        }
    }
    
    public Object getById(Class javaClass, int id){
        Session s = sf.openSession();
        s.beginTransaction();
        Object objeto = null;
        try {
            return objeto = s.get(javaClass, id);
        } finally {
            s.close();
        }
        
    }
    
    public List listAll(Class javaClass){
        Session s = sf.openSession();
        try{
            Criteria criteria = s.createCriteria(javaClass);
            return criteria.list();
        } finally {
            s.close();
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
