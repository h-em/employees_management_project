<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">

    <title>Login page</title>
    <link rel="stylesheet" href="css/styles.css">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8="
            crossorigin="anonymous"></script>
    <script src="js/jscode.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css">

</head>

<body>
    <div>
        <div class="page">
            <div class="top-form">
                <p>Sign in</p>
            </div>
            <div class="form">
                <form type="post" action="login" method="post">
                    <input id="username" name ="un" type="text" placeholder="email@abcdf.abc">
                    <p class="error">Username is too small!</p>
                    <input id="password" name ="pw" type="password" placeholder="password">
                    <p class="error">Invalid password!</p>
                    <button>Login</button>
                </form>
                <p class="message">Not registred? <a href="register.jsp">Create an account</a></p>
            </div>
        </div>
    </div>
</body>
</html>