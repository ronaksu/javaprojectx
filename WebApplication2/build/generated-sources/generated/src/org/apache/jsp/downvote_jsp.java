package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class downvote_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("   ");
 
         String kiaa=request.getParameter("dp");
      ResultSet aid=dbc.DBlayer.getResult("select answertext from answers where answerid="+kiaa);
      String fuu=dbc.DBlayer.getScalar("select username from regusers where userid="+session.getAttribute("UI"));
      String back=dbc.DBlayer.getScalar("select questionid from answers where answerid="+kiaa);
      String mcard=dbc.DBlayer.getScalar("select answerbyuserid from answers where answerid="+kiaa);
      if(mcard.equals(session.getAttribute("UI")))
          response.sendRedirect("downvote.jsp?bdk="+kiaa);
      else
      {
       dbc.DBlayer.executeq("insert into downvotes (answerid,downvotedBy,datetimeofdownvote) values( "+kiaa+",'"+fuu+"',now())");   
       response.sendRedirect("seeanswers2.jsp"+back);
      }
   
      out.write("\n");
      out.write("     \n");
      out.write("   \n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("    \n");
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
