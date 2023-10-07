import java.time.LocalDate;

public class EmpleadoComision extends EmpleadoBase{
    private double sueldo;
    private int CantidadVentas;

    public EmpleadoComision(String nombre, String apellido, String cuil, String telefono, LocalDate cumpleaños) {
        super(nombre,apellido,cuil,telefono,cumpleaños);
    }


    public double calcularSueldo(int venta,int cantidad,double porcentajeCantidad) {
        LocalDate fechaCumpleaños = getCumpleaños();
        LocalDate hoy = LocalDate.now();
        sueldo = (venta * porcentajeCantidad ) * cantidad;
        if (fechaCumpleaños.getMonth() == hoy.getMonth() && fechaCumpleaños.getDayOfMonth() == hoy.getDayOfMonth()){
            sueldo += (venta * 0.05 ) * cantidad;;
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
