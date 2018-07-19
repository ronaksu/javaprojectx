<%-- 
    Document   : viewprofile
    Created on : 26 Jul, 2017, 7:01:38 PM
    Author     : hp
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="header.jsp" %>

<table background="images/back.png" border="0" align="center" height="300" width="900">
    <tr><td align="center"><font style="arabic" size="7" color="#000071"> <i><b>Profile Info</b></i></td></tr>
    <tr><td colspan="2"><font style="arabic" size="5" > <i><b>Name</b></i></td>
        <td><font color="#6c6c6c" size="5"><i><%out.print(session.getAttribute("name")); %>  </i></td>
    </tr>   
    <tr><td colspan="2"><font style="arabic" size="5" > <i><b>User Id</b></i></td>
        <td><font color="#6c6c6c" size="5"><i><%out.print(session.getAttribute("UI")); %>  </i></td>
    </tr>   
    <tr><td colspan="2"><font style="arabic" size="5"> <i><b>Email</b></i></td>
        <td><font color="#6c6c6c" size="5"><i><%out.print(session.getAttribute("email")); %></i></td>
    </tr>   
    <tr><td colspan="2"><font style="arabic" size="5"> <i><b>Employment</b></i></td>
        <td><font color="#6c6c6c" size="5"><i><%out.print(session.getAttribute("profession")); %></i></td>
    </tr>   
    <tr><td colspan="2"><font style="arabic" size="5"> <i><b>Phone No.</b></i></td>
        <td><font color="#6c6c6c" size="5"><i><%out.print(session.getAttribute("phone")); %></i></td>
    </tr>   
</body>
</table>
       <%@include file="footer.jsp" %>