import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    private Usuario usuario;
    private Imagen imagen;
    private Set<Pedido> pedidos = new HashSet<Pedido>();
    private Set<Domicilio> domicilios = new HashSet<Domicilio>();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Usuario usuario, Imagen imagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.imagen = imagen;

    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }


    public void addDomicilio(Domicilio domicilio) {
        if (this.domicilios == null) this.domicilios = new HashSet<>();
        this.domicilios.add(domicilio);
    }

    public void removeDomicilio(Domicilio domicilio) {
        this.domicilios.remove(domicilio);
    }

    public void addPedido(Pedido pedido) {
        if (this.pedidos == null) this.pedidos = new HashSet<>();
        this.pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", usuario=" + usuario +
                ", imagen=" + imagen +
                ", pedidos=" + pedidos +
                ", domicilios=" + domicilios +
                '}';
    }
}
