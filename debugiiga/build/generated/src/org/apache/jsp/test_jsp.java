package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TestPage</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            body {\r\n");
      out.write("                background-color: powderblue;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            div {\r\n");
      out.write("                border: 1px solid black;\r\n");
      out.write("\r\n");
      out.write("                background-color: lightblue;\r\n");
      out.write("                margin-left: 15%;\r\n");
      out.write("                margin-right: 15%;\r\n");
      out.write("            }\r\n");
      out.write("            .header{\r\n");
      out.write("                list-style-type: none;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                margin-left: 15%;\r\n");
      out.write("                margin-right: 15%;\r\n");
      out.write("                position: fixed;\r\n");
      out.write("                top: 0;\r\n");
      out.write("                width: 68.7%;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .questions{\r\n");
      out.write("                background-color: silver;\r\n");
      out.write("            }\r\n");
      out.write("            .button{\r\n");
      out.write("                background-color: #4CAF50; /* Green */\r\n");
      out.write("                border: none;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 15px 32px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                margin: 4px 2px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                -webkit-transition-duration: 0.4s; /* Safari */\r\n");
      out.write("                transition-duration: 0.4s;\r\n");
      out.write("            }\r\n");
      out.write("            .button{\r\n");
      out.write("                box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <script>\r\n");
      out.write("            window.onload = function WindowLoad() {\r\n");
      out.write("                var ul = document.querySelector('ul');\r\n");
      out.write("                for (var i = ul.children.length; i >= 0; i--) {\r\n");
      out.write("                    ul.appendChild(ul.children[Math.random() * i | 0]);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <form action=\"TestServelet\">\r\n");
      out.write("            <div class=\"header\" data-position=\"fixed\">\r\n");
      out.write("                <h3 fixed>Yuddhavarna_id:");
      out.print(request.getAttribute("yid"));
      out.write("</label>\r\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.print(request.getAttribute("yid"));
      out.write("\" name=\"yid\"><br>\r\n");
      out.write("                    Name         :<label for=\"name\">");
      out.print(request.getAttribute("name"));
      out.write("</label>\r\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.print(request.getAttribute("name"));
      out.write("\" name=\"name\"><br>\r\n");
      out.write("                </h3>         \r\n");
      out.write("            </div>\r\n");
      out.write("            <pre>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </pre>\r\n");
      out.write("            <div class=\"questions\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li id=\"q1\">\r\n");
      out.write("                        <p>Which four options describe the correct default values for\r\n");
      out.write("                            array elements of the types indicated?\r\n");
      out.write("                        <ol>\r\n");
      out.write("                            <li>int -> 0</li>\r\n");
      out.write("                            <li>String -> \"null\"</li>\r\n");
      out.write("                            <li>Dog -> null</li>\r\n");
      out.write("                            <li>char -> '\\u0000'</li>\r\n");
      out.write("                            <li>float -> 0.0f</li>\r\n");
      out.write("                            <li>boolean -> true</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                        <ol>\r\n");
      out.write("                            <input type=\"radio\" name=\"q11\" value=\"1\" required> 1, 2, 3, 4\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q11\" value=\"2\"> 1, 3, 4, 5\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q11\" value=\"3\"> 2, 4, 5, 6\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q11\" value=\"4\"> 3, 4, 5, 6\r\n");
      out.write("                            <br>\r\n");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"q2\">\r\n");
      out.write("                        <p>Which one of these lists contains only Java programming\r\n");
      out.write("                            language keywords?\r\n");
      out.write("                        <ol>\r\n");
      out.write("                            <input type=\"radio\" name=\"q21\" value=\"1\" required=\"\"> class, if, void, long, Int,\r\n");
      out.write("                            continue\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q21\" value=\"2\"> goto, instanceof, native,\r\n");
      out.write("                            finally, default, throws\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q21\" value=\"3\"> try, virtual, throw, final,\r\n");
      out.write("                            volatile, transient\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q21\" value=\"4\"> strictfp, constant, super,\r\n");
      out.write("                            implements, do\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q21\" value=\"5\"> byte, break, assert,\r\n");
      out.write("                            switch, include\r\n");
      out.write("                            <br>\r\n");
      out.write("\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"q3\">\r\n");
      out.write("                        <p>Which will legally declare, construct, and initialize an\r\n");
      out.write("                            array?\r\n");
      out.write("                        <ol>\r\n");
      out.write("                            <input type=\"radio\" name=\"q31\" value=\"1\" required=\"\"> int [] myList = {\"1\", \"2\", \"3\"};\r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q31\" value=\"2\"> int [] myList = (5, 8, 2);\r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q31\" value=\"3\"> int myList [] [] = {4,9,7,0};\r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q31\" value=\"4\"> int myList [] = {4, 3, 7};\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"q4\">\r\n");
      out.write("                        <p>Which is a reserved word in the Java programming language?\r\n");
      out.write("\r\n");
      out.write("                        <ol>\r\n");
      out.write("                            <input type=\"radio\" name=\"q41\" value=\"1\" required=\"\"> method\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q41\" value=\"2\"> native\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q41\" value=\"3\"> subclasses\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q41\" value=\"4\"> reference\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q41\" value=\"5\"> array\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"q5\">\r\n");
      out.write("                        <p>Which is a valid keyword in java?\r\n");
      out.write("\r\n");
      out.write("                        <ol>\r\n");
      out.write("                            <input type=\"radio\" name=\"q51\" value=\"1\" required=\"\"> interface\r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q51\" value=\"2\"> string\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q51\" value=\"3\"> Float\r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                            <input type=\"radio\" name=\"q51\" value=\"4\"> unsigned\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <center>\r\n");
      out.write("                    <input type=\"submit\" value=\"Submit the test\" ><!-- &nbsp;<input type=\"cancel\" value=\"cancel\" > -->\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
