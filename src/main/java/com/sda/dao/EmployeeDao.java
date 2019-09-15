package com.sda.dao;

import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao extends GenericDao<Employee>{

    public List<Employee> getEmployeesList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        List<Employee> elementsList = new ArrayList<>();
        try {
            String sql = "from Employee";
            Query query = session.createQuery(sql, Employee.class);
            elementsList = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        return elementsList;
    }


}
