package servicios;

import modelo.Escuderia;
import modelo.Piloto;

import java.util.ArrayList;

public class GestionEscuderia {
    private ArrayList<Escuderia> escuderias;

    public GestionEscuderia(){
        this.escuderias = new ArrayList<>();
    }

    public Escuderia buscarEscuderia(String nombreBuscado){

            for(Escuderia escuderia: escuderias){
                if(escuderia.getNombre().equalsIgnoreCase(nombreBuscado)){
                    return escuderia;
                }
            }
            return null;
    }

    public boolean registrarEscuderia(Escuderia nuevaEscuderia){

        if(buscarEscuderia(nuevaEscuderia.getNombre()) !=null){
            System.out.println("La Escuderia: " + nuevaEscuderia.getNombre() + " ya existe");
            return false;
        }
        escuderias.add(nuevaEscuderia);
        return true;
    }
}
