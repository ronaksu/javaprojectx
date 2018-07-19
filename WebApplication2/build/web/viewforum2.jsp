<%-- 
    Document   : viewforum
    Created on : 26 Jul, 2017, 9:14:47 PM
    Author     : hp
--%>

<%@page language="java" import="java.util.*,java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="header.jsp"%>
<form name="frm" method="post" action="viewforum.jsp">
<table border="1" valign="top" width="1200" margin-top="0" >
    <tr><td><center><font color="white" size=7 ><b><i><%out.print(session.getAttribute("name")); %></i></b></font></center></td></tr>
<tr><td>
        
            <font color="black" size=5 ><b><i>
 <%    
     // out.print("select title from questions where userid ="+session.getAttribute("UI")+" order by datetimeofques desc");
     ResultSet rq=dbc.DBlayer.getResult("select title,datetimeofques from questions where userid ="+session.getAttribute("UI")+" order by datetimeofques desc");
     while(rq.next())
     {
       out.print("<br><hr><font size=5 color=white ><br><b><i>Question:"+rq.getString(1)+"</i></b></font> <br><font size=4 color=white ><i>DateTimeOfQues:"+rq.getString(2)+"</i></font>");
       String qq=dbc.DBlayer.getScalar("select questionid from questions where title='"+rq.getString(1)+"'");
       out.print("<br><a href='postanswer2.jsp?x="+qq+"'>Post Your Answer</a>");
       out.print("<br><a href='seeanswers2.jsp?x="+qq+"'>See Other Answer</a>");
     }
     if(request.getParameter("ta2")!=null)
     {     
        String ti=request.getParameter("ta2");
        dbc.DBlayer.executeq("Insert into answers(questionid,answertext,answerbyuserid) values("+session.getAttribute("q")+",'"+ti+"',"+session.getAttribute("UI")+")");
     }    


 %>
   </i></b></font>
    </td>
</tr>

</table>
</form>
<%@ include file="footer.jsp"%>            
        