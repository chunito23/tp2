public class Vehiculo {
    private int cantidadAsientos;
    private int precio;
    private String patente;
    private int base;



    public Vehiculo(int base,int cantidadAsientos, String patente) {
        this.cantidadAsientos = cantidadAsientos;
        this.patente = patente;
        this.base = base;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }


    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public int getBase() {
        return base;
    }
}
