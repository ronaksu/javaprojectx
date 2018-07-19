
<%@page language="java"  import="java.sql.*,java.util.*"  contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String op=dbc.DBlayer.getScalar("select password from regusers where userid='"+session.getAttribute("UI")+"'");
if(op.equals(request.getParameter("t1")))
{
    dbc.DBlayer.executeq("update regusers set password='"+request.getParameter("t2")+"' where userid="+session.getAttribute("UI"));
    response.sendRedirect("fmain.jsp?pwd=ch");
}
else
    response.sendRedirect("changepassword2.jsp?p=2");
%>