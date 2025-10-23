package servicios;

import modelo.Auto;

import java.util.ArrayList;

public class GestionAuto {
    private ArrayList<Auto> autos;

    public GestionAuto(){
        this.autos = new ArrayList<>();
    }

    public Auto buscarAuto(String modeloBuscado){

        for(Auto auto : autos){
            if(auto.getModelo().equalsIgnoreCase(modeloBuscado)){
                return auto;
            }
        }
        return null;
    }

    public boolean registrarAuto(Auto nuevoAuto){
        if (buscarAuto(nuevoAuto.getModelo()) !=null){
            System.out.println("El auto: " + nuevoAuto.getModelo() + " ya existe");
            return false;
        }
        autos.add(nuevoAuto);
        return true;
    }
}
