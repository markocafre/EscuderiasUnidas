package modelo;

import java.util.ArrayList;

public class AutoPiloto {
    private String fechaAsignacion;
    private ArrayList<Carrera> carreras;
    private Piloto piloto;
    private Auto auto;

    public AutoPiloto(){}

    public AutoPiloto(String fechaAsignacion, ArrayList<Carrera> carreras, Piloto piloto, Auto auto) {
        this.fechaAsignacion = fechaAsignacion;
        this.carreras = carreras;
        this.piloto = piloto;
        this.auto = auto;
    }

    public String getFechaAsignacion() { return fechaAsignacion; }
    public ArrayList<Carrera> getCarreras() { return carreras; }
    public Piloto getPiloto() { return piloto; }
    public Auto getAuto() { return auto; }

    public void setFechaAsignacion(String fechaAsignacion) { this.fechaAsignacion = fechaAsignacion; }
    public void setCarreras(ArrayList<Carrera> carreras) { this.carreras = carreras; }
    public void setPiloto(Piloto piloto) { this.piloto = piloto; }
    public void setAuto(Auto auto) { this.auto = auto; }

    @Override
    public String toString() {
        return "modelo.AutoPiloto{" +
                "fechaAsignacion='" + fechaAsignacion + '\'' +
                ", carreras=" + carreras +
                ", piloto=" + piloto +
                ", auto=" + auto +
                '}';
    }
}
