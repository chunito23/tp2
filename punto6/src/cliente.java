public class cliente {
    private String nombre;
    private String patente;
    private int idcliente;
    private int gasto;

    public cliente(int idcliente,String nombre, String patente) {
        this.nombre = nombre;
        this.patente = patente;
        this.idcliente = idcliente;
        this.gasto = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    public int getIdcliente(){
        return idcliente;
    }

    public void mostrarCliente() {
        System.out.println("ID: " + idcliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Patente: " + patente);
        System.out.println("Gasto: " + gasto);
    }
}
