<%-- 
    Document   : welcome
    Created on : Feb 19, 2017, 7:35:35 PM
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
        <h1>Welcome!</h1>
        <h3>Here is our first User</h3>
        <p>Use the [] operator to output the first name of user1 ${user1["firstName"]}</p>
        <p>Use the dot (.) operator to output the first name of user1 ${user1.firstName}</p>
        
        <h3>Here is the list of users' first name</h3>
        <ul>
            <li>${userMap["john@uncc.edu"].firstName}</li>
            <li>${userMap["jack@uncc.edu"].firstName}</li>
            <li>${userMap["jill@uncc.edu"].lastName}</li>
        </ul>
        <h3>Here is the list of colors</h3>
        <ul>
            <li>${colors[0]}</li>
            <li>${colors[1]}</li>
            <li>${colors[2]}</li>
        </ul>
        
        <h3>Here is the list of products's brand </h3>
        <ul>
            <li>${productList[0].brand}</li>
            <li>${productList[1].brand}</li>
      
        </ul>
        
    </body>
</html>
