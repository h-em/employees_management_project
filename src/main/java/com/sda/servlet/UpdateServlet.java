package com.sda.servlet;

import com.sda.model.Department;
import com.sda.service.EmployeeService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Halip on 24.09.2019.
 */
@WebServlet(value="/update-employee")
public class UpdateServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {


        EmployeeService employeeService = new EmployeeService();
        String employeeId = request.getParameter("id");
            System.out.println(employeeId);
        String name = request.getParameter("username");
            System.out.println(name);
        String departmentName = request.getParameter("department");
            System.out.println(departmentName);

        employeeService.editEmployee(employeeId,name,departmentName);
        try {
            response.sendRedirect("employees.jsp"); //logged-in page
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
