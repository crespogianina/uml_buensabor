import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Empresa {

    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa() {
    }

    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    public Empresa(String nombre, String razonSocial, Integer cuil, Sucursal sucursal) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
        this.sucursales.add(sucursal);
    }

    public String getNombre() {
        return nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void addSucursal(Sucursal sucursal){
        if (this.sucursales==null)this.sucursales= new HashSet<>();
        sucursales.add(sucursal);
    }

    public void removeSucursal(Sucursal sucursal){
        sucursales.remove(sucursal);
    }

    public Set<Sucursal>getSucursales() {
        return sucursales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }
}