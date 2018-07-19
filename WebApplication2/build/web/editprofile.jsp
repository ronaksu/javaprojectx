
<%-- 
    Document   : editprofile
    Created on : 25 Jul, 2017, 11:33:44 PM
    Author     : hp
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<table background="images/type.png" border="0" align="center" height="300" width="900">
<form name="frm" method="post" action="updateprofile.jsp">
    <tr><td><font color="#000071" size="7"> <i><b>  Edit Profile </b></i></td></tr><br><br><br>
        <tr><td colspan="2"><font style="arabic" size="5"> <i><b>   Name </b></i><input type="text" name="t1" value="<%= session.getAttribute("name") %>"><br></td></tr>  
        <tr><td colspan="2"><font style="arabic" size="5"> <i><b>   Email </b></i><input type="text" name="t2" value="<%= session.getAttribute("email") %>"><br></td></tr>  
        <tr><td colspan="2"> <font style="arabic" size="5"> <i><b>  Profession</b></i> <input type="text" name="t3" value="<%= session.getAttribute("profession") %>"><br></td></tr>  
        <tr><td colspan="2"> <font style="arabic" size="5"> <i><b>  Phone </b></i><input type="text" name="t4" value="<%= session.getAttribute("phone") %>"><br></td></tr>  
        <br><br> <tr><td colspan="2">   <input type="submit" value="save">
                <a href ="fmain.jsp"> <i>Cancel</i></a></td></tr>
</form>

 </table>
<%@include file="footer.jsp" %>