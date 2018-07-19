
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<html>
<script language="javascript">
    function check()
    {
        a=document.forms[0].t2.value;
        b=document.forms[0].t3.value;
        if(a==b)
            document.forms[0].submit();
        else
            alert("new and confirm passwoird mismatch");
    }
</script>

<form name="frm" method="post" action="changepassword.jsp">
<table background="images/forum.jpg" height="400" width="600" border="0" align="center">
    <tr><td><font color="#030c33" size=7 ><i><b>CHANGE PASSWORD</i></b></font></td></tr>
       <tr> <td><font color="#030c33" size=5 ><i><b>Old Password</i></b></font></td>
        <td><input type="password" name="t1"></td>
    </tr>
    <tr> <td><font color="#030c33" size=5 ><i><b>New Password</i></b></font></td><br>
         <td><input type="password" name="t2"></td>
    </tr>
    <tr> <td><font color="#030c33" size=5 ><i><b>Confirm Password</i></b></font></td><br>
         <td><input type="password" name="t3"></td>
    </tr>
    
    <%
         if(request.getParameter("p")!=null)
             out.print("<tr><td colspan=2 align=center >old password incorrect</td></tr>");
    %>

    <tr>
      <td colspan="2" align="center"><input type="submit" value="change" onclick="check()"></td>
    </tr>
</table>
</form>
</html>
    <%@include file="footer.jsp" %>