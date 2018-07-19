
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            
            String Ans=request.getParameter("ta2");
            String ppp=request.getParameter("pp");
            
            //out.print("Insert into answers(questionid,answertext,answerbyuserid,datetimeofans)values("+ppp+",'"+Ans+"',"+session.getAttribute("UI")+",now())");
            if(Ans == null  )
            {
                response.sendRedirect("postanswer2.jsp?yolo=4");
            }
            else
            {
                dbc.DBlayer.executeq("Insert into answers(questionid,answertext,answerbyuserid,datetimeofans)values("+ppp+",'"+Ans+"',"+session.getAttribute("UI")+",now())");
                response.sendRedirect("fmain.jsp");
            }
            %>
        
        
</html>
