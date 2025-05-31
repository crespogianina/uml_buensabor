public class DetallePedido {
    private Integer cantidad;
    private double subTotal;
    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad, double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = this.calcularSubTotal();
    }

    public DetallePedido(Integer cantidad, double subTotal, Articulo articulo) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.articulo = articulo;
    }

    public double calcularSubTotal() {
        return this.articulo.getPrecioVenta() * this.cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", articulo=" + articulo +
                '}';
    }
}
