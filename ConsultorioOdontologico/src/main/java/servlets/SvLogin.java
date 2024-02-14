package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;


@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {
    
    Controladora control = new Controladora();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //Se reciben los datos del form mediante una sesión
        String usuario = request.getParameter("mail");
        String contrasenia = request.getParameter("contrasenia");
        
        //se crea el método para la validación del usuario
        boolean validacion = false;
        validacion = control.comprobaringreso(usuario, contrasenia);
        
        //Si pasa la validación hay que asignarle la SESIÓN al USUARIO
        if (validacion == true) {
            HttpSession misession = request.getSession(true);
            misession.setAttribute("usuario", usuario);
            response.sendRedirect("index.jsp");
            
        } else {
            response.sendRedirect("loginError.jsp");
        }
        
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
