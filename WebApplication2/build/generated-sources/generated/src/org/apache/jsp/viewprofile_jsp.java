package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");

if(session.getAttribute("UI")==null || session.getAttribute("UI").equals(""))

      out.write("        \n");
      out.write("    \n");
      out.write("     <center>  <table border=1 width=\"100%\">\n");
      out.write("       <tr> <td colspan=2 height=20 width=1000 bgcolor=\"blue\"></td></tr>\n");
      out.write("       <tr> <td colspan=2><center> <img src=\"images/HD.jpg\" width=800 height=30% ></center></td></tr>\n");
      out.write("       <tr> <td colspan=2> welcome <b><font size=\"5\">");
      out.print( session.getAttribute("name") );
      out.write("</font></b>(<a href=index.jsp >log out </a>) </td></tr>\n");
      out.write("       <tr><td width=200 height=400 valign=top >");
      out.print( session.getAttribute("eid") );
      out.write("\n");
      out.write("               <a href=\"viewprofile.jsp\" > View Profile  </a> \n");
      out.write("               <br><hr><a href=\"editprofile.jsp\" > Edit Profile </a>\n");
      out.write("               <br><hr><a href=\"changedpassword2.jsp\" >Change Password </a> \n");
      out.write("               <br><hr><a href=\"modifynotice.jsp\" > View Forum </a>\n");
      out.write("               <br><hr><a href=\"postquestion.jsp\" >Post Question </a>\n");
      out.write("            </td>\n");
      out.write("               <td align=up>\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"1\">\n");
      out.write("    <tr><td> Profile Info</td></tr>\n");
      out.write("    <tr><td colspan=\"2\">Name</td>\n");
      out.write("        <td>");
out.print(session.getAttribute("name")); 
      out.write("</td>\n");
      out.write("    </tr>   <br>\n");
      out.write("    <tr><td colspan=\"2\">Email</td>\n");
      out.write("        <td>");
out.print(session.getAttribute("email")); 
      out.write("</td>\n");
      out.write("    </tr>   <br>\n");
      out.write("    <tr><td colspan=\"2\">Employment</td>\n");
      out.write("        <td>");
out.print(session.getAttribute("profession")); 
      out.write("</td>\n");
      out.write("    </tr>   <br>\n");
      out.write("    <tr><td colspan=\"2\">Phone No.</td>\n");
      out.write("        <td>");
out.print(session.getAttribute("phone")); 
      out.write("</td>\n");
      out.write("    </tr>   \n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("       ");
      out.write("    \n");
      out.write("   </td>\n");
      out.write("   </tr>\n");
      out.write("   <tr> <td colspan=3 align=center> Developed by RONAK  </td></tr>\n");
      out.write("</table></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  \n");
      out.write("  ");
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
