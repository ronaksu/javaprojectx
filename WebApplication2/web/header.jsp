<%-- 
    Document   : header
    Created on : 17 Oct, 2017, 11:59:04 PM
    Author     : hp
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<HTML>
<HEAD> 
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
</script>
</HEAD>
<TITLE> site </TITLE>
<BODY>

<div class="head">
    <i><b><font color="white" size="7" ><center>DISCUSSION BLOCK</font></b></i>
</div>

<div class="name">
<i><font size="6" color="white">WELCOME <%= session.getAttribute("name") %></i></font>
</div>

<table border="1" background="images/floor3.jpg">
<tr><td colspan="2" >
<div class="smenu">
<div class="templatemo_menu">
               <ul>
                    <li><a href="fmain.jsp" ><i><b>Home Page</b></i></a></li><br>
                    <li><a href="viewprofile.jsp" ><i><b>View Profile</b></i></a></li><br>
                    <li><a href="editprofile.jsp" ><i><b>Edit Profile</b></i></a></li><br>
                    <li><a href="changepassword2.jsp" ><i><b>Change Password</b></i></a></li><br>
                    <li><a href="viewforum2.jsp" ><i><b>View Forum</b></i></a></li><br>
                    <li><a href="postquestion.jsp" ><i><b>Post Question</b></i></a></li><br>
                    <li><a href="flogin.jsp" ><i><b>Log Out</b></i></a></li><br>
               </ul>
</div> </div></td>

<td colspan="2">
        <div id="content">
            <div class="scroll">
                <div class="scrollContainer">


</BODY>
</HTML>