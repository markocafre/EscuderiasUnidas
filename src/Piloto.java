import java.util.ArrayList;

public class Piloto extends Persona {
    private int numeroCompetencia;
    private int vicorias;
    private int polePosition;
    private int vueltasRapidas;
    private int podios;
    private ArrayList<PilotoEscuderia> pilotoEscuderias;
    private ArrayList<AutoPiloto> autoPilotos;

    public Piloto(){}

    public Piloto(String dni, String nombre, String apellido, Pais pais, int numeroCompetencia, int vicorias, int polePosition, int vueltasRapidas, int podios, ArrayList<PilotoEscuderia> pilotoEscuderias, ArrayList<AutoPiloto> autoPilotos) {
        super(dni, nombre, apellido, pais);
        this.numeroCompetencia = numeroCompetencia;
        this.vicorias = vicorias;
        this.polePosition = polePosition;
        this.vueltasRapidas = vueltasRapidas;
        this.podios = podios;
        this.pilotoEscuderias = pilotoEscuderias;
        this.autoPilotos = autoPilotos;
    }

    public int getNumeroCompetencia() { return numeroCompetencia; }
    public int getVicorias() { return vicorias; }
    public int getPolePosition() { return polePosition; }
    public int getVueltasRapidas() { return vueltasRapidas; }
    public int getPodios() { return podios; }
    public ArrayList<PilotoEscuderia> getPilotoEscuderias() { return pilotoEscuderias; }
    public ArrayList<AutoPiloto> getAutoPilotos() { return autoPilotos; }

    public void setNumeroCompetencia(int numeroCompetencia) { this.numeroCompetencia = numeroCompetencia; }
    public void setVicorias(int vicorias) { this.vicorias = vicorias; }
    public void setPolePosition(int polePosition) { this.polePosition = polePosition; }
    public void setVueltasRapidas(int vueltasRapidas) { this.vueltasRapidas = vueltasRapidas; }
    public void setPodios(int podios) { this.podios = podios; }
    public void setPilotoEscuderias(ArrayList<PilotoEscuderia> pilotoEscuderias) { this.pilotoEscuderias = pilotoEscuderias; }
    public void setAutoPilotos(ArrayList<AutoPiloto> autoPilotos) { this.autoPilotos = autoPilotos; }

    @Override
    public String toString() {
        return "Piloto{" +
                "numeroCompetencia=" + numeroCompetencia +
                ", vicorias=" + vicorias +
                ", polePosition=" + polePosition +
                ", vueltasRapidas=" + vueltasRapidas +
                ", podios=" + podios +
                ", pilotoEscuderias=" + pilotoEscuderias +
                ", autoPilotos=" + autoPilotos +
                '}';
    }
}
