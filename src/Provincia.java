
public class Provincia {

    private String nombre;
    private Pais pais;

    public Provincia() {
    }

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;

    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                '}';
    }
}
