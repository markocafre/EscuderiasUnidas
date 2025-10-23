import java.util.ArrayList;

public class Pais {
    private int idPais;
    private String descipcion;
    private ArrayList<Persona> personas;
    private ArrayList<Carrera> carreras;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Escuderia> escuderias;

    public Pais(){}

    public Pais(int idPais, String descipcion, ArrayList<Persona> personas, ArrayList<Carrera> carreras, ArrayList<Circuito> circuitos, ArrayList<Escuderia> escuderias) {
        this.idPais = idPais;
        this.descipcion = descipcion;
        this.personas = personas;
        this.carreras = carreras;
        this.circuitos = circuitos;
        this.escuderias = escuderias;
    }

    public int getIdPais() { return idPais; }
    public String getDescipcion() { return descipcion; }
    public ArrayList<Persona> getPersonas() { return personas; }
    public ArrayList<Carrera> getCarreras() { return carreras; }
    public ArrayList<Circuito> getCircuitos() { return circuitos; }
    public ArrayList<Escuderia> getEscuderias() { return escuderias; }

    public void setIdPais(int idPais) { this.idPais = idPais; }
    public void setDescipcion(String descipcion) { this.descipcion = descipcion; }
    public void setPersonas(ArrayList<Persona> personas) { this.personas = personas; }
    public void setCarreras(ArrayList<Carrera> carreras) { this.carreras = carreras; }
    public void setCircuitos(ArrayList<Circuito> circuitos) { this.circuitos = circuitos; }
    public void setEscuderias(ArrayList<Escuderia> escuderias) { this.escuderias = escuderias; }

    @Override
    public String toString() {
        return "Pais{" +
                "idPais=" + idPais +
                ", descipcion='" + descipcion + '\'' +
                ", personas=" + personas +
                ", carreras=" + carreras +
                ", circuitos=" + circuitos +
                ", escuderias=" + escuderias +
                '}';
    }
}
