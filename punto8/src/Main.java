import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        biblio.agregarSocio(1);
        ArrayList<String> autoresLibro = new ArrayList<>();
        autoresLibro.add("eltato");
        biblio.agregarLibro(autoresLibro,"las aventuaras de pepe","123cwe","juliEditorial","2325414056",2, LocalDate.of(2023,2,4));
        biblio.PrestarPublicacion(1,"las aventuaras de pepe");
        biblio.mostrarPrestamos();
    }
}