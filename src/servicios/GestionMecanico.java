package servicios;

import modelo.Mecanico;

import java.util.ArrayList;

public class GestionMecanico {
    private ArrayList<Mecanico> mecanicos;

    public GestionMecanico(){
        this.mecanicos = new ArrayList<>();
    }

    public Mecanico buscarMecanico(String dniBuscado){

        for(Mecanico mecanico : mecanicos){
            if(mecanico.getDni().equalsIgnoreCase(dniBuscado)){
                return mecanico;
            }
        }
        return null;
    }

    public boolean registrarMecanico(Mecanico nuevoMecanico){

        if(buscarMecanico(nuevoMecanico.getDni()) != null){
            System.out.println("El Mecanico: " + nuevoMecanico.getNombre() + " ya existe");
                return false;
        }
        mecanicos.add(nuevoMecanico);
        return true;
    }
}
