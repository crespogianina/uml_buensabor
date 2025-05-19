public class Localidad {

    private String nombre;
    private Provincia provincia;

    public Localidad(String localidad, String provincia, String pais){
        this.nombre = localidad;
        this.provincia = new Provincia(provincia);
        this.provincia.setPais(new Pais(pais));
    }

    public Localidad(){}

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;

    }

    public String getNombre() {
        return nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }


}
