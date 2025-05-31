import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private Domicilio domicilio;

    private Set<Categoria> categorias= new HashSet<>();
    private Set<Promocion> promociones = new HashSet<>();

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio){
        this.nombre= nombre;
        this.horarioApertura=horarioApertura;
        this.horarioCierre=horarioCierre;
        this.domicilio=domicilio;
    }


    public void addCategoria(Categoria categoria) {
        if (this.categorias == null) {
            this.categorias  = new HashSet<>();
        }
        this.categorias.add(categoria);
    }
    public void rmCategoria (Categoria categoria) {
        this.categorias.remove(categoria);
    }

    public void addPromocion(Promocion promocion){
        if(this.promociones==null)this.promociones= new HashSet<>();
        this.promociones.add(promocion);
    }
    public void rmPromocion(Promocion promocion){
        this.promociones.remove(promocion);
    }


    public  Set<Promocion>getPromociones(){
        return promociones;
    }
    public Set<Categoria>getCategorias(){
        return categorias;
    }


    public String getNombre() {
        return nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public Domicilio getDomicilio(){
        return domicilio;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", domicilio=" + domicilio +
                ", categorias=" + categorias +
                ", promociones=" + promociones +
                '}';
    }
}
