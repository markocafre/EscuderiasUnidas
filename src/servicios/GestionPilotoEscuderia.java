package servicios;

import modelo.Escuderia;
import modelo.Piloto;
import modelo.PilotoEscuderia;

import java.util.ArrayList;

public class GestionPilotoEscuderia {
    private ArrayList<PilotoEscuderia> pilotoEscuderias;

    public GestionPilotoEscuderia(){
        this.pilotoEscuderias = new ArrayList<>();
    }

    public PilotoEscuderia buscarPilotoEscuderia(Escuderia escuderia, Piloto piloto, String desdeFecha){

        for(PilotoEscuderia pe : pilotoEscuderias){
            if(pe.getPiloto().equals(piloto) && pe.getEscuderia().equals(escuderia) && pe.getDesdeFecha().equalsIgnoreCase(desdeFecha)){
                return pe;
            }
        }
        return null;
    }
}
