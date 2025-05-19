import java.util.HashSet;
import java.util.Set;

public class ArticuloInsumo extends Articulo {

    private double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private boolean esParaElaborar;

    public ArticuloInsumo() {
    }

    public ArticuloInsumo(double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar, String denominacion, double precioVenta) {
        super(denominacion,precioVenta);
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

    public double getPrecioCompra(){
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(int stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public boolean isEsParaElaborar() {
        return esParaElaborar;
    }

    public void setEsParaElaborar(boolean esParaElaborar){
        this.esParaElaborar = esParaElaborar;
    }
}
