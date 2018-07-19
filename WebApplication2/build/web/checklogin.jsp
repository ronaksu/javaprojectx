<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*,java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DISCUSSION BLOCK</title>
    </head>
    <body>
<%
String q="select userid from regusers where username='"+request.getParameter("t1")+"' and password='"+request.getParameter("t2")+"'";
String UI=dbc.DBlayer.getScalar(q);
if(UI==null || UI.equals(""))
 
   response.sendRedirect("flogin.jsp?p=3");

else
{
  session.setAttribute("UI",UI);
  session.setAttribute("name",request.getParameter("t1"));
  String email=dbc.DBlayer.getScalar("select email from regusers where userid="+UI);
  String profession=dbc.DBlayer.getScalar("select profession from regusers where userid="+UI);
  String phone=dbc.DBlayer.getScalar("select phone from regusers where userid="+UI);
  session.setAttribute("email",email);
  session.setAttribute("profession",profession);
  session.setAttribute("phone",phone);
  response.sendRedirect("fmain.jsp");
}
%>
    </body>
</html>
