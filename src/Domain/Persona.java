package Domain;

import java.time.LocalDateTime;

public class Persona {
    protected String tipoId;
    protected String numId;
    protected String nombre;
    protected String apellido;
    protected LocalDateTime fechaNac;

    protected Persona(String tipoId, String numId, String nombre, String apellido, LocalDateTime fechaNac) {
        this.tipoId = tipoId;
        this.numId = numId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getTipoId() {
        return tipoId;
    }

    public String getNumId() {
        return numId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDateTime getFechaNac() {
        return fechaNac;
    }
}