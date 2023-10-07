import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Biblioteca {
    private int idPrestamo = 0;
    Map<String,Libro> libroMap = new HashMap<>();
    Map<String,Revista> RevistaMap = new HashMap<>();
    Map<String,Tesis> TesistaMap = new HashMap<>();
    Map<String,Diario> diarioMap = new HashMap<>();
    Map<Integer,Socio> socioMap = new HashMap<>();
    Map<Integer,Prestamo> PrestamoMap = new HashMap<>();

    public void PrestarPublicacion(int Idsocio,String nombre){
        Libro l = libroMap.get(nombre);
        if (l.getCantidadEjemplares() > 0){
            Socio s = socioMap.get(Idsocio);
            if (s.getLibroPrestados() == null){
                s.setLibroPrestados(l);
                l.setCantidadEjemplares(l.getCantidadEjemplares()-1);
                PrestamoMap.put(idPrestamo,new Prestamo(nombre,Idsocio));
                idPrestamo++;
            }
        }
    }

    public void mostrarPrestamos(){
        for(Map.Entry<Integer,Prestamo> p : PrestamoMap.entrySet()){
            p.getValue().mostrar();
        }
    }

    public void agregarLibro(ArrayList<String> autores, String nombre, String isbn, String editor, String telefonoProveedor, int cantidadEjemplares, LocalDate aniopublicacion) {
        Libro libro = new Libro(autores, nombre, isbn, editor, telefonoProveedor, cantidadEjemplares, aniopublicacion);
        libroMap.put(nombre, libro);
    }

    public void agregarSocio(int idSocio) {
        Socio socio = new Socio(idSocio);
        socioMap.put(idSocio, socio);
    }




}
