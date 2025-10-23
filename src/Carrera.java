import java.util.ArrayList;

public class Carrera {
    private String fechaRealizacion;
    private int numeroVueltas;
    private String horaRealizacion;
    private ArrayList<AutoPiloto> autoPilotos;
    private Circuito circuito;
    private Pais pais;

    public Carrera(){}

    public Carrera(String fechaRealizacion, int numeroVueltas, String horaRealizacion, ArrayList<AutoPiloto> autoPilotos, Circuito circuito, Pais pais) {
        this.fechaRealizacion = fechaRealizacion;
        this.numeroVueltas = numeroVueltas;
        this.horaRealizacion = horaRealizacion;
        this.autoPilotos = autoPilotos;
        this.circuito = circuito;
        this.pais = pais;
    }

    public String getFechaRealizacion() { return fechaRealizacion; }
    public int getNumeroVueltas() { return numeroVueltas; }
    public String getHoraRealizacion() { return horaRealizacion; }
    public ArrayList<AutoPiloto> getAutoPilotos() { return autoPilotos; }
    public Circuito getCircuito() { return circuito; }
    public Pais getPais() { return pais; }

    public void setFechaRealizacion(String fechaRealizacion) { this.fechaRealizacion = fechaRealizacion; }
    public void setNumeroVueltas(int numeroVueltas) { this.numeroVueltas = numeroVueltas; }
    public void setHoraRealizacion(String horaRealizacion) { this.horaRealizacion = horaRealizacion; }
    public void setAutoPilotos(ArrayList<AutoPiloto> autoPilotos) { this.autoPilotos = autoPilotos; }
    public void setCircuito(Circuito circuito) { this.circuito = circuito; }
    public void setPais(Pais pais) { this.pais = pais; }

    @Override
    public String toString() {
        return "Carrera{" +
                "fechaRealizacion='" + fechaRealizacion + '\'' +
                ", numeroVueltas=" + numeroVueltas +
                ", horaRealizacion='" + horaRealizacion + '\'' +
                ", autoPilotos=" + autoPilotos +
                ", circuito=" + circuito +
                ", pais=" + pais +
                '}';
    }
}
