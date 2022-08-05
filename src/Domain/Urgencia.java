package Domain;

import java.time.LocalDateTime;

public class Urgencia {
    private long num;
    private LocalDateTime fechaLlegaga;
    private LocalDateTime fechaAsign;
    private Persona medicoClasif;
    private Persona paciente;
    private String sintomas;
    private byte triage;

    public Urgencia(long num, LocalDateTime fechaLlegaga, Persona medicoClasif, Persona paciente, String sintomas, byte triage) {
        this.num = num;
        this.fechaLlegaga = fechaLlegaga;
        this.medicoClasif = medicoClasif;
        this.paciente = paciente;
        this.sintomas = sintomas;
        this.triage = triage;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public LocalDateTime getFechaLlegaga() {
        return fechaLlegaga;
    }

    public void setFechaLlegaga(LocalDateTime fechaLlegaga) {
        this.fechaLlegaga = fechaLlegaga;
    }

    public LocalDateTime getFechaAsign() {
        return fechaAsign;
    }

    public void setFechaAsign(LocalDateTime fechaAsign) {
        this.fechaAsign = fechaAsign;
    }

    public Persona getMedicoClasif() {
        return medicoClasif;
    }

    public void setMedicoClasif(Persona medicoClasif) {
        this.medicoClasif = medicoClasif;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public byte getTriage() {
        return triage;
    }

    public void setTriage(byte triage) {
        this.triage = triage;
    }
}