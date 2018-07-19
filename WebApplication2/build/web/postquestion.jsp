
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.io.*,javax.servlet.*"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="header.jsp" %>
<form name="frm" method="post" action="storequestion.jsp"><center>
        <center><font color='white' size='5' > <i><b>SELECT CATEGORY</b></i></font></center><br>
        <font color="black" size="5" align="center" cellpadding="200" ></font> <select name="S" ><option value="0">Select..</option>
            
           
<%
    out.print("");
    ResultSet rr  =dbc.DBlayer.getResult("select * from categories");
    while(rr.next())
    out.print("<option value='"+rr.getString(1)+"'>"+rr.getString(1)+"</option>");
%>
                </select></center>
<br><br>
<%
    out.print("<br><br><font color='white' size='5' ><i><b> POST YOUR QUESTION HERE --> </b></i></font><textarea name='ta1' rows='10' cols='50'></textarea><br><br><center><input type='submit' value='post your question'>");
%>
<br>
                </i></b></font>
</form>

<%@include file="footer.jsp" %>