package Domain;

public class Solicitud {

    private int prioridad;
    private String nombreSolicitante;

    public Solicitud(int prioridad, String nombreSolicitante) {
        this.prioridad = prioridad;
        this.nombreSolicitante = nombreSolicitante;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "prioridad=" + prioridad +
                ", nombreSolicitante='" + nombreSolicitante + '\'' +
                '}';
    }
}
