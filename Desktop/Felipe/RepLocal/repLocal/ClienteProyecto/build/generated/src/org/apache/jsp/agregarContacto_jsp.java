package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregarContacto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("            <title>JSP Page</title>\n");
      out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:silver;\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("        <div class = \"container\">\n");
      out.write("            <div class = \"jumbotron\">\n");
      out.write("                <form class = \"form-horizontal\" method = \"post\" action = \"AgregarContacto\" id = \"formRegistroTrabajador\">\n");
      out.write("                    <center>\n");
      out.write("                        <div class = \"row\">\n");
      out.write("                            <div class = \"col-sm-12\">\n");
      out.write("                                <center>\n");
      out.write("                                    <h2>\n");
      out.write("                                        <b><font face = \"Calibri light\", size = \"10\", color = \"darkgray\">Agregar Contacto</font></b>\n");
      out.write("                                    </h2>\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class = \"col-sm-8\">\n");
      out.write("                            <div class = \"form-group\">\n");
      out.write("                                <label for = \"nombre_Cont\" class = \"col-sm-5 control-label\"><font face = \"Calibri light\", size = \"4\" color = \"darkgray\">Nombre del contacto:</font></label>\n");
      out.write("                                <div class = \"col-sm-7\">\n");
      out.write("                                    <input type = \"text\" placeholder = \"nombre contacto\" class = \"form-control\" id = \"nombre_Cont\" name = \"nombre_Cont\" pattern = \"[a-zA-ZáéíóúñÑ]{2,20}\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class = \"form-group\">\n");
      out.write("                                <label for = \"apellidoContacto\" class = \"col-sm-5 control-label\"><font face = \"Calibri light\", size = \"4\" color = \"darkgray\">Apellido del contacto:</font></label>\n");
      out.write("                                <div class = \"col-sm-7\">\n");
      out.write("                                    <input type = \"text\" class = \"form-control\" id = \"apellidosContacto\" placeholder = \"apellido contacto\" name = \"apellidoContacto\" pattern = \"[a-zA-ZáéíóúñÑ]{2,20}\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class = \"form-group\">\n");
      out.write("                                <label for = \"telefonoContacto\" class = \"col-sm-5 control-label\"><font face = \"Calibri light\", size = \"4\" color = \"darkgray\">Teléfono del contacto:</font></label>\n");
      out.write("                                <div class = \"col-sm-7\">\n");
      out.write("                                    <input type = \"text\" class = \"form-control\" id = \"telefonoContacto\" placeholder = \"teléfono contacto\" name = \"telefonoContacto\" pattern = \"\\d{6,10}\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class = \"form-group\">\n");
      out.write("                                <label for = \"mailContacto\" class = \"col-sm-5 control-label\"><font face = \"Calibri light\", size = \"4\" color = \"darkgray\">Email del contacto:</font></label>\n");
      out.write("                                <div class = \"col-sm-7\">\n");
      out.write("                                    <input type = \"text\" class = \"form-control\" id = \"mailContacto\" placeholder = \"email contacto\" name = \"mailContacto\" pattern = \"\\w*(\\.\\w*){0,5}@{1,1}\\w*\\.{1,1}\\w{1,5}\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class = \"form-group\">\n");
      out.write("                                <label for = \"nombreEmpresa\" class = \"col-sm-5 control-label\"><font face = \"Calibri light\", size = \"4\" color = \"darkgray\">Nombre de la empresa:</font></label>\n");
      out.write("                                <div class = \"col-sm-7\">\n");
      out.write("                                    <input type = \"text\" class = \"form-control\" id = \"nombreEmpresa\" placeholder = \"nombre empresa\" name = \"nombreEmpresa\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class = \"form-group\">\n");
      out.write("                                <label for = \"nombreCiudad\" class = \"col-sm-5 control-label\"><font face = \"Calibri light\", size = \"4\" color = \"darkgray\">Nombre de la ciudad:</font></label>\n");
      out.write("                                <div class = \"col-sm-7\">\n");
      out.write("                                    <input type = \"text\" class = \"form-control\" id = \"nombreCiudad\" placeholder = \"nombre ciudad\" name = \"nombreCiudad\" pattern = \"[a-zA-ZáéíóúñÑ]*\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </center>\n");
      out.write("                    <div class = \"row\">\n");
      out.write("                        <div class = \"col-sm-12\">\n");
      out.write("                            <center><button type = \"submit\"><img src = \"C:\\Users\\Felipe\\Desktop\\iconos\\agregar.png\" width = \"50\" length = \"50\"></img></button></center>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <h1 class = \"text-center\" class = \"letra\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resultado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
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
