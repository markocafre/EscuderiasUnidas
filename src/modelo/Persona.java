package modelo;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private Pais pais;

    public Persona(){}

    public Persona(String dni, String nombre, String apellido, Pais pais) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public Pais getPais() { return pais; }

    public void setDni(String dni) { this.dni = dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setPais(Pais pais) { this.pais = pais; }

    @Override
    public String toString() {
        return "modelo.Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais=" + pais +
                '}';
    }
}
