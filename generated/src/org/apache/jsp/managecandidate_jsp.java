package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managecandidate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Manage Candidates</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("      ");
 
         String userid=(String)session.getAttribute("userid");
         if(userid==null){
             response.sendRedirect("accessdenied403.html");
             return;
         }
      
      out.write("\n");
      out.write("      <div class=\"container mt-4\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <div class=\"row title\"><div class=\"col\">Vote For Change</div></div>\n");
      out.write("          <div class=\"row\"></div>\n");
      out.write("          <div class=\"row subtitle\">\n");
      out.write("            <div class=\"col\">Admin Action Page</div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row mb-5\" id=\"content\">\n");
      out.write("            <div class=\"col-sm mb-4\">\n");
      out.write("              <div class=\"card mb-3\">\n");
      out.write("                <div class=\"row g-0\">\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                    <img\n");
      out.write("                      src=\"images/add.png\"\n");
      out.write("                      class=\"img-fluid rounded-start\"\n");
      out.write("                      alt=\"...\"\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-8\" onclick=\"showAddCandidateForm()\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title fw-bold fs-3\">Add Candidate</h5>\n");
      out.write("                      <p class=\"card-text fs-4\">\n");
      out.write("                        Manage Your<br />\n");
      out.write("                        Candidate\n");
      out.write("                      </p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm mb-4\">\n");
      out.write("              <div class=\"card mb-3\">\n");
      out.write("                <div class=\"row g-0\">\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                    <img\n");
      out.write("                      src=\"images/update.png\"\n");
      out.write("                      class=\"img-fluid rounded-start\"\n");
      out.write("                      alt=\"...\"\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title fw-bold fs-3\">Update Candidate</h5>\n");
      out.write("                      <p class=\"card-text fs-4\">\n");
      out.write("                        Manage Your<br />\n");
      out.write("                        Candidate\n");
      out.write("                      </p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-sm mb-4\">\n");
      out.write("              <div class=\"card mb-3\">\n");
      out.write("                <div class=\"row g-0\">\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                    <img\n");
      out.write("                      src=\"images/remove.png\"\n");
      out.write("                      class=\"img-fluid rounded-start\"\n");
      out.write("                      alt=\"...\"\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title fw-bold fs-3\">Remove Candidate</h5>\n");
      out.write("                      <p class=\"card-text fs-4\">\n");
      out.write("                        Manage Your<br />\n");
      out.write("                        Candidate\n");
      out.write("                      </p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm mb-4\">\n");
      out.write("              <div class=\"card mb-3\">\n");
      out.write("                <div class=\"row g-0\">\n");
      out.write("                  <div class=\"col-md-4\">\n");
      out.write("                    <img\n");
      out.write("                      src=\"images/manage.png\"\n");
      out.write("                      class=\"img-fluid rounded-start\"\n");
      out.write("                      alt=\"...\"\n");
      out.write("                    />\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                      <h5 class=\"card-title fw-bold fs-3\">Users</h5>\n");
      out.write("                      <p class=\"card-text fs-4\">\n");
      out.write("                        Manage Your<br />\n");
      out.write("                        Candidate\n");
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
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <div class=\"content\">\n");
      out.write("            <div class=\"row heading\">\n");
      out.write("              <h2 class=\"col-11 mt-5 mb-5\">Add New Candidate</h2>\n");
      out.write("              <span\n");
      out.write("                class=\"col-1 mt-3 material-symbols-outlined\"\n");
      out.write("                onclick=\"closeall()\"\n");
      out.write("              >\n");
      out.write("                close\n");
      out.write("              </span>\n");
      out.write("            </div>\n");
      out.write("            <form>\n");
      out.write("              <div class=\"row mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <label for=\"cid\">Candidate Id</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"text\"\n");
      out.write("                    class=\"form-control\"\n");
      out.write("                    name=\"cid\"\n");
      out.write("                    id=\"cid\"\n");
      out.write("                    value=\"\"\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-3\"><label for=\"uid\">User Id</label></div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"text\"\n");
      out.write("                    class=\"form-control\"\n");
      out.write("                    name=\"uid\"\n");
      out.write("                    id=\"uid\"\n");
      out.write("                    value=\"\"\n");
      out.write("                    onkeypress=\"checkEvent(event)\"\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <label for=\"cname\">Candidate Name</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"text\"\n");
      out.write("                    class=\"form-control\"\n");
      out.write("                    name=\"cname\"\n");
      out.write("                    id=\"cname\"\n");
      out.write("                    value=\"\"\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-3\"><label for=\"city\">City</label></div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                  <select class=\"form-control\" id=\"city\" name=\"city\"></select>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-3\"><label for=\"party\">Party</label></div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" id=\"party\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row mt-3 mb-3\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                  <label for=\"img\">Choose Image</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                  <input class=\"form-control\" type=\"file\" id=\"img\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"row mt-5 mb-5\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                  <input type=\"button\" value=\"Add Candidate\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
      out.write("  <script src='jsscript/bootstrap.bundle.js'></script>\n");
      out.write("</html>\n");
      out.write("\n");
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
