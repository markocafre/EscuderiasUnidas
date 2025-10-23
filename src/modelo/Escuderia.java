package modelo;

import java.util.ArrayList;

public class Escuderia {
    private String nombre;
    private ArrayList<Mecanico> mecanicos;
    private Pais pais;
    private ArrayList<PilotoEscuderia> pilotoEscuderias;
    private ArrayList<Auto> autos;

    public Escuderia(){}

    public Escuderia(String nombre, ArrayList<Mecanico> mecanicos, Pais pais, ArrayList<PilotoEscuderia> pilotoEscuderias, ArrayList<Auto> autos) {
        this.nombre = nombre;
        this.mecanicos = mecanicos;
        this.pais = pais;
        this.pilotoEscuderias = pilotoEscuderias;
        this.autos = autos;
    }

    public String getNombre() { return nombre; }
    public ArrayList<Mecanico> getMecanicos() { return mecanicos; }
    public Pais getPais() { return pais; }
    public ArrayList<PilotoEscuderia> getPilotoEscuderias() { return pilotoEscuderias; }
    public ArrayList<Auto> getAutos() { return autos; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMecanicos(ArrayList<Mecanico> mecanicos) { this.mecanicos = mecanicos; }
    public void setPais(Pais pais) { this.pais = pais; }
    public void setPilotoEscuderias(ArrayList<PilotoEscuderia> pilotoEscuderias) { this.pilotoEscuderias = pilotoEscuderias; }
    public void setAutos(ArrayList<Auto> autos) { this.autos = autos; }

    @Override
    public String toString() {
        return "modelo.Escuderia{" +
                "nombre='" + nombre + '\'' +
                ", mecanicos=" + mecanicos +
                ", pais=" + pais +
                ", pilotoEscuderias=" + pilotoEscuderias +
                ", autos=" + autos +
                '}';
    }
}
