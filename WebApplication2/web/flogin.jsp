<%-- 
    Document   : index
    Created on : 24 Jul, 2017, 4:27:56 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DISCUSSION BLOCK</title>
    </head>
    <body background="images/speak.png">
       <form name="frm" method="post" action="checklogin.jsp">
           <br><br><br>    <br><br><br>    <br><br><br> <br><br><br>
       <table width=300 border=0 height=250  align="center">
           <tr><td colspan="2" align="center"><font color="blue" size="7"><b><i>AUTHENTICATE YOURSELF</i></b></font></td></tr>
           <tr><td><font size="4"><b><i>Username</i></b></font></td>
                             <td><input type=text name=t1 ></td>
           </tr>
           <tr><td><font size="4"><b><i>Password</i></b></font></td>
                                <td><input type=password name=t2 ></td>
           </tr>
<%     if(request.getParameter("p")!=null)
       out.print("<tr><td colspan=2 align=center ><font color='red'> invalid email or pwd</td></tr>");
%>
          <tr><td colspan="2" align="center">
                   <input type="submit" value="login">
                   <br><br><a href='fsignup.jsp'>New User? Sign Up </a>
         </td></tr>
    </table>
    </form>    
    </body>
</html>
