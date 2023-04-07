package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import evoting.dto.CandidateInfo;

public final class showCandidates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
  
   String userid=(String)session.getAttribute("userid");
   if(userid==null){
       session.invalidate();
       response.sendRedirect("accessdenied403.html");
       return ;
   }
   List<CandidateInfo>candidateList=(List<CandidateInfo>)request.getAttribute("candidateList");

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <link\n");
      out.write("      type=\"text/css\"\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link href='stylesheet/backgroundimage.css' rel='stylesheet' />\n");
      out.write("    <link href='stylesheet/showcandidates.css' rel='stylesheet' />\n");
      out.write("    <title>Document</title>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("         <div class=\"row title\"><div class=\"col\">Vote For Change</div></div>\n");
      out.write("          <div class=\"row\"></div>\n");
      out.write("          <div class=\"row subtitle\">\n");
      out.write("            <div class=\"col\">Candidates</div>\n");
      out.write("          </div>\n");
      out.write("       ");
 
          for(CandidateInfo obj:candidateList){
       
      out.write("\n");
      out.write("             <label class=\"row content mb-5 mt-5\" for=\"");
      out.print( obj.getCandidateId() );
      out.write("\">\n");
      out.write("              <div class=\"col-sm-2 col-2 rbtn\">\n");
      out.write("                <input\n");
      out.write("                  type=\"radio\"\n");
      out.write("                  id=\"");
      out.print( obj.getCandidateId() );
      out.write("\"\n");
      out.write("                  name=\"cid\"\n");
      out.write("                  value=\"\"\n");
      out.write("                  onclick=\"verify(this)\"\n");
      out.write("                 />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-5 col-10\"><img src=\"data:images/jpg;base64,");
      out.print( obj.getSymbol() );
      out.write("\" /></div>\n");
      out.write("              <div class=\"col-sm-5 details\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                  <div class=\"col\"><span>Candidate Name : </span>");
      out.print( obj.getCandidateName() );
      out.write("</div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"row\">\n");
      out.write("                  <div class=\"col\"><span>Candidate Id : </span>");
      out.print( obj.getCandidateId() );
      out.write("</div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"row\">\n");
      out.write("                  <div class=\"col\"><span>Party : </span>");
      out.print( obj.getParty() );
      out.write("</div>\n");
      out.write("               </div>\n");
      out.write("              </div>\n");
      out.write("             </label>\n");
      out.write("          ");
 
             }    
          
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("     <script>\n");
      out.write("      function verify(rbtn) {\n");
      out.write("        console.log(rbtn);\n");
      out.write("        console.log(rbtn.id);\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
