import java.time.LocalDate;

public class publicacion {
    private String nombre;
    private String editor;
    private String telefonoProveedor;
    private LocalDate Aniopublicacion;


    public publicacion(String nombre, String editor, String telefonoProveedor, LocalDate aniopublicacion) {
        this.nombre = nombre;
        this.editor = editor;
        this.telefonoProveedor = telefonoProveedor;
        Aniopublicacion = aniopublicacion;
    }
}
