import java.time.LocalDate;
import java.util.*;

public class Libro extends  publicacion {
    private String isbn;
    private ArrayList<String> autores;
    private int cantidadEjemplares;

    public Libro(ArrayList<String> autores,String nombre,String isbn, String editor, String telefonoProveedor,int cantidadEjemplares, LocalDate aniopublicacion) {
        super(nombre, editor, telefonoProveedor, aniopublicacion);
        this.autores = autores;
        this.isbn = isbn;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    // Getter para autores
    public ArrayList<String> getAutores() {
        return autores;
    }


    // Getter para cantidad de ejemplares
    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    // Setter para cantidad de ejemplares
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
}
