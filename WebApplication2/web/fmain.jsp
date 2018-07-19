
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<table border="0" width="1189" >
    <tr><td><font color="white" size=7 ><i><b>HOME PAGE</i></b></font></td></tr><br>
<%    
      out.print("");  
      ResultSet rr=dbc.DBlayer.getResult("select * from questions order by datetimeofques desc");
      while(rr.next())
        {
           out.print("<tr><td><font size=5 color=white ><br><b><i>Question:"+rr.getString(2)+"</i></b></font> <br><font size=4 color=white ><i>DateTimeOfQues:"+rr.getString(4)+"</i></font>");
           out.print("     ");
           String qid=dbc.DBlayer.getScalar("select questionid from questions where title='"+rr.getString(2)+"'");
           out.print("<table border=0 cellpadding=10px ><tr><td colspan=2 ><a href='postanswer2.jsp?x="+qid+"'>PostAnswer</a><a href='seeanswers2.jsp?x="+qid+"'>SeeAnswer</a></td></tr></table><hr>");
          // out.print("<font color='white'><u>POINTS</u>"+poi+"</font<hr>");
           out.print("</td></tr>");
        }
%>
</table>
<%@include file="footer.jsp" %>