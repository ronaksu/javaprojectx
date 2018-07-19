package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>FORUM</title>\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("</script>\n");
      out.write("<link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"css/coda-slider.css\" rel=\"stylesheet\" type=\"text/css\" charset=\"utf-8\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        \t<div id=\"templatemo_container\">\n");
      out.write("\t\t<div id=\"templatemo_header\" >\n");
      out.write("                    <pre>  <i><b><font color=\"#9bcdff\" size=\"7\" >                 DISCUSSION BLOCK</font></b></i></pre> \n");
      out.write("        </div><!-- End Of Header -->\n");
      out.write("<table border=\"1\" bordercolor=\"white\">\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"2\"  height=\"350px\"  width=\"200px\" >\n");
      out.write("              <div id=\"templatemo_content\">\n");
      out.write("        \t<div id=\"templatemo_left_content\">\n");
      out.write("            \t<div class=\"templatemo_menu\">\n");
      out.write("               <ul>\n");
      out.write("                    <li><a href=\"fmain.jsp\" ><i><b>Home Page</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"viewprofile.jsp\" ><i><b>View Profile</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"editprofile.jsp\" ><i><b>Edit Profile</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"changepassword2.jsp\" ><i><b>Change Password</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"viewforum2.jsp\" ><i><b>View Forum</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"postquestion.jsp\" ><i><b>Post Question</b></i></a></li><br>\n");
      out.write("                    <li><a href=\"flogin.jsp\" ><i><b>Log Out</b></i></a></li><br>\n");
      out.write("               </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"templatemo_section_bottom_line\"></div>\n");
      out.write("            <div class=\"templatemo_section\">\n");
      out.write("            \t<div class=\"templatemo_icon_home\">\n");
      out.write("            </div> </div></div></div>\n");
      out.write("        </td>\n");
      out.write("   <td colspan=\"2\" width=\"1060px\" >\n");
      out.write("       <div id=\"content\">\n");
      out.write("            <div class=\"scroll\">\n");
      out.write("                <div class=\"scrollContainer\">\n");
      out.write("                     ");
      out.write("\n");
      out.write("<table border=\"0\" width=\"1189\" >\n");
      out.write("    <tr><td><font color=\"white\" size=7 ><i><b>HOME PAGE</i></b></font></td></tr><br>\n");
    out.print("");
            String dvalue=request.getParameter("dvv");
            String uvalue=request.getParameter("uvv");
            out.print("dvalue"+dvalue);
            out.print("uvalue"+uvalue);
      ResultSet rr=dbc.DBlayer.getResult("select * from questions order by datetimeofques desc");
      while(rr.next())
        {
           out.print("<tr><td><font size=5 color=white ><br><b><i>Question:"+rr.getString(2)+"</i></b></font> <br><font size=4><i>DateTimeOfQues:"+rr.getString(4)+"</i></font>");
           out.print("     ");
           String qid=dbc.DBlayer.getScalar("select questionid from questions where title='"+rr.getString(2)+"'");
           out.print("<table border=0 cellpadding=10px ><tr><td colspan=2 ><a href='postanswer2.jsp?x="+qid+"'>PostAnswer</a><a href='seeanswers2.jsp?x="+qid+"'>SeeAnswer</a></td></tr></table>");
           out.print("<form name='frm1' method='post' action='downvote.jsp' ><table border='0' ><tr><td colspan= 2><input type='submit' value='downvote' >"+dvalue+"</form></td> <td> <form name='frm2' method='post' action='upvote.jsp' ><input type='submit' value='upvote'>"+uvalue+"</form></td></tr></table><hr>");
           out.print("</td></tr>");
        }

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write(" <div class=\"templatemo_section_bottom_line\"></div>\n");
      out.write("  <div id=\"templatemo_right_content\">\n");
      out.write("    <div class=\"templatemo_title\"></div>\n");
      out.write("                    <p>\n");
      out.write("                    \t<img alt=\"templatemo icon\" src=\"images/templatemo_thumb_5.jpg\" />\n");
      out.write("                        <form  name=\"frm\" method=\"post\" action=\"comment.jsp\" >\n");
      out.write("<pre>   <font color=\"#9bcdff\" >   COMMENT: </font><textarea name='ta2' rows='10' cols='40'></textarea><br>                    \n");
      out.write("                             <input type=\"submit\" value=\"save\" >\n");
      out.write("                            \n");
      out.write("                         <i><b>  <h2> <font color=\"#9bcdff\" >DEVELOPED BY RONAK SUDAN </font></h2></b></i></pre>\n");
      out.write("</form>\t\t\t </div> </div> \n");
      out.write("                         </div> </div> </div>    \n");
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("</table> \n");
      out.write("</body>\n");
      out.write("</html>");
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
