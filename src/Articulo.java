import java.util.HashSet;
import java.util.Set;

public abstract class Articulo {
    protected String denominacion;
    protected Double precioVenta;

    private UnidadMedida unidadMedida;
    private Set<Imagen> imagenes = new HashSet();

    public Articulo() {
    }

    public Articulo(String denominacion, double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getDenominacion(){
        return denominacion;
    }

    public void setDenominacion (String denominacion){
        this.denominacion= denominacion;
    }

    public double getPrecioVenta(){
        return precioVenta;
    }

    public void setPrecioVenta (double prcioVenta){
        this.precioVenta= precioVenta;
    }

    public void addImagen(Imagen imagen){
        if (this.imagenes == null) {
            this.imagenes = new HashSet<Imagen>();
        }
        this.imagenes.add(imagen);
    }

    public void removeImagen(Imagen imagen){
        imagenes.remove(imagen);
    }

}
