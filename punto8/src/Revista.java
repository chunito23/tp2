import java.time.LocalDate;

public class Revista extends publicacion{
    private String issn;
    private int numeroPublicacion;

    public Revista(String issn, int numeroPublicacion,String nombre, String editor, String telefonoProveedor, LocalDate aniopublicacion) {
        super(nombre, editor, telefonoProveedor, aniopublicacion);
        this.issn = issn;
        this.numeroPublicacion = numeroPublicacion;
    }
}
