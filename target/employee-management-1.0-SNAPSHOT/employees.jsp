<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>
<jsp:useBean id="employeesDAO" class="com.sda.dao.EmployeeDao"></jsp:useBean>

<html>
<head>
    <title>Employees</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<jsp:include page="header.jsp"/>

<body>
<h1>Employees page!</h1>
    <div>
        <c:forEach items="${employeeService.employeesList}" var="employee">
            <span> <c:out value="${employee.getId()}"/>
                  <c:out value="${employee.getName()}"/>
                  <c:out value="${employee.department.name}"/>
               </span>
            <br>
        </c:forEach>

        <a class = "customButton" href="addEmployees.jsp">Add New Employee</a>
    </div>

</body>
</html>
