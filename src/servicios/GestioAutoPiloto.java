package servicios;

import modelo.Auto;
import modelo.AutoPiloto;
import modelo.Carrera;
import modelo.Piloto;

import java.util.ArrayList;

public class GestionAutoPiloto {
    private ArrayList<AutoPiloto> autoPilotos;

    public GestioAutoPiloto(){
        this.autoPilotos = new ArrayList<>();
    }

    public AutoPiloto buscarAutoPiloto(Auto auto, Piloto piloto, Carrera carrera){

        String modeloAutoBuscado = auto.getModelo();
        String dniPilotoBuscado = piloto.getDni();

        for(AutoPiloto ap : autoPilotos){
            if(ap.getAuto().getModelo().equalsIgnoreCase(modeloAutoBuscado) && ap.getPiloto().getDni().equalsIgnoreCase(dniPilotoBuscado) && ap.getCarreras().equals(carrera)){
                return ap;
            }
        }
        return null;
    }

    public boolean registrarAutoPiloto(AutoPiloto nuevoAutoPiloto){

            if(buscarAutoPiloto(nuevoAutoPiloto.getAuto(), nuevoAutoPiloto.getPiloto(),nuevoAutoPiloto.getCarrera()) != null){

                System.out.println("La asignación de Piloto " +
                        nuevoAutoPiloto.getPiloto().getNombre() +
                        " al auto " + nuevoAutoPiloto.getAuto().getModelo() +
                        " para esta carrera ya existe.");
                return false;
            }

            autoPilotos.add(nuevoAutoPiloto);
            return true;
    }
}
