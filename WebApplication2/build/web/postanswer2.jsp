<%-- 
    Document   : postanswer
    Created on : 28 Jul, 2017, 10:12:54 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="header.jsp" %>
<font color="#000071" size="6"><i><u>
       <%   out.print("");
            String un=" select username from regusers where userid="+session.getAttribute("UI")+"";
            String UN=dbc.DBlayer.getScalar(un);     
            if(request.getParameter("yolo")!=null)
            out.print("<script language='javascript' >alert('TextArea Empty'); </script>");
            String ti=request.getParameter("ta2");
            String p=request.getParameter("x");
            out.print("<font color='white'>Post Your Answer Here:<br><br><form name='frm' method='post' action='storeanswer.jsp?pp="+p+"'><input type='hidden' name='h' value='"+p+"'> <textarea name='ta2' rows='20' cols='100'></textarea><br><br><table border='0' ><tr><td colspan= 2><input type='submit' value='Post'></form></td><td><form name='frm1' method='post' action='fmain.jsp' >" +"<input type='submit' value='back'></form></td></tr></table>");
            
        
       %>
</u></i></font>
<%@include file="footer.jsp" %>


