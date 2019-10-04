package com.sda.dao;

import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.service.EmployeeService;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao extends GenericDao<Employee>{


    public List<Employee> getEmployeesList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        List<Employee> elementsList = new ArrayList<>();
        try {
            String sql = "from Employee";
            Query query = session.createQuery(sql);
            elementsList = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        return elementsList;
    }

    public boolean deleteEntity(Long employeeId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        boolean validator = false;

        try {
            Employee employee = getEntityById(Employee.class,employeeId);
            if (employee!=null){
                session.delete(employee);
                System.out.println("-----? sters");
                validator = true;
            }else{
                System.out.println("-----? fail");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        transaction.commit();
        session.close();
        return validator;
    }


    public void editEmployee(String id, String name,Department department){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        try {
            String sql = "update Employee SET name =:name, department =:department"
                    + " where id =:id";
            Query query = session.createQuery(sql);
            query.setParameter("name",name);
            query.setParameter("department",department);
            Long employeeId = Long.parseLong(id);
            query.setParameter("id", employeeId);
            query.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }
}
