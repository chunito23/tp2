import java.time.LocalDate;

public class EmpleadoHora extends EmpleadoBase{
    private double sueldo;

    public EmpleadoHora(String nombre, String apellido, String cuil, String telefono, LocalDate cumpleaños) {
        super(nombre,apellido,cuil,telefono,cumpleaños);
    }


    public double calcularSueldo(int monto,int cantidadHoras) {
        int extra = 0;
        sueldo = monto * cantidadHoras;
        if (cantidadHoras > 40){
            sueldo += sueldo*0.20;
        }
        return sueldo;
    }
}
