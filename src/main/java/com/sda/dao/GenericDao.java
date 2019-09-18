package com.sda.dao;


import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import javax.management.Query;
import java.sql.PreparedStatement;
import java.util.List;

public class GenericDao<T> {

    public void createEntity(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(entity);
        transaction.commit();
        session.close();
    }

    public T getEntityById(Class<T> cls, Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        T entity = session.get(cls, id);

        transaction.commit();
        //session.close();
        return entity;
    }


    public T getEntityByName(Class<T> cls,String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        T entity = session.get(cls, name);
        transaction.commit();
        //session.close();
        if(entity != null){
            return entity;
        }
        return null;
    }

    public T updateEntity(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        T entityToReturn = (T) session.merge(entity);

        transaction.commit();
        session.close();
        return entityToReturn;
    }
}
