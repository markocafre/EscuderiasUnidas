package servicios;

import modelo.Pais;

import java.util.ArrayList;

public class GestionPais {
    private ArrayList<Pais> paises;

    public GestionPais(){
        this.paises = new ArrayList<>();
    }

    public Pais buscarPais(int idBuscado){

        for(Pais pais : paises){
            if(pais.getIdPais() == idBuscado){
                return pais;
            }
        }
        return null;
    }

    public boolean registrarPais(Pais nuevoPais){

        if(buscarPais(nuevoPais.getIdPais()) != null){
            System.out.println("El Pais: " + nuevoPais.getIdPais());
            return false;
        }
        paises.add(nuevoPais);
        return true;
    }
}
