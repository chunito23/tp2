public class CamionetaFlete extends  Vehiculo{

    public CamionetaFlete(int base,int cantidadAsientos, String patente) {
        super(base,cantidadAsientos, patente);
    }

    public void calcularPrecio(int cantidadDias,int pat){
        setPrecio(((getBase() + (600 *  pat)) * cantidadDias));
    }

}
