<%-- 
    Document   : downvote
    Created on : 4 Aug, 2017, 10:40:54 PM
    Author     : hp
--%>

<%@page language="java" import="java.util.*,java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      </head>
    <body>
        
   <% 
         String kiaa=request.getParameter("dp");
      ResultSet aid=dbc.DBlayer.getResult("select answertext from answers where answerid="+kiaa);
      String fuu=dbc.DBlayer.getScalar("select username from regusers where userid="+session.getAttribute("UI"));
      String back=dbc.DBlayer.getScalar("select questionid from answers where answerid="+kiaa);
      String mcard=dbc.DBlayer.getScalar("select answerbyuserid from answers where answerid="+kiaa);
     // out.print("insert into downvotes (answerid,dwnvotedby,datetimeofdownvote) values( "+kiaa+",'"+fuu+"',now())");
     
       dbc.DBlayer.executeq("insert into downvotes (answerid,dwnvotedby,datetimeofdownvote) values( "+kiaa+",'"+fuu+"',now())");   
       response.sendRedirect("seeanswers2.jsp?x="+back);
      
   %>
     
   
   </body>
</html>
    
