public class Combi extends  Vehiculo{

    public Combi(int base,int cantidadAsientos, String patente) {
        super(base,cantidadAsientos, patente);
    }


    public void calcularPrecio(int cantidadDias){
        setPrecio((getBase()  * cantidadDias));
    }



}
