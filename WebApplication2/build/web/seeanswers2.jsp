<%-- 
    Document   : seeanswers2
    Created on : 31 Jul, 2017, 11:20:47 PM
    Author     : hp
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="header.jsp" %>
        
        <script>               function myFunction() {
                            document.getElementById("formSave").setAttribute("disabled","disabled");
                        }</script>
        <table border='0' width="100%" >
            
            <tr><td><h1><i><b><font color="white" size="7"><u>ANSWERS</u></font></b></i></h1>
        <%  
            out.print("");
            
            String un=" select username from regusers where userid="+session.getAttribute("UI")+"";
            String UN=dbc.DBlayer.getScalar(un);     
            
            String Ans=request.getParameter("ta2");
            if(Ans=="")
            {
                response.sendRedirect("postanswer2.jsp?yolo=4");
            
            }
           else
            {   
                String ho=request.getParameter("x");
                String a=request.getParameter("ta2");
                ResultSet jug=dbc.DBlayer.getResult("select * from answers where questionid="+ho+" order by answerbyuserid");
             while(jug.next())
             {
                   String urn=" select username from regusers where userid="+jug.getString(4)+"";
                   String ur=dbc.DBlayer.getScalar(urn); 
                   //out.print("un"+ur);
               out.print("<font size='3' color='white' >By username: "+ur+"<br>Answer:"+jug.getString(3)+"</font>");   
               String ad="select answerid from answers where answertext='"+jug.getString(3)+"'";
               String answerid=dbc.DBlayer.getScalar(ad);
               
              
              out.print("<br><form name='frm1' method='post' action='downvote.jsp?dp="+answerid+"' ><table border='0' ><tr><td colspan= 2><input type='submit' id='formSave' value='downvote' onclick='javascript:myFunction();' ></form></td> <td> <form name='frm2' method='post' action='upvote.jsp?up="+answerid+"' ><input type='submit' id='formSave' value='upvote' onclick='myFunction()' ></form></td></tr></table>");              
              String points=dbc.DBlayer.getScalar("select (select count(*) from upvotes where answerid="+jug.getString(1)+")-(select count(*) from downvotes where answerid="+jug.getString(1)+")as difference");
              out.print("<font color='white' ><u>POINTS</u>"+points+"<hr>"); 
             //out.print("select (select count(*) from upvotes where answerid="+jug.getString(1)+")-(select count(*) from downvotes where answerid="+jug.getString(1)+")as difference");
             } 
             out.print("<form name='frm1' method='post' action='fmain.jsp' ><input type='submit' value='back'></form>");
             }
            
            %>
                    </font>
            </td></tr>
    </table>
      
        <%@include file="footer.jsp" %>
</html>


