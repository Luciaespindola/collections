package Domain;

import java.time.LocalDateTime;

public class Medico extends Persona {
    private int tjProfesional;

    public Medico(String tipoId, String numId, String nombre, String apellido, LocalDateTime fechaNac, int tjProfesional) {
        super(tipoId, numId, nombre, apellido, fechaNac);
        this.tjProfesional = tjProfesional;
    }

    public int getTjProfesional() {
        return tjProfesional;
    }
}