import java.util.HashSet;
import java.util.Set;

public class Categoria {
    private String denominacion;
    private Set<Categoria> subcategorias;
    private Categoria categoriaPadre;
    private Set<Articulo> articulos;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public Categoria(Categoria categoriaPadre, String denominacion) {
        this.categoriaPadre = categoriaPadre;
        this.denominacion = denominacion;
    }

    public Categoria() {
    }

    public void addSubcategoria(Categoria categoria) {
        if (this.subcategorias == null) {
            this.subcategorias = new HashSet<Categoria>();

        }
        this.subcategorias.add(categoria);
    }

    public void rmSubcategoria(Categoria categoria) {
        this.subcategorias.remove(categoria);
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Set<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(Set<Categoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public void addArticulo(Articulo articulo){
        if (this.articulos == null){
            this.articulos = new HashSet();
        }
        this.articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo){
        this.articulos.remove(articulo);
    }
}
