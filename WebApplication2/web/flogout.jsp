
<%@page language="java" import="java.sql.*,java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.removeAttribute("UI");
    session.removeAttribute("email");
    session.removeAttribute("name");
    response.sendRedirect("flogin.jsp");
%>