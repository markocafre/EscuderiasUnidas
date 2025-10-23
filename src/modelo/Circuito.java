package modelo;

import java.util.ArrayList;

public class Circuito {
    private String nombre;
    private int longitud;
    private Pais pais;
    private ArrayList<Carrera> carreras;

    public Circuito(){}

    public Circuito(String nombre, int longitud, Pais pais, ArrayList<Carrera> carreras) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.pais = pais;
        this.carreras = carreras;
    }

    public String getNombre() { return nombre; }
    public int getLongitud() { return longitud; }
    public Pais getPais() { return pais; }
    public ArrayList<Carrera> getCarreras() { return carreras; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setLongitud(int longitud) { this.longitud = longitud; }
    public void setPais(Pais pais) { this.pais = pais; }
    public void setCarreras(ArrayList<Carrera> carreras) { this.carreras = carreras; }

    @Override
    public String toString() {
        return "modelo.Circuito{" +
                "nombre='" + nombre + '\'' +
                ", longitud=" + longitud +
                ", pais=" + pais +
                ", carreras=" + carreras +
                '}';
    }
}
