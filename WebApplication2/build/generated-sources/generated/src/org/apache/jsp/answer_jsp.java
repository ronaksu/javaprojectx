package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class answer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("       <tr> <td colspan=2><center> <img src=\"images/HD.jpg\" width=800 height=20 ></center></td></tr>\n");
      out.write("       <tr> <td colspan=2> welcome <b><font size=\"5\">");
      out.print( session.getAttribute("name") );
      out.write("</font></b>(<a href=flogin.jsp >log out </a>) </td></tr>\n");
      out.write("       <tr><td  width=200 height=400 valign=top >\n");
      out.write("                <a href=\"fmain.jsp\" >Home Page  </a> \n");
      out.write("              <br> <a href=\"viewprofile.jsp\" > View Profile  </a> \n");
      out.write("               <br><a href=\"editprofile.jsp\" > Edit Profile </a>\n");
      out.write("               <br><a href=\"changepassword2.jsp\" >Change Password </a> \n");
      out.write("               <br><a href=\"viewforum2.jsp\" > View Forum </a>\n");
      out.write("               <br><a href=\"postquestion.jsp\" >Post Question </a>\n");
      out.write("            </td>\n");
      out.write("               <td colspan=\"2\" valign=\"top\">\n");
      out.write("\n");
      out.write('\n');

    out.print("");
   ResultSet ru= dbc.DBlayer.getResult("select answertext from answers where questionid in(select questionid from questions group by questionid having count(*)>=1) order by datetimeofques");
   
    while(ru.next())
  {
    out.print(ru.getString(1));
    out.print("<br><hr>");
  }
  /*   ResultSet rr= dbc.DBlayer.getResult("select answertext from answers order by datetimeofans");
   
    while(rr.next())
  {
    out.print(rr.getString(1));
    out.print("<br><hr>");
  }*/
    //String vf1=dbc.DBlayer.getScalar("select Name from RegUsers where Userid="+vf);
    //String qq=dbc.DBlayer.getScalar("Select Questionid from Questions where Title='"+ru.getString(2)+"'");

   //out.print("<table border='1'><tr><td colspan='2' >Answer:</td><td><textarea name='ta2' rows='20' cols='100'></textarea></td></tr></table>");

    

      out.write('\n');
      out.write("    \n");
      out.write("   </td>\n");
      out.write("   </tr>\n");
      out.write("   <tr> <td colspan=3 align=center> Developed by RONAK  </td></tr>\n");
      out.write("</table></center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  \n");
      out.write("  ");
      out.write("\n");
      out.write("      ");
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
