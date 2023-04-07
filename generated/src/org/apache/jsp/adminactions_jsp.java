package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminactions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset='UTF-8' />\n");
      out.write("    <meta http-equiv='X-UA-Compatible' content='IE=edge' />\n");
      out.write("    <meta name='viewport' content='width=device-width, initial-scale=1.0' />\n");
      out.write("    <script src='jsscript/adminoptions.js'></script>\n");
      out.write("    <script src='jsscript/jquery.js'></script>\n");
      out.write("    <script src='https://unpkg.com/sweetalert/dist/sweetalert.min.js'></script>\n");
      out.write("    <link href='stylesheet/backgroundimage.css' rel='stylesheet' />\n");
      out.write("    <link href='stylesheet/adminoptions.css' rel='stylesheet' />\n");
      out.write("    <link href='stylesheet/bootstrap.css' rel='stylesheet' type='text/css' />\n");
      out.write("    <title>Admin Actions</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      ");

          String userid=(String)session.getAttribute("userid");
          if(userid==null){
              response.sendRedirect("accessdenied.html");
              return ;
          }
      
      out.write("\n");
      out.write("    <div class='container mt-4'>\n");
      out.write("      <div class='row'>\n");
      out.write("        <div class='col'>\n");
      out.write("          <div class='row title'><div class='col'>Vote For Change</div></div>\n");
      out.write("          <div class='row'></div>\n");
      out.write("          <div class='row subtitle'>\n");
      out.write("            <div class='col'>Admin Action Page</div>\n");
      out.write("          </div>\n");
      out.write("          <div class='row' id='content'>\n");
      out.write("            <div class='col-sm mb-3' onclick='manageuser()'>\n");
      out.write("              <div class='card mb-3'>\n");
      out.write("                <div class='row g-0'>\n");
      out.write("                  <div class='col-md-4'>\n");
      out.write("                    <img\n");
      out.write("                      src='images/manage.png'\n");
      out.write("                      class='img-fluid rounded-start'\n");
      out.write("                      alt='...'\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                  <div class='col-md-8'>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("                      <h5 class='card-title fw-bold fs-3'>Users</h5>\n");
      out.write("                      <p class='card-text fs-4'>\n");
      out.write("                        Manage Your<br />\n");
      out.write("                        Users\n");
      out.write("                      </p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class='col-sm mb-3' onclick='managecandidate()'>\n");
      out.write("              <div class='card mb-3'>\n");
      out.write("                <div class='row g-0'>\n");
      out.write("                  <div class='col-md-4'>\n");
      out.write("                    <img\n");
      out.write("                      src='images/managecandidate.png'\n");
      out.write("                      class='img-fluid rounded-start'\n");
      out.write("                      alt='...'\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                  <div class='col-md-8'>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("                      <h5 class='card-title fw-bold fs-3'>Manage Candidate</h5>\n");
      out.write("                      <p class='card-text fs-4'>Managing Candidate List</p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class='col-sm mb-3' onclick='electionresult()'>\n");
      out.write("              <div class='card mb-3'>\n");
      out.write("                <div class='row g-0'>\n");
      out.write("                  <div class='col-md-4'>\n");
      out.write("                    <img\n");
      out.write("                      src='images/pngegg.png'\n");
      out.write("                      class='img-fluid rounded-start'\n");
      out.write("                      alt='...'\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                  <div class='col-md-8'>\n");
      out.write("                    <div class='card-body'>\n");
      out.write("                      <h5 class='card-title fw-bold fs-3'>Admin Option</h5>\n");
      out.write("                      <p class='card-text fs-4'>\n");
      out.write("                        Election Administration & Voting Survey\n");
      out.write("                      </p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("  <script src='jsscript/bootstrap.bundle.js'></script>\n");
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
