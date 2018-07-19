<%-- 
    Document   : footer
    Created on : 18 Oct, 2017, 12:00:52 AM
    Author     : hp
--%>
<%@page language="java" import="java.util.*,java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
 <div class="footer">
     <p><center> <img alt="templatemo icon" src="images/templatemo_thumb_5.jpg" /></center>
     <form  name="frm" method="post" action="comment.jsp" >
<pre><font color="#9bcdff" >                                COMMENT: </font><textarea name='ta2' rows='10' cols='40'></textarea><br>                    
                                                                <input type="submit" value="save" >

                                                                                                 
             <i><b>  <h2> <font color="#9bcdff" >                               DEVELOPED BY RONAK SUDAN </font></h2></b></i></pre><hr>
             <pre><font color="#9bcdff" size="4" ><i><u>  COMMENTS BY USERS</u></i><br>
  <%
      ResultSet rs=dbc.DBlayer.getResult("select * from comments");
      while(rs.next())
      {
          out.print("   BY USER:"+rs.getString(2)+"<br>  "+rs.getString(1)+"<hr>");
      }
  %></font></pre>
  </form></div> 
</div> </div> </div>    
</td></tr>
</table> 
</body>
</html>