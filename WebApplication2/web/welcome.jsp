
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*,java.util.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
<%
    String u=request.getParameter("t1");
    String n=request.getParameter("t2");
    String pro=request.getParameter("t3");
    String ph=request.getParameter("t4");
    String pwd=request.getParameter("t5");
    
    dbc.DBlayer.executeq("Insert into regusers(username,email,password,profession,phone)values('"+u+"','"+n+"','"+pro+"','"+ph+"','"+pwd+"')");
    response.sendRedirect("flogin.jsp");
%>
   
        
    </body>
</html>