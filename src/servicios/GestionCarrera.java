package servicios;

import modelo.Carrera;

import java.util.ArrayList;

public class GestionCarrera {
    private ArrayList<Carrera> carreras;

    public GestionCarrera(){
        this.carreras = new ArrayList<>();
    }

    public Carrera buscarCarrera(String nombreCircuitoBuscado, String fechaRealizacionBuscado){
        for(Carrera carrera : carreras){
            if(carrera.getCircuito().getNombre().equalsIgnoreCase(nombreCircuitoBuscado) && carrera.getFechaRealizacion().equalsIgnoreCase(fechaRealizacionBuscado)){
                return carrera;
            }
        }
        return null;
    }

    public boolean registrarCarrera(Carrera nuevaCarrera){

        if(buscarCarrera(nuevaCarrera.getCircuito().getNombre(), nuevaCarrera.getFechaRealizacion()) != null){
            System.out.println("La Carrera ya se encuentra registrada");
            return false;
        }
        carreras.add(nuevaCarrera);
        return true;

    }
}
