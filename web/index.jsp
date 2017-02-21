<%-- 
    Document   : index
    Created on : Feb 19, 2017, 7:37:35 PM
    Author     : lsafarne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Hello User!</h3>
        <form action="ProcessUser" method="POST">
            FirstName:<input name="first" type="text"/><br />
            LastName:<input name="last" type="text"/><br />
            <input value="submit" type="submit"/>
        </form>
    </body>
</html>
