<%-- 
    Document   : upvote
    Created on : 4 Aug, 2017, 10:40:54 PM
    Author     : hp
--%>

<%@page language="java" import="java.util.*,java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <% 
       String kiaa=request.getParameter("up");
      ResultSet aid=dbc.DBlayer.getResult("select answertext from answers where answerid="+kiaa);
      String fuu=dbc.DBlayer.getScalar("select username from regusers where userid="+session.getAttribute("UI"));
      String back=dbc.DBlayer.getScalar("select questionid from answers where answerid="+kiaa);
      String mcard=dbc.DBlayer.getScalar("select answerbyuserid from answers where answerid="+kiaa);
      dbc.DBlayer.executeq("insert into upvotes (answerid,upvotedBy,datetimeofupvote) values( "+kiaa+",'"+fuu+"',now())"); 
      // out.print("insert into upvotes (answerid,upvotedBy,datetimeofupvote) values( "+kiaa+",'"+fuu+"',now())");
       response.sendRedirect("seeanswers2.jsp?x="+back);
      
       // dbc.DBlayer.executeq("insert into upvotes (answerid,upvotedBy,datetimeofupvote) values( "+aid+","+session.getAttribute("UI")+",now())");
      // String Uv=dbc.DBlayer.getScalar("select count(*) from upvotes where answerid="+aid);
       //
       
          %>
   </body>
</html>
    
