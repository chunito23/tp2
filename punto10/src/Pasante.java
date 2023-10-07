import java.time.LocalDate;

public class Pasante extends EmpleadoBase{
    private double sueldo;

    public Pasante(String nombre, String apellido, String cuil, String telefono, LocalDate cumpleaños) {
        super(nombre,apellido,cuil,telefono,cumpleaños);
    }


    public double calcularSueldo() {
        sueldo = 0;
        return sueldo;
    }
}
