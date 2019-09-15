package com.sda.dao;


import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.ArrayList;
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

    public T updateEntity(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        T entityToReturn = (T) session.merge(entity);

        transaction.commit();
        session.close();
        return entityToReturn;
    }

    public List<T> getElemetsList(String entityName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        List<T> elementsList = new ArrayList<>();
     /*   try {
            String sql = "from ?";
            Query query = session.createQuery;

            elementsList = query.setParameter(0, entityName).list();

        } catch (Exception e) {
            e.printStackTrace();
        }*/
        transaction.commit();
        session.close();
        return elementsList;
    }
}
