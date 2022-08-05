package Service;

import Domain.Persona;
import Domain.Urgencia;

import java.util.Queue;

public class GestorUrgencias {
    private long consecUrgencias;
    private Queue<Urgencia> urgencias;
    private Persona medicoTurno;

    public GestorUrgencias(Persona medicoTurno) {
        this.medicoTurno = medicoTurno;
    }

    public void setMedicoTurno(Persona medicoTurno) {
        this.medicoTurno = medicoTurno;
    }

    public void registrarUrgencia(Persona medicoTurno, String sintomas, byte prioridad) {

    }

    public Urgencia asignarUrgencia() {

    }

    public void imprimirUrgencias() {

    }
}