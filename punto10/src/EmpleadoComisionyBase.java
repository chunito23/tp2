import java.time.LocalDate;

public class EmpleadoComisionyBase extends EmpleadoBase{
    private double sueldo;
    private int CantidadVentas;

    public EmpleadoComisionyBase(String nombre,String apellido,String cuil,String telefono,LocalDate cumpleaños) {
        super(nombre,apellido,cuil,telefono,cumpleaños);
    }


    public double calcularSueldo(int base , int venta, int cantidad, double porcentajeCantidad) {
        LocalDate fechaCumpleaños = getCumpleaños();
        LocalDate hoy = LocalDate.now();
        sueldo = base + ((venta * porcentajeCantidad ) * cantidad);
        if (fechaCumpleaños.getMonth() == hoy.getMonth() && fechaCumpleaños.getDayOfMonth() == hoy.getDayOfMonth()){
            sueldo += 1000 + ((venta * 0.05 ) * cantidad);;
        }
        return sueldo;
    }

    public int getCantidadVentas() {
        return CantidadVentas;
    }

    public void setCantidadVentas(int cantidad) {
        this.CantidadVentas = cantidad;
    }
}
