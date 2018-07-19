<%-- 
    Document   : comment
    Created on : 18 Oct, 2017, 8:46:13 PM
    Author     : hp
--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<%
    String text=request.getParameter("ta2");
    //out.print("insert into comments (comment,username) values('"+text+"','"+session.getAttribute("name")+"');");
    dbc.DBlayer.executeq("insert into comments (comment,username) values('"+text+"','"+session.getAttribute("name")+"');");
    response.sendRedirect("fmain.jsp");
%>