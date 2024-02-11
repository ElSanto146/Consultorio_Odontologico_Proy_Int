package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;



public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
   /* public void crearUsuario(int id, String nombreUsuario, String contrasenia, String rol){
        
        Usuario usu = new Usuario(nombreUsuario, contrasenia, rol);
        controlPersis.crearUsuario(usu);
                
    }*/

    public void crearUsuario(String nombreUsuario, String contrasenia, String rol) {
        
        //Se hace de esta manera para que se cree el ID automaticamente, seteando los datos
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        controlPersis.crearUsuario(usu);
        
    }

    public List<Usuario> getUsuarios() {
        return controlPersis.getUsuarios();
    }




            
}
