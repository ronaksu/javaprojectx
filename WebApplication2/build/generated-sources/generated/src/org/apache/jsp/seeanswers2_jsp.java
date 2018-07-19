package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class seeanswers2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         \n");
      out.write("   \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("<HEAD> \n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("</script>\n");
      out.write("</HEAD>\n");
      out.write("<TITLE> site </TITLE>\n");
      out.write("<BODY>\n");
      out.write("\n");
      out.write("<div class=\"head\">\n");
      out.write("    <i><b><font color=\"white\" size=\"7\" ><center>DISCUSSION BLOCK</font></b></i>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"name\">\n");
      out.write("<i><font size=\"6\" color=\"white\">WELCOME ");
      out.print( session.getAttribute("name") );
      out.write("</i></font>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<table border=\"1\" background=\"images/floor3.jpg\">\n");
      out.write("<tr><td colspan=\"2\" >\n");
      out.write("<div class=\"smenu\">\n");
      out.write("<div class=\"templatemo_menu\">\n");
      out.write("               <ul>\n");
      out.write("                    <li><a href=\"fmain.jsp\" ><i><b>Home Page</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"viewprofile.jsp\" ><i><b>View Profile</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"editprofile.jsp\" ><i><b>Edit Profile</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"changepassword2.jsp\" ><i><b>Change Password</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"viewforum2.jsp\" ><i><b>View Forum</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"postquestion.jsp\" ><i><b>Post Question</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"flogin.jsp\" ><i><b>Log Out</b></i></a></li><br>\n");
      out.write("               </ul>\n");
      out.write("</div> </div></td>\n");
      out.write("\n");
      out.write("<td colspan=\"2\">\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div class=\"scroll\">\n");
      out.write("                <div class=\"scrollContainer\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
      out.write("\n");
      out.write("        \n");
      out.write("    <form name=\"frm2\" method=\"post\" action=\"fmain.jsp\">\n");
      out.write("        <script>               function myFunction() {\n");
      out.write("                            document.getElementById(\"formSave\").setAttribute(\"disabled\",\"disabled\");\n");
      out.write("                        }</script>\n");
      out.write("        <table border='0' width=\"100%\" >\n");
      out.write("            \n");
      out.write("            <tr><td><h1><i><b><font color=\"white\" size=\"7\"><u>ANSWERS</u></font></b></i></h1>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("     \n");
      out.write("        ");
  
            out.print("");
            String UN=dbc.DBlayer.getScalar("select username from regusers where userid="+session.getAttribute("UI")+"");
            String Ans=request.getParameter("ta2");
            String ho=request.getParameter("x");
            String a=request.getParameter("ta2");
            ResultSet jug=dbc.DBlayer.getResult("select * from answers where questionid="+ho);
             while(jug.next())
             {
               String urn=" select username from regusers where userid="+jug.getString(5)+"";
               String ur=dbc.DBlayer.getScalar(urn); 
               out.print("<font size='3' color='white' >By username: "+ur+"<br>Answer:"+jug.getString(3)+"</font>");   
               String ad="select answerid from answers where answertext='"+jug.getString(3)+"'";
               String answerid=dbc.DBlayer.getScalar(ad);
               String points=dbc.DBlayer.getScalar("select (select count(*) from upvotes where answerid="+jug.getString(2)+")-(select count(*) from downvotes where answerid="+jug.getString(2)+")as difference;");
               out.print("<br><form name='frm1' method='post' action='downvote.jsp' ><table border='0' ><tr><td colspan= 2><input type='submit' id='formSave' value='downvote' onclick='javascript:myFunction();' ></form></td> <td> <form name='frm2' method='post' action='upvote.jsp?up="+answerid+"' ><input type='submit' id='formSave' value='upvote' onclick='myFunction()' ></form></td></tr></table><hr>");
             } 
               out.print("<form name='frm1' method='post' action='fmain.jsp' ><input type='submit' value='back'></form>");
             }
            
            
      out.write("\n");
      out.write("            </font>\n");
      out.write("            </td></tr>\n");
      out.write("    </table>\n");
      out.write("       </form>\n");
      out.write("            ");
      out.write("\n");
      out.write("<body>\n");
      out.write(" <div class=\"footer\">\n");
      out.write("     <p><center> <img alt=\"templatemo icon\" src=\"images/templatemo_thumb_5.jpg\" /></center>\n");
      out.write("     <form  name=\"frm\" method=\"post\" action=\"comment.jsp\" >\n");
      out.write("<pre><font color=\"#9bcdff\" >                                COMMENT: </font><textarea name='ta2' rows='10' cols='40'></textarea><br>                    \n");
      out.write("                                                                <input type=\"submit\" value=\"save\" >\n");
      out.write("\n");
      out.write("                                                                                                 \n");
      out.write("             <i><b>  <h2> <font color=\"#9bcdff\" >                               DEVELOPED BY RONAK SUDAN </font></h2></b></i></pre>\n");
      out.write("  </form></div> \n");
      out.write("</div> </div> </div>    \n");
      out.write("</td></tr>\n");
      out.write("</table> \n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
