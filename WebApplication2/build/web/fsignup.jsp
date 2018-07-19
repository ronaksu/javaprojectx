<%-- 
    Document   : userpage
    Created on : 24 Jul, 2017, 5:01:45 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DISCUSSION BLOCK</title>
    </head>
        <body background="images/speak.png">
        <form name="frm" method="post" action="welcome.jsp">
             <br><br><br>    <br><br><br>  <br><br><br> 
        <table width=300 border=0 height=250 align="center" >
            <tr><td colspan="2" align="center"><font color="blue" size="7"><b><i>ADD PARTICULARS</i></b></font></td></tr>
             <tr><td><font size="4"><b><i>Username</i></b></font></td>
                               <td><input type=text name=t1 required >*</td>
             </tr>
              <tr><td><font size="4"><b><i>EMail</i></b></font></td>
                               <td><input type=text name=t2 required>*</td>
              </tr>
              <tr><td><font size="4"><b><i>Password</i></b></font></td>
                               <td><input type=password name=t3 required>*</td>
              </tr>
              <tr><td><font size="4"><b><i>Employment</i></b></font></td>
                               <td><input type=text name=t4></td>
              </tr>
              <tr><td><font size="4"><b><i>Phone No</i></b></font></td>
                               <td><input type=text name=t5></td>
              </tr>
              
              <tr><td colspan="2" align="center">
               <input type="submit" value="Save"><br><br><a href='flogin.jsp'><font style="forte" size="4">Cancel </a>
              </td>
              </tr>
        </table>
        </form>     
             
  
    </body>
</html>
