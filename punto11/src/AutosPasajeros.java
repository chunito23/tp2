public class AutosPasajeros extends  Vehiculo{
    private int valorplaza;
    private boolean vip;

    public AutosPasajeros(int base,int cantidadAsientos, String patente,boolean vip) {
        super(base,cantidadAsientos, patente);
        this.vip = vip;
    }

    public int CalcularPlaza(boolean vip){
        if (vip){
            return 500;
        }
        return 300;
    }

    public void calcularPrecio(int cantidadDias){
        setPrecio((getBase() + (CalcularPlaza(vip) * getCantidadAsientos()))*cantidadDias);
    }

}
