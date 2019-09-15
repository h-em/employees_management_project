package com.sda;

import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.service.EmployeeService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        User user = new User("admin", "admin");
        UserDao userDao = new UserDao();
        userDao.createEntity(user);
        Employee employee = new Employee();
        employee.setName("Cosmin C");

        Employee employee2 = new Employee();
        employee2.setName("Halip emanuel");

        Employee employee3 = new Employee();
        employee3.setName("vali melen");


        EmployeeDao employeeDao = new EmployeeDao();
        employee = employeeDao.getEntityById(Employee.class, 1L);
        System.out.println(employee.getName());
        //employeeDao.createEntity(employee);
        //employeeDao.createEntity(employee2);
        //employeeDao.createEntity(employee3);


        EmployeeService employeeService = new EmployeeService();
        List<Employee> employeeList = employeeService.getEmployeesList();

        for (Employee e:employeeList) {
            System.out.println(e.getId() + " " + e.getName());
        }
    }
}
