package com.sda.service;

import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.model.Department;
import com.sda.model.Employee;

import java.util.List;


public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();
    private DepartmentDao departmentDao = new DepartmentDao();

    public Employee findById(Long id) {
        return employeeDao.getEntityById(Employee.class, id);
    }

    public List<Employee> getEmployeesList() {
        return employeeDao.getEmployeesList();
    }

    public Employee createEmplyee(String employeeName, String departmentName) {
        //System.out.println("---------------------->>"+ departmentName);
        Employee employee = null;
        if (employeeName != null && departmentName != null) {
            employee = new Employee();
            Department department = departmentDao.getDepartmentByName(departmentName);
            employee.setName(employeeName);
            employee.setDepartment(department);
        }
        return employee;
    }

    public void saveEmployees(Employee employee) {
        employeeDao.createEntity(employee);
    }


    public boolean deleteEmployee(Employee employee) {
        return employeeDao.deleteEntity(employee.getId());
    }


    public boolean updateEmployee(Employee employee) {
        boolean updated = false;
        Employee entity = employeeDao.updateEntity(employee);
        if (employee != null) {
            updated = true;
        }
        return updated;
    }

    public void editEmployee(String id, String name, String departmentName) {
        Department department = departmentDao.getDepartmentByName(departmentName);
        employeeDao.editEmployee(id,name,department);
    }
}
