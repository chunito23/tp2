public class Prestamo {
    private String NombrelibroPrestado;
    private int idsocioParaPrestar;


    public Prestamo(String nombrelibroPrestado, int idsocioParaPrestar) {
        this.NombrelibroPrestado = nombrelibroPrestado;
        this.idsocioParaPrestar = idsocioParaPrestar;
    }

    public int getIdsocioParaPrestar() {
        return idsocioParaPrestar;
    }

    public String getNombrelibroPrestado() {
        return NombrelibroPrestado;
    }

    public void mostrar() {
        System.out.println("Detalles del Préstamo:");
        System.out.println("Libro Prestado: " + NombrelibroPrestado);
        System.out.println("ID del Socio: " + idsocioParaPrestar);
    }
}
