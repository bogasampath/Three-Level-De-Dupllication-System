/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.79
 * Generated at: 2017-08-31 13:27:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Login - File Manager</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".tdBackgroundEven {\r\n");
      out.write("\tbackground-color: #ebebeb;\r\n");
      out.write("}\r\n");
      out.write(".tdBackgroundOdd {\r\n");
      out.write("\tbackground-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write(".btnCss {\r\n");
      out.write("\ttext-decoration: none !important;\r\n");
      out.write("\tborder: 1px solid #d9534f;\r\n");
      out.write("\tpadding: 10px;\r\n");
      out.write("\tcolor: #fff !important;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tbackground-color: #d9534f;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\theight: 38px !important;\r\n");
      out.write("\tmin-height: 38px !important;\r\n");
      out.write("\tmax-height: 38px !important;\r\n");
      out.write("\tfont-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".headerTitle {\r\n");
      out.write("\tfont-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-size: 21px;\r\n");
      out.write("}\r\n");
      out.write(".labelStyle {\r\n");
      out.write("\tcolor: #00629D;\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tpadding-right: 15px;\t\r\n");
      out.write("\tfont-size: 14px;\r\n");
      out.write("}\r\n");
      out.write(".headerTitle {\r\n");
      out.write("\tfont-family: \"Helvetica Neue\", Helvetica, Arial, sans-serif;\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-size: 21px;\r\n");
      out.write("}\r\n");
      out.write(".headerPartClass {\r\n");
      out.write("\tpadding:25px;\r\n");
      out.write("\tbackground-color: #2db3ac;\r\n");
      out.write("\tfont-size:21px;\r\n");
      out.write("\tcolor:#FFF;\r\n");
      out.write("\theight:75px;\r\n");
      out.write("}\r\n");
      out.write(".dataPartClass {\r\n");
      out.write("\tpadding:25px 20px;\r\n");
      out.write("\tfont-size:15px;\r\n");
      out.write("\tborder: 1px solid #f1f1f1;\r\n");
      out.write("\tborder-top-width:0px;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"font-family:sans-serif;\">\r\n");
      out.write("\t<div style=\"margin:25px 50px;overflow: hidden;\">\r\n");
      out.write("\t\t<div class=\"headerPartClass\">\r\n");
      out.write("\t\t\t<div style=\"text-align:top;\">\r\n");
      out.write("\t\t\t\t<div style=\"float:left;width: 30%;\"><div class=\"headerTitle\">File Manager</div></div>\r\n");
      out.write("\t\t\t\t<div style=\"float:right;width: 30%;text-align:right;font-size:14px;\">\r\n");
      out.write("\t\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"float:none;width: 40%;\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<table class=\"dataPartClass\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><div style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</div></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr style=\"height: 15px;\">\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form action=\"/fileuploader/loginServlet\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div><div style=\"display: inline-block;width:70px;font-weight: normal;\" class=\"labelStyle\">Login Id </div><input type=\"text\" name=\"uname\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"min-height: 10px;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div><div style=\"display: inline-block;width:70px;font-weight: normal;\" class=\"labelStyle\">Password</div><input type=\"password\" name=\"pwd\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"min-height: 15px;\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"action\" value=\"LOGIN\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"margin-left: 85px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Log In\" class=\"btnCss\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"color: #00629D;margin-top: 15px;margin-left: 15px;font-size:13px;\">You don't have an account yet? <a href=\"/fileuploader/loginServlet?action=REGISTER\">Register here</a></div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t\t\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}