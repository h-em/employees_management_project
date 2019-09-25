package com.sda.dao;

import com.sda.model.Department;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

/**
 * Created by Halip on 18.09.2019.
 */
public class DepartmentDao extends GenericDao<Department> {


    public Department getDepartmentByName(String departmentName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        List<Department> list = null;
        try {
            String sql = "from Department where name=:name";
            Query query = session.createQuery(sql);
            query.setParameter("name",departmentName);
            list = query.list();

        } catch (Exception e) {
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }

}