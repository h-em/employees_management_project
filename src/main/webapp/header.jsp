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
    <link href="css/style.css" rel="stylesheet" type="text/css">'
    <script src="https://kit.fontawesome.com/1429dcb656.js"></script>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
</head>
<body>

<div class="header" id="header">


    <div class ="top-header">
        <p>
        <% User currentUser = (User) session.getAttribute("currentSessionUser");%>
        Welcome <%= currentUser.getUsername() %>
        </p>
    </div>

    <div class="navbar">
        <a class="active" href="home.jsp"><i class="fa fa-fw fa-home"></i>Home</a>
        <a href="employees.jsp"><i class="fas fa-users"></i> Employees</a>
        <a href="#departments"><i class="fas fa-building"></i> Departments</a>
        <a href="#contact"><i class="fas fa-id-card"></i></i> Contact</a>
        <a href="#about"><i class="fas fa-info"></i></i> About</a>
    </div>

</div>
</body>