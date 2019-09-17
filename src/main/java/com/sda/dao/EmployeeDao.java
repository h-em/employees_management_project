package com.sda.dao;

import com.sda.model.Department;
import com.sda.model.Employee;
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

    public Employee createEmployee(String name, String departmentName){
        Department department = new Department();
        department.setName(departmentName);

        Employee employee = new Employee();
        employee.setName(name);
        employee.setDepartment(department);

        return employee;
    }


}
