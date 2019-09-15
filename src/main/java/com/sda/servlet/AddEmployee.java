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

       /* try {
            Employee employee = new Employee();
            Department department = new Department();
            employee.setName(request.getParameter("un"));
            department.setName(request.getParameter("dn"));

            employee.setDepartment();

                    employeeService.saveEmployees

            if (user != null) {
                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", user);
                Cookie userName = new Cookie("user", user.getUsername());
                userName.setMaxAge(30*60);
                response.addCookie(userName);
                response.sendRedirect("home.jsp"); //logged-in page
            } else
                response.sendRedirect("invalidLogin.jsp"); //error page
        } catch (Throwable ex) {
            System.out.println(ex);
        }
        */
    }
}
