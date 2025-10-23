public class PilotoEscuderia {
    private String desdeFecha;
    private String hastaFecha;
    private Piloto piloto;
    private Escuderia escuderia;

    public PilotoEscuderia(){}

    public PilotoEscuderia(String desdeFecha, String hastaFecha, Piloto piloto, Escuderia escuderia) {
        this.desdeFecha = desdeFecha;
        this.hastaFecha = hastaFecha;
        this.piloto = piloto;
        this.escuderia = escuderia;
    }

    public String getDesdeFecha() { return desdeFecha; }
    public String getHastaFecha() { return hastaFecha; }
    public Piloto getPiloto() { return piloto; }
    public Escuderia getEscuderia() { return escuderia; }

    public void setDesdeFecha(String desdeFecha) { this.desdeFecha = desdeFecha; }
    public void setHastaFecha(String hastaFecha) { this.hastaFecha = hastaFecha; }
    public void setPiloto(Piloto piloto) { this.piloto = piloto; }
    public void setEscuderia(Escuderia escuderia) { this.escuderia = escuderia; }

    @Override
    public String toString() {
        return "PilotoEscuderia{" +
                "desdeFecha='" + desdeFecha + '\'' +
                ", hastaFecha='" + hastaFecha + '\'' +
                ", piloto=" + piloto +
                ", escuderia=" + escuderia +
                '}';
    }
}
