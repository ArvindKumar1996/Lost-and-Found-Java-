package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Feedback</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Arvind Kumar</title>\n");
      out.write("    </head>\n");
      out.write("    <body  data-spy=\"scroll\" data-target=\".navbar\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg fixed-top\">\n");
      out.write("            <a class=\"navbar-brand logo\" href=\"index.jsp\">Lost <span style=\"color: red; font-weight: bold;\"> &AMP; </span> Found</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Contact Us</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">FAQ</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Dropdown\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"navbar-nav my-2\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"register.jsp\">Sign Up</a>\n");
      out.write("      </li>\n");
      out.write("  </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <section id=\"feedback\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-2\"></div>\n");
      out.write("                    <div class=\"col-sm-7\">\n");
      out.write("                        <h3>Feedback Form</h3>\n");
      out.write("                        </hr>\n");
      out.write("                        <textarea class=\"form-control\"  style=\"height: 100px;\" placeholder=\"Text Here!..\" required></textarea>\n");
      out.write("\t\t\t<br>\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success w-50\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Arvind Kumar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-3 footer-col\">\n");
      out.write("                        <h5>CATEGORIES</h5>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Softwares</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> API's</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Face Detection</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Face Recognition</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Pattern</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-3 footer-col\">\n");
      out.write("                        <h5>INFORMATION</h5>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Specials</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Top Software</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Contact Us</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Term and Conditions Use</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> Sitemap</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-3 footer-col\">\n");
      out.write("                        <h5>MY ACCOUNT</h5>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> My recognition</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> My Detection</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> My Addresses</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> My Personal Info</a><br>\n");
      out.write("                        <img class=\"img-size\" src=\"img/rightarrow.png\"><a href=\"#\"> My Pattern</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-3 footer-col\">\n");
      out.write("                        <h5>Contact US<h5>\n");
      out.write("                                <img src=\"img/home.png\">\n");
      out.write("                                <span class=\"address\">8901 Marmora Road, Glasgow D04 89GR</span>\n");
      out.write("                                <h5>Follow Us</h5>\n");
      out.write("                                <a class=\"social-icon\" href=\"#\"><img src=\"img/Google_Plus.png\"></a>\n");
      out.write("                                <a class=\"social-icon\" href=\"#\"><img src=\"img/Facebook.png\"></a>\n");
      out.write("                                <a class=\"social-icon\" href=\"#\"><img src=\"img/Twitter.png\"></a>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                </section>\n");
      out.write("                                <section id=\"footer-last\">\n");
      out.write("                                    <div class=\"container\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <p>2018 Powered By ...Lost & Found</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </section>\n");
      out.write("                             </body>\n");
      out.write("                        </html>\n");
      out.write("\n");
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
