public class DetallePedido {
    private Integer cantidad;
    private double subTotal;
    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad, double subTotal, Pedido pedido) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    public DetallePedido(Integer cantidad, double subTotal, Articulo articulo) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.articulo = articulo;
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

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
