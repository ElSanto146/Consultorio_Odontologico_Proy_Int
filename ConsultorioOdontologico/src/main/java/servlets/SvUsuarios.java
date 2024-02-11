package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;


@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    //Instancia a la controladora
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = control.getUsuarios(); 
        
        //Instancia a la sesión de usuario
        HttpSession misession = request.getSession();
        //a la sesión se le agrega un atributo, y se le agrega la lista como atribto
        misession.setAttribute("listaUsuarios", listaUsuarios);
        
        //redirijimos a verUsuarios.jsp
        response.sendRedirect("verUsuarios.jsp");
        
    }


    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String nombreUsuario = request.getParameter("nombreUsu");
        String contra = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        
        control.crearUsuario(nombreUsuario, contra, rol);
        
        response.sendRedirect("altaUsuarios.jsp");
        
        
    }

    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
