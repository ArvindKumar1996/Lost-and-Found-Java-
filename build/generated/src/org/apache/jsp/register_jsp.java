package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\" />\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Register</title>\n");
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
      out.write("        <section class=\"hero\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6 col-sm-8 mx-auto\">\n");
      out.write("                        <div class=\"card border-none\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"mt-2 text-center\">\n");
      out.write("                                    <h2>Create Your Account</h2>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"mt-4 text-white lead text-center\">\n");
      out.write("                                    Sign up to get started with Authority\n");
      out.write("                                </p>\n");
      out.write("                                <div class=\"mt-4\">\n");
      out.write("                                    <form action=\"generalcode.jsp?page=1\" method=\"post\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"name\" value=\"\" placeholder=\"Enter full name\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Gender</label><br>\n");
      out.write("                                            <input type=\"radio\" value=\"male\" name=\"gen\" checked> Male &nbsp;&nbsp;\n");
      out.write("                                            <input type=\"radio\" value=\"female\" name=\"gen\"> Female\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" name=\"email\" value=\"\" placeholder=\"Enter email address\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"number\" class=\"form-control\" name=\"mobile\" value=\"\" placeholder=\"Enter mobile number\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"password\" value=\"\" placeholder=\"Enter password\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"confirm-password\" value=\"\" placeholder=\"Confirm password\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-block\">Create Account</button>\n");
      out.write("                                    </form>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                    <p class=\"content-divider center mt-4\"><span>or</span></p>\n");
      out.write("                                </div>\n");
      out.write("                                <p class=\"mt-4 social-login text-center\">\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-twitter\"><em class=\"ion-social-twitter\"></em></a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-facebook\"><em class=\"ion-social-facebook\"></em></a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-linkedin\"><em class=\"ion-social-linkedin\"></em></a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-google\"><em class=\"ion-social-googleplus\"></em></a>\n");
      out.write("                                    <a href=\"#\" class=\"btn btn-github\"><em class=\"ion-social-github\"></em></a>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"text-center\">\n");
      out.write("                                    Already have an account? <a href=\"login.jsp\">Login Now</a>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <div class=\"col-sm-12 mt-5 footer\">\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
