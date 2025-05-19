import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles;


    public ArticuloManufacturado(String denominacion, double precioVenta, String descripcion, int tiempoEstimadoMinutos, String preparacion){
        super(denominacion, precioVenta);
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

    public void addDetalle(Integer cantidad, ArticuloInsumo insumo) {
        ArticuloManufacturadoDetalle detalle = new ArticuloManufacturadoDetalle(cantidad, insumo);
        if (this.detalles == null){
            this.detalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.detalles.add(detalle);
    }
    public void addDetalle(ArticuloManufacturadoDetalle detalle) {
        if (this.detalles == null){
            this.detalles = new HashSet<ArticuloManufacturadoDetalle>();
        }
        this.detalles.add(detalle);
    }

    public void removeDetalle(ArticuloManufacturadoDetalle detalle){
        this.detalles.remove(detalle);
    }

}
