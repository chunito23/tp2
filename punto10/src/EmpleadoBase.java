import java.time.LocalDate;

public abstract class EmpleadoBase {
    private String cuit;
    private String nombre;
    private String apellido;
    private String telefono;
    private LocalDate cumpleaños;


    public EmpleadoBase(String nombre, String apellido, String cuit, String telefono,LocalDate cumpleaños) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.telefono = telefono;
        this.cumpleaños = cumpleaños;
    }

    public LocalDate getCumpleaños() {
        return cumpleaños;
    }
}
