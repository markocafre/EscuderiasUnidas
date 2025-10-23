package servicios;

import modelo.Circuito;

import java.util.ArrayList;

public class GestionCircuito {
    private ArrayList<Circuito> circuitos;

    public GestionCircuito(){
        this.circuitos = new ArrayList<>();
    }

    public Circuito buscarCicuito(String nombreBuscado){

        for(Circuito circuito : circuitos){
            if(circuito.getNombre().equalsIgnoreCase(nombreBuscado)){
                return circuito;
            }
        }
        return null;
    }

    public boolean registrarCircuito(Circuito nuevoCircuito){

        if(buscarCicuito(nuevoCircuito.getNombre()) != null){
            System.out.println("El Circuito: " + nuevoCircuito.getNombre() + " ya existe");
            return false;
        }
        circuitos.add(nuevoCircuito);
        return true;
    }
}
