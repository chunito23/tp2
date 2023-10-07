import java.time.LocalDate;
import java.util.ArrayList;

public class Tesis extends publicacion{
    private String autor;

    public Tesis(String autor, String nombre, String editor, String telefonoProveedor, LocalDate aniopublicacion) {
        super(nombre, editor, telefonoProveedor, aniopublicacion);
        this.autor = autor;
    }

}
