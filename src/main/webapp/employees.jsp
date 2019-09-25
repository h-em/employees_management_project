<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
<div class="wraper">

    <table class="table">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${employeeService.employeesList}" var="employee" varStatus="loop" >
            <tr>
                <td>${loop.count}</td>
                <td>${employee.getName()}</td>
                <td>${employee.department.name}</td>

                <td>
                    <span>
                        <a href="deleteEmployee?action=deleteEmployee&id=${employee.getId()}"
                            class="fas fa-minus-circle" ></a>
                    </span>

                    <span>
                        <a href="updateEmployee?action=updateEmployee&id=${employee.getId()}"
                           class="fas fa-edit"></a>
                    </span>
                </td>
            </tr>
        </c:forEach>
    </table>

    <button class="button customButton">
        <a href="addEmployees.jsp">Add New Employee</a>
    </button>
</div>

</body>
</html>
