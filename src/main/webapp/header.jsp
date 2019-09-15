<%@ page import="com.sda.model.User" %><%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <base href="${pageContext.request.contextPath}">
    <link href="css/style.css" rel="stylesheet" type="text/css">

    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
</head>
<body>

<div class="header" id="header">
    <a href="#default" class="logo"><img src="/images/logo.png"/></a>
    <div class ="top-header">
        <p>
        <% User currentUser = (User) session.getAttribute("currentSessionUser");%>
        Welcome <%= currentUser.getUsername() %>
        </p>
    </div>
    <div class="header-right">
        <a class="active" href="#home">Home</a>
        <a href="employees.jsp">Employees</a>
        <a href="#departments">Departments</a>
        <a href="#contact">Contact</a>
        <a href="#about">About</a>
    </div>

</div>
</body>