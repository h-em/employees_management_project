<%@ page import="com.sda.model.Employee" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Halip
  Date: 15.09.2019
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>

<html>
<head>
    <title>Title</title>
    <base href="${pageContext.request.contextPath}">
</head>
<jsp:include page="header.jsp"/>


<body>
<div>
    <div class="page">
        <div class="top-form top-form-addEmployee">
            <p>Edit Employee</p>
        </div>

        <div class="form extra-padding">

                <form action="update-employee" method="post">
                    <input type="hidden" name="id" value="${employee.getId()}">
                    <div>
                        <input id="username" name="username" type="text" value="${employee.getName()}">
                        <p class="error">Username is too small!</p>
                    </div>
                    <div>
                        <select class="select" name="department">
                            <option value="" selected="selected" disabled="disabled">Select an department:</option>
                            <option value="${employee.getDepartment()}">value="${employee.getDepartment()}"/></option>
                            <option value="sales">Sales</option>
                            <option value="hr">Hr</option>
                            <option value="it">It</option>
                            <option value="research">Research</option>
                        </select>
                    </div>

                    <div class="add-employee-button">
                        <button class="button">Save</button>
                    </div>

                    <div class="cancel-button">
                        <button id="disabled" class="button extra-padding">
                            <a href="employees.jsp">Cancel</a>
                        </button>
                    </div>
                </form>
        </div>
    </div>
</div>
</body>
</html>
