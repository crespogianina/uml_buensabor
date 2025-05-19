public class Domicilio {

    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;

    public Domicilio() {}

    public Domicilio(String calle, Integer numero, Integer cp, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    public Domicilio(String calle, Integer numero, Integer cp, String localidad, String provincia, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = new Localidad(localidad, provincia, pais);
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCp() {
        return cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

}
