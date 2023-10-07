public class Main {
    public static void main(String[] args) {
        gestorGasolinera gs = new gestorGasolinera();
        gs.agregarEmpleado("tato");
        gs.agregarEmpleado("pepe");
        gs.agregarExpendedora("Gasoil");
        gs.agregarExpendedora("nafta");
        gs.agregarCliente("julian","777vegeta");
        gs.agregarCliente("mique","666vegeta");
        gs.agregarVenta(1,0,"777vegeta",0,4,"Gasoil");
        gs.agregarVenta(0,0,"777vegeta",1,30,"nafta");
        gs.agregarVenta(0,1,"666vegeta",1,30,"nafta");
        gs.mostrarVentas();
        System.out.println("\n");
        gs.top10();
    }
}