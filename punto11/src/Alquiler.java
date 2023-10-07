import java.time.LocalDate;

public class Alquiler {
    int idalquiler;
    int  idcliente;
    String patente;
    int presupuesto;
    int cantidadDias;
    LocalDate fechaprestado;
    LocalDate fechaDevolver;
    LocalDate fechaDevuelto;

    public Alquiler(int idcliente, String patente, int presupuesto, int cantidadDias, LocalDate fechaprestado, LocalDate fechaDevolver,int idalquiler) {
        this.idalquiler = idalquiler;
        this.idcliente = idcliente;
        this.patente = patente;
        this.presupuesto = presupuesto;
        this.cantidadDias = cantidadDias;
        this.fechaprestado = fechaprestado;
        this.fechaDevolver = fechaDevolver;
        this.fechaDevuelto = null;
    }


}
