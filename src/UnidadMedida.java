public class UnidadMedida {
    private String denominacion;

    public UnidadMedida( String denominacion){
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    @Override
    public String toString() {
        return "UnidadMedida{" +
                "denominacion='" + denominacion + '\'' +
                '}';
    }
}
