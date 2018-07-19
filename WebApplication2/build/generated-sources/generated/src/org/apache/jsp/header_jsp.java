package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<table border=\"1\" >\n");
      out.write("<tr><td colspan=\"2\">\n");
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
