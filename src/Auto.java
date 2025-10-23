import java.util.ArrayList;

public class Auto {
    private String modelo;
    private String motor;
    private Escuderia escuderia;
    private ArrayList<AutoPiloto> autoPilotos;

    public Auto(){}

    public Auto(String modelo, String motor, Escuderia escuderia, ArrayList<AutoPiloto> autoPilotos) {
        this.modelo = modelo;
        this.motor = motor;
        this.escuderia = escuderia;
        this.autoPilotos = autoPilotos;
    }

    public String getModelo() { return modelo; }
    public String getMotor() { return motor; }
    public Escuderia getEscuderia() { return escuderia; }
    public ArrayList<AutoPiloto> getAutoPilotos() { return autoPilotos; }

    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMotor(String motor) { this.motor = motor; }
    public void setEscuderia(Escuderia escuderia) { this.escuderia = escuderia; }
    public void setAutoPilotos(ArrayList<AutoPiloto> autoPilotos) { this.autoPilotos = autoPilotos; }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", escuderia=" + escuderia +
                ", autoPilotos=" + autoPilotos +
                '}';
    }
}
