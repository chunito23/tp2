import java.time.LocalDate;

public class EmpleadoAsalariado extends EmpleadoBase {
    private double sueldo;


    public EmpleadoAsalariado(String nombre, String apellido, String cuil, String telefono, LocalDate cumpleaños) {
        super(nombre,apellido,cuil,telefono,cumpleaños);
    }


    public double calcularSueldo(int monto) {
        LocalDate fechaCumpleaños = getCumpleaños();
        LocalDate hoy = LocalDate.now();
        sueldo = monto;
        if (fechaCumpleaños.getMonth() == hoy.getMonth() && fechaCumpleaños.getDayOfMonth() == hoy.getDayOfMonth()){
            sueldo += 2000;
        }

        return sueldo;
    }
}
