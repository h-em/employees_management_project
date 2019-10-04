package com.sda.servlet;

import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.service.EmployeeService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Created by Halip on 15.09.2019.
 */
@WebServlet("/addEmployees")
public class AddEmployee extends HttpServlet {

    EmployeeService employeeService = new EmployeeService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        try {
            Employee employee = employeeService.createEmplyee(
                    request.getParameter("username"),
                    request.getParameter("department"));

            if (employee != null) {
                employeeService.saveEmployees(employee);
                response.sendRedirect("employees.jsp");
            } else {
                response.sendRedirect("invalidEmployee.jsp");
            }
        } catch (Throwable ex) {
            System.out.println(ex);
        }

    }
}
