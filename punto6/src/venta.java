public class venta {
    private int idventa;
    private int idEmpleado;
    private String patente;
    private int CodigoExpededor;
    private String tipoCombustible;
    private int pago;

    public venta(int idventa,int idEmpleado, String patente, int codigoExpededor, int pago,String tipoCombustible) {
        this.idventa = idventa;
        this.idEmpleado = idEmpleado;
        this.patente = patente;
        this.CodigoExpededor = codigoExpededor;
        this.pago = pago;
        this.tipoCombustible = tipoCombustible;
    }

    public int getPago() {
        return pago;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getPatente() {
        return patente;
    }

    public int getCodigoExpededor() {
        return CodigoExpededor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void mostrar() {
        System.out.println("ID de Venta: " + idventa);
        System.out.println("ID de Empleado: " + idEmpleado);
        System.out.println("Patente: " + patente);
        System.out.println("Código de Expendedor: " + CodigoExpededor);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Pago: " + pago);
    }
}
