public class Socio {
    private int idSocio;
    private Libro libroPrestados;

    public Socio(int idSocio) {
        this.idSocio = idSocio;
        libroPrestados = null;
    }


    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public Libro getLibroPrestados() {
        return libroPrestados;
    }

    public void setLibroPrestados(Libro libroPrestados) {
        this.libroPrestados = libroPrestados;
    }
}
