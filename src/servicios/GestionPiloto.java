package servicios;

import modelo.Escuderia;
import modelo.Piloto;

import java.util.ArrayList;

public class GestionPiloto {
    private ArrayList<Piloto> pilotos;

    public GestionPiloto(){
        this.pilotos = new ArrayList<>();
    }

    public Piloto buscarPiloto(String dniBuscar){

        for(Piloto piloto : pilotos){
            if(piloto.getDni().equalsIgnoreCase(dniBuscar)){
                return piloto;
            }
        }
        return null;
    }

    public boolean registrarPiloto(Piloto nuevoPiloto){

        if(buscarPiloto(nuevoPiloto.getDni()) !=null){
            System.out.println("El Piloto: " + nuevoPiloto.getNombre() + " ya existe");
            return false;
        }
        pilotos.add(nuevoPiloto);
        return true;
    }
}
