package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class fsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>DISCUSSION BLOCK</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"frm\" method=\"post\" action=\"welcome.jsp\">\n");
      out.write("        <table width=300 border=1 height=250 >\n");
      out.write("            <tr><td colspan=\"2\" align=\"center\">ADD PARTICULARS</td></tr>\n");
      out.write("             <tr><td>Username</td>\n");
      out.write("                               <td><input type=text name=t1 required >*</td>\n");
      out.write("             </tr>\n");
      out.write("              <tr><td>EMail</td>\n");
      out.write("                               <td><input type=text name=t2 required>*</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr><td>Password</td>\n");
      out.write("                               <td><input type=password name=t3 required>*</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr><td>Profession</td>\n");
      out.write("                               <td><input type=text name=t4></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr><td>Phone No</td>\n");
      out.write("                               <td><input type=text name=t5></td>\n");
      out.write("              </tr>\n");
      out.write("              \n");
      out.write("              <tr><td colspan=\"2\" align=\"center\">\n");
      out.write("               <input type=\"submit\" value=\"Save\"><br><br><a href='flogin.jsp'>Cancel </a>\n");
      out.write("              </td>\n");
      out.write("              </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>     \n");
      out.write("             \n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
