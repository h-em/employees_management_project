package com.sda.service;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;

/**
 * Created by Halip on 20.09.2019.
 */
public class DepartmentService {

    DepartmentDao departmentDao = new DepartmentDao();

    public Department getDepartmentById(Long id) {
        return departmentDao.getEntityById(Department.class, id);
    }


    public Department getDepartmentByName(String departmentName){
        return departmentDao.getDepartmentByName(departmentName);
    }


}
