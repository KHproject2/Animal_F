/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-08-09 00:14:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>\r\n");
      out.write("      Animal_F\r\n");
      out.write("    </title>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.cookie.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("\t\t*{margin:0;padding:0}\r\n");
      out.write("\t\thtml,body{height:100%}\r\n");
      out.write("\t\tbody{display:table;width:100%}\r\n");
      out.write("\t\t#header,#footer{display:table-row;width:100%;height:1px}\r\n");
      out.write("\t\t#container{display:table-row;width:100%;height:100%}\r\n");
      out.write("\r\n");
      out.write("\t\tbody{font-size:3em;color:#FFF}\r\n");
      out.write("\t\t#header,#footer{background-color:#F00}\r\n");
      out.write("\t\t#container{background-color:#0F0}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("  </head>\r\n");
      out.write("  <body >\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function () {\r\n");
      out.write("\t\t\t\t$(\"#container\").load(\"./main.jsp\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#fbmenu\").click(function () {\r\n");
      out.write("\t\t\t\t\t$(\"#container\").load(\"../board/freeboard.jsp\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<table border='1' bgcolor='#F0F0F0' align='center'style=\"border-collapse: collapse; width: 100%\">\r\n");
      out.write("\t\t\t<tr height=\"10%\">\r\n");
      out.write("\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t\t\t<table style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t<col width=\"33%\">  <col width=\"34%\"> <col width=\"33%\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td >1 </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"center\"><img src=\"./image/mainlogo.PNG\"> </td>\r\n");
      out.write("\t\t\t\t\t\t\t<td align=\"right\" valign=\"top\"> <a href=\"./index.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">로그인</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">회원가입</a>\r\n");
      out.write("\t\t\t\t\t\t\t </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t </td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t      <tr bgcolor='#BDDD7D' height=\"10%\">\r\n");
      out.write("\t        <td width='200' align='center'>\r\n");
      out.write("\t          <a href='doc1.html' target='view'>찾습니다</a>\r\n");
      out.write("\t        </td>\r\n");
      out.write("\t        <td width='200' align='center'>\r\n");
      out.write("\t          <a href='../save/saveboard.jsp' target='view'>보호중입니다</a>\r\n");
      out.write("\t        </td>\r\n");
      out.write("\t        <td width='200' align='center'>\r\n");
      out.write("\t          <a href='#' target='view'>알바</a>\r\n");
      out.write("\t        </td>\r\n");
      out.write("\t        <td width='200' align='center'>\r\n");
      out.write("\t         <!--  <a href='../board/freeboard.jsp' target='view'>자유게시판</a> -->\r\n");
      out.write("\t        <button type=\"button\" onclick=\"move()\" id=\"fbmenu\">자유게시판</button>\r\n");
      out.write("\t  \r\n");
      out.write("\t        </td>\r\n");
      out.write("\t      </tr>\r\n");
      out.write("\t      \r\n");
      out.write("\r\n");
      out.write("\t      \r\n");
      out.write("\t      </table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<table width=\"100%\" border=\"1\">\r\n");
      out.write("\t   \t\t\t\t<col width=\"20%\"><col width=\"20%\"><col width=\"40%\"><col width=\"20%\">\r\n");
      out.write("\t   \t\t\t\t<tr>\r\n");
      out.write("\t   \t\t\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t   \t\t\t\t\t\t<img src=\"../board/image/line.PNG\" width=\"100%\">\r\n");
      out.write("\t   \t\t\t\t\t</td>\r\n");
      out.write("\t   \t\t\t\t</tr>\r\n");
      out.write("\t   \t\t\t\t<tr> \r\n");
      out.write("\t   \t\t\t\t\t<td> 1</td>\r\n");
      out.write("\t   \t\t\t\t\t<td><img src=\"./image/mainlogo.PNG\" width=\"200px\" height=\"50px\"></td>\r\n");
      out.write("\t   \t\t\t\t\t<td>왜안되니?</td>\r\n");
      out.write("\t   \t\t\t\t\t<td>2 </td>\r\n");
      out.write("\t   \t\t\t\t</tr>\r\n");
      out.write("\t   \t\t\t</table>\r\n");
      out.write("\t</div>\t\r\n");
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("  </body>\t\r\n");
      out.write("</html>");
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
