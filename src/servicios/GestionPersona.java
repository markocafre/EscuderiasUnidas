package servicios;

import modelo.Persona;

import java.util.ArrayList;

public class GestionPersona {
    private ArrayList<Persona> personas;

    public GestionPersona(){
        this.personas = new ArrayList<>();
    }

    public Persona buscarPersona(String dniBuscado){

        for(Persona persona : personas){
            if(persona.getDni().equalsIgnoreCase(dniBuscado)){
                return persona;
            }
        }
        return null;
    }

    public boolean registrarPersona(Persona nuevaPersona){

        if(buscarPersona(nuevaPersona.getDni()) != null){
            System.out.println("La Persona: " + nuevaPersona.getNombre() + " ya existe");
            return false;
        }
        personas.add(nuevaPersona);
        return true;
    }
}
