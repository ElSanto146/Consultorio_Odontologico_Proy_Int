package logica;

import java.util.Date;


public class Paciente extends Persona {
    
    private int id_paciente;
    private boolean tiene_OS;
    private String tipoSangre;
    
    //En las relaciones 1a1 se hacen con objetos. Y las 1 a n con collections
    
    
    //minito 59

    public Paciente() {
    }

    public Paciente(int id_paciente, boolean tiene_OS, String tipoSangre, int id_persona, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id_persona, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_paciente = id_paciente;
        this.tiene_OS = tiene_OS;
        this.tipoSangre = tipoSangre;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public boolean isTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(boolean tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    

    
}
