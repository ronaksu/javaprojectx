
<%@page language="java" import="java.sql.*,java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
    String t=request.getParameter("t1");
    String au=request.getParameter("t2");
    String pu=request.getParameter("t3");
    String pr=request.getParameter("t4");
    //out.print("1"+t+"2"+au+"3"+pu+"4"+pr);
     //out.print("update regusers set username='"+t+"',email='"+au+"',profession='"+pu+"',phone="+pr+" where userid="+session.getAttribute("UI"));
    dbc.DBlayer.executeq("update regusers set username='"+t+"',email='"+au+"',profession='"+pu+"',phone="+pr+" where userid="+session.getAttribute("UI"));
    response.sendRedirect("fmain.jsp");
%>