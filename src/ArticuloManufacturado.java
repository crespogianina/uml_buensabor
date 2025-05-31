import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles;


    public ArticuloManufacturado(String denominacion, UnidadMedida unidad, double precioVenta, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
        super(denominacion, precioVenta, unidad);
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        if (this.detalles == null) {
            this.detalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.detalles.add(detalle);
    }

    public void removeDetalle(ArticuloManufacturadoDetalle detalle) {
        this.detalles.remove(detalle);
    }

    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                super.toString() +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", detalles=" + detalles +
                '}';
    }
}
