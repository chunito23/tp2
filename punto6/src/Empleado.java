public class Empleado {
    private String nombre;
    private int idEmpleado;
    private int ventasTotales;


    public Empleado(String nombre, int idEmpleado) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        ventasTotales = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(int ganancias) {
        this.ventasTotales = ganancias;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID de Empleado: " + idEmpleado);
        System.out.println("Ventas Totales: " + ventasTotales);
    }
}
