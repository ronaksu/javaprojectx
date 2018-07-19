<%-- 
    Document   : storequestion
    Created on : 25 Oct, 2017, 5:39:34 PM
    Author     : hp
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.io.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           // if(request.getParameter("ta1")!=null)
       // {String ti=request.getParameter("ta1");
    String ti=request.getParameter("ta1");
    out.print("ta1"+ti);
    //out.print("Insert into questions(title,userid,datetimeofques,category) values('"+ti+"',"+session.getAttribute("UI")+",now(),'"+request.getParameter("S") +"')");
    String q="Insert into questions(title,userid,datetimeofques,category) values('"+ti+"',"+session.getAttribute("UI")+",now(),'"+request.getParameter("S") +"')";
    dbc.DBlayer.executeq(q); 
    response.sendRedirect("viewforum2.jsp?ti="+ti);
        %>
    </body>
</html>
