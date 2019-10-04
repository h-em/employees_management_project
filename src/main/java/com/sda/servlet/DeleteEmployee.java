package com.sda.servlet;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Halip on 20.09.2019.
 */
@WebServlet("/deleteEmployee")
public class DeleteEmployee extends HttpServlet {

    private EmployeeService employeeService = new EmployeeService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Employee employee = employeeService.findById(
                Long.parseLong(request.getParameter("id")));

        System.out.println(request.getParameter("employeeId"));
        try {
            if (employeeService.deleteEmployee(employee)) {
                response.sendRedirect("/employees.jsp");
            }else{
                response.sendRedirect("/deleteEmployeeFailed.jpg");
            }
        } catch (IOException e) {
            System.out.println(e);        }

    }
}
