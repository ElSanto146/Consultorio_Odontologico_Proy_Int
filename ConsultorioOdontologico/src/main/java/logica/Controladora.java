package logica;

import java.util.ArrayList;
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

    public void elimUsuario(int id) {
        controlPersis.elimUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario(usu);
    }

    //buscar el usuario en la BBDD, si existe, validar que la contraseña sea correcta
    public boolean comprobaringreso(String usuario, String contrasenia) {
        //lo ideal es hacer una consulta SQL y traer los datos del usuario, en este caso se traen todos los usuarios se recorre la lista y se compara
        boolean ingreso = false;
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        listaUsuarios = controlPersis.getUsuarios();
        
        for (Usuario usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    ingreso = true;
                }
            } else {
                ingreso = false;
            }
        }
        return ingreso;
    }


            
}
