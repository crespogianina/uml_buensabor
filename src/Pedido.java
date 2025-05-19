import java.time.LocalTime;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;
    private Set<DetallePedido> detallePedido;


    Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, TipoEnvio tipoEnvio,FormaPago formaPago, LocalDate fechaPedido ){
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.estado = Estado.pendiente;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void addDetallePedido(DetallePedido detallePedido){
        if(this.detallePedido == null) this.detallePedido = new HashSet<>();
        this.detallePedido.add(detallePedido);
    }

    public void removeDetallePedido(DetallePedido detallePedido){
        this.detallePedido.remove(detallePedido);
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setDetallePedido(Set<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoEnvio=" + tipoEnvio +
                ", formaPago=" + formaPago +
                ", fechaPedido=" + fechaPedido +
                ", domicilio=" + domicilio +
                ", sucursal=" + sucursal +
                ", factura=" + factura +
                ", detallePedido=" + detallePedido +
                '}';
    }
}
