import java.util.ArrayList;

public class Mecanico extends Persona{
    private Especialidad especialidad;
    private int aniosExperiencia;
    private ArrayList<Escuderia> escuderias;

    public Mecanico(){}

    public Mecanico(String dni, String nombre, String apellido, Pais pais, Especialidad especialidad, int aniosExperiencia, ArrayList<Escuderia> escuderias) {
        super(dni, nombre, apellido, pais);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
        this.escuderias = escuderias;
    }

    public Especialidad getEspecialidad() { return especialidad; }
    public int getAniosExperiencia() { return aniosExperiencia; }
    public ArrayList<Escuderia> getEscuderias() { return escuderias; }

    public void setEspecialidad(Especialidad especialidad) { this.especialidad = especialidad; }
    public void setAniosExperiencia(int aniosExperiencia) { this.aniosExperiencia = aniosExperiencia; }
    public void setEscuderias(ArrayList<Escuderia> escuderias) { this.escuderias = escuderias; }

    @Override
    public String toString() {
        return "Mecanico{" +
                "especialidad=" + especialidad +
                ", aniosExperiencia=" + aniosExperiencia +
                ", escuderias=" + escuderias +
                '}';
    }
}
