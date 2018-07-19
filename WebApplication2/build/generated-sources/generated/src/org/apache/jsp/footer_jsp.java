package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"templatemo_right_content\">\n");
      out.write("\t\t\t\t<div id=\"templatemo_content_area\">\n");
      out.write("                \t<div class=\"templatemo_title\">\n");
      out.write("                    \tWELCOME TO THE FORUM\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <p><i><b><h4><font color=\"#9bcdff\" >\n");
      out.write("                           This website “ DISCUSSION BLOCK ” is made for providing <br>\n");
      out.write("                           a  platform for having discussions. This forum provides the platform <br>\n");
      out.write("                           under one roof to interact with different members which maybe the <br>\n");
      out.write("                           experts in a  particular field or anyone for seeking or to give advices.<br> \n");
      out.write("                           A space on which anybody can have discussions regarding any <br>\n");
      out.write("                           research, academic documents or any latest technology free of cost.<br> \n");
      out.write("                           A website which helps to resolve doubts, queries related to any field <br>\n");
      out.write("                           by having discussions with other registered users. <br></font></h4></p></i></p>\n");
      out.write("                    \n");
      out.write("              <div class=\"templatemo_title\">\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                    <p>\n");
      out.write("                    \t<img alt=\"templatemo icon\" src=\"images/templatemo_thumb_5.jpg\" />\n");
      out.write("                    \t\t <pre><font color=\"#9bcdff\" >   COMMENT: </font><input type=\"text\" name=\"t1\"><br> \n");
      out.write("                            <i><b>  <h2> <font color=\"#9bcdff\" >DEVELOPED BY RONAK SUDAN </font></h2></b></i></pre>\n");
      out.write("\t\t\t  </div>\n");
      out.write("            </div><!-- End Of Right Content -->\n");
      out.write("         \n");
      out.write("        </div><!-- End Of Content -->\n");
      out.write("    </div><!-- End Of Container -->\n");
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
