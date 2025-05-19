public class ArticuloManufacturadoDetalle {

    private Integer cantidad;
    private ArticuloInsumo insumo;


    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloInsumo insumo) {
        this.cantidad = cantidad;
        this.insumo = insumo;
    }

    public ArticuloInsumo getInsumo() {
        return insumo;
    }

    public void setArticuloInsumo(ArticuloInsumo insumo){
        this.insumo = insumo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
