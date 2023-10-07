public class expendedor {
    private int CodigoExpededor;
    private int litrosExpendidos;
    private String tipoCombustible;
    private int ganancias;


    public expendedor(int codigoExpededor, String tipoCombustible) {
        CodigoExpededor = codigoExpededor;
        this.litrosExpendidos = 0;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCodigoExpededor() {
        return CodigoExpededor;
    }

    public int getLitrosExpendidos() {
        return litrosExpendidos;
    }

    public void setLitrosExpendidos(int litros) {
        litrosExpendidos = litros;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }


    public void mostrar() {
        System.out.println("Código de Expendedor: " + CodigoExpededor);
        System.out.println("Litros Expedidos: " + litrosExpendidos);
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("ganancias: " + ganancias);
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getGanancias() {
        return ganancias;
    }
}
