public class CamionCarga extends  Vehiculo{

    public CamionCarga(int cantidadAsientos, String patente)     {
        super(0,cantidadAsientos, patente);
    }

    private int calcularCuotaFija(int cantidadDias){
        if (cantidadDias > 30){
            return 75000;
        }else{
            return 100000;
        }
    }

    public void calcularPrecio(int cantidadDias){
        setPrecio(calcularCuotaFija(cantidadDias) * cantidadDias);
    }


}
