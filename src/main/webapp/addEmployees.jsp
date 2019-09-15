<%--
  Created by IntelliJ IDEA.
  User: Halip
  Date: 15.09.2019
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<jsp:include page="header.jsp"/>

<body>
    <div>
        <div class="page">
            <div class="top-form top-form-addEmployee">
                <p>Add new Employee</p>
            </div>
            <div class="form">
                <form type="post" action="addEmployees" method="post">
                    <input id="username" name = "un" type="text" placeholder="Employee Name">
                    <p class="error">Username is too small!</p>
                    <input id="department" name = "dn" type="text" placeholder="Departmet Name">
                    <p class="error">Invalid department!</p>
                    <button>Add</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
