/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.16
 * Generated at: 2017-08-09 01:03:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class freeboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.7.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    *{margin:0;padding:0}\r\n");
      out.write("\t\thtml,body{height:100%}`\r\n");
      out.write("\t\tbody{display:table;width:100%}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#container{display:table-row;width:100%;height:100%}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t#sidebar{display:table-cell;width:15%;height:100%;}\r\n");
      out.write("\t\t#right{display:table-cell;width:80%;height:100%;}\r\n");
      out.write("\r\n");
      out.write("\t\t#sidebar{background-color:#F00;}\r\n");
      out.write("\t\t#right{background-color:#0F0}\r\n");
      out.write("\t</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"sidebar\">\r\n");
      out.write("사이드바 수진 제작예정\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"right\" align=\"center\">\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1><h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1><h1>1</h1>\r\n");
      out.write("\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1><h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<h1>1</h1>\r\n");
      out.write("<a href=\"../main/index.jsp\"> HOME</a>\r\n");
      out.write("\r\n");
      out.write("<table width=\"738\" border=\"1\" align=\"center\">\t\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th width=\"51\">No</th>\r\n");
      out.write("\t\t<th width=\"71\">사진</th>\r\n");
      out.write("\t\t<th width=\"308\">제목</th>\r\n");
      out.write("\t\t<th width=\"58\">작성자</th>\r\n");
      out.write("\t\t<th width=\"57\">날짜</th>\r\n");
      out.write("\t\t<th width=\"30\">조회</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr align=\"center\">\r\n");
      out.write("\t\t<td>3748</td>\r\n");
      out.write("\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t<a href=\"./detail.jsp\"><img src=\"https://file.namu.moe/file/7887c8260196592eb917ca4b0bf653996c16576d0da8ae5ce2376eb8172e9ae3\"\r\n");
      out.write("\t\t\twidth=\"62\" height=\"47\"></a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t<td align=\"left\"> \r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><a href=\"./detail.jsp\" style=\"text-decoration: none; color: black;\" ><font size=\"3\"><b> 제목 </b></font> <br>\r\n");
      out.write("\t\t\t\t<font size=\"2\">내용</font></a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td> </td>\r\n");
      out.write("\t\t<td> </td>\r\n");
      out.write("\t\t<td> </td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
