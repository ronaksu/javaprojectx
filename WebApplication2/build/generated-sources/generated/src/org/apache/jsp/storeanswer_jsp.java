package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class storeanswer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");

            String Ans=request.getParameter("ta2");
            out.print("text"+Ans);
            /*if(Ans=="")
            {
                response.sendRedirect("postanswer2.jsp?yolo=4");
            
            }
            else
            {
                
                String ho=request.getParameter("h");
                String a=request.getParameter("ta2");
            //    out.print(""+ho);
                dbc.DBlayer.executeq("Insert into answers(questionid,answertext,answerbyuserid,datetimeofans)values("+ho+",'"+a+"',"+session.getAttribute("UI")+",now())");
                //dbc.DBlayer.executeq("insert into values(ans,datetimeofanswers)values('"+a+"',now())");
              // String k=dbc.DBlayer.getScalar("select Userid from Answers where Questionid="+ho);
               //String wtf=dbc.DBlayer.getScalar("select Name from RegUsers where Userid="+k);
               
           //  out.print("Insert into answers(questionid,answertext,answerbyuserid)values("+ho+",'"+a+"',"+session.getAttribute("UI")+")");
              response.sendRedirect("postanswer2.jsp");
            }*/
            
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
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
