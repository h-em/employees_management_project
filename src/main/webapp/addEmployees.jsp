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

        <div class="form extra-padding">
            <form type="post" action="addEmployees" method="post">
                <div>
                    <input id="username" name="username" type="text" placeholder="Employee Name">
                    <p class="error">Username is too small!</p>
                </div>

                <div>
                    <select class="select" name="department">
                        <option value="" selected="selected" disabled="disabled">Select an department:</option>
                        <option value="sales">Sales</option>
                        <option value="hr">Hr</option>
                        <option value="it">It</option>
                        <option value="research">Research</option>
                    </select>
                </div>

                <div class ="add-employee-button">
                    <button class="button">Add Employee</button>
                </div>

                <div class="cancel-button">
                    <button  id="disabled" class="button extra-padding">
                        <a href="employees.jsp" >Cancel</a>
                    </button>
                </div>
            </form>

        </div>
    </div>
</div>
</body>
</html>
