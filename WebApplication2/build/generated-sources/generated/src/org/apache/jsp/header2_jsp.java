package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class header2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");

if(session.getAttribute("UI")==null || session.getAttribute("UI").equals(""))

      out.write("        \n");
      out.write("    \n");
      out.write("     <center>  <table border=\"1\" background=\"images/slide.gif\" border=\"1\" width=\"100%\" height=\"140\" color=\"grey\">\n");
      out.write("             <tr> <td height=140 width=1000 align=\"center\"><font color=\"white\" size=\"7\"><i><b> DISCUSSION FORUM</i></b></td></tr>\n");
      out.write(" </table>            <table border=\"1\" width=\"100%\" color=\"grey\">\n");
      out.write("       <tr> <td colspan=2><center> <img src=\"images/plan.png\" width=1400 height=360 ></center></td></tr>\n");
      out.write("       <tr bgcolor=\"#1b1b1b\"> <td colspan=2 > <i><font size=\"6\" color=\"white\"><pre>WELCOME ");
      out.print( session.getAttribute("name") );
      out.write("</pre></i></font></td></tr></pre>\n");
      out.write("       <tr><td width=250 height=300 valign=top >\n");
      out.write("               <font style=\"arial\" size=\"5\"><i><b> <a href=\"fmain.jsp\" >Home Page  </a> \n");
      out.write("                   <br><a href=\"viewprofile.jsp\" > View Profile  </a> \n");
      out.write("               <br><a href=\"editprofile.jsp\" > Edit Profile </a>\n");
      out.write("               <br><a href=\"changepassword2.jsp\" >Change Password </a> \n");
      out.write("               <br><a href=\"viewforum2.jsp\" > View Forum </a>\n");
      out.write("               <br><a href=\"postquestion.jsp\" >Post Question </a>\n");
      out.write("               <br><a href=flogin.jsp >Log Out </a>\n");
      out.write("               </i></b> </font>\n");
      out.write("            </td>\n");
      out.write("               <td colspan=\"2\" valign=\"top\">\n");
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
