package logica;


public class Usuario {
    
    private int id_usuario;
    private String contrasenia;
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_usuario, String contrasenia, String rol) {
        this.id_usuario = id_usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
