package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class postanswer2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <form name=\"form\" method=\"post\" action=\"viewforum2.jsp\" >\n");
      out.write("       ");
   String un=" select username from regusers where userid="+session.getAttribute("UI")+"";
            String UN=dbc.DBlayer.getScalar(un); 
            //out.print("by"+);      
         /*  if(request.getParameter("yolo")!=null)
            out.print("<script language='javascript' >alert('TextArea Empty'); </script>");
            String ti=request.getParameter("ta2");
           */  String p=request.getParameter("x");
           out.print("by"+p);  
            /*ResultSet jug=dbc.DBlayer.getResult("select * from Answers where Questionid="+p);
            out.print("<font size='6'><b>Answers</font></b><br><br>");
        while(jug.next())
        
            out.print("<font size='2'>By "+jug.getString(5)+"</font><br><br>"+UN+"<br><hr>");
            out.print("Post Your Answer Here:<br><br><form name='frm' method='post' action='storeanswer.jsp'><input type='hidden' name='h' value='"+p+"'> <textarea name='ta2' rows='20' cols='100'></textarea><br><br><input type='submit' value='Post'></form>");
         //   dbc.DBlayer.executeq("Insert into answers(questionid,answertext,datetimeofans,answerbyuserid) values("+p+",'"+ti+"',now(),"+session.getAttribute("UI")+")");
          // if(request.getParameter("ta1")!=null)
           //{      
             
           //    out.print("Insert into answers(questionid,answertext,datetimeofans,answerbyuserid) values("+p+",'"+ti+"',now(),"+session.getAttribute("UI")+")");
          // }
        */
       
      out.write("\n");
      out.write("  </form>");
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
