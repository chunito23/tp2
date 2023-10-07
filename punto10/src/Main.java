import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empresa empre = new Empresa();
        empre.agregarEmpleadosComision("tato","puyelli","42412312","23553231", LocalDate.of(2323,2,4));
        empre.agregarEmpleadosHora("mique","correa","422762312","2355352",LocalDate.of(2323,2,1));
        empre.agregarEmpleadoAsalariado("julian","puyi","4214566","987652",LocalDate.of(23232,9,26));
        empre.agregarEmpleadosComisionyBase("franco","contreas","754612","42141",LocalDate.of(2332,2,5));
        empre.agregarPasante("chuni","dominguez","21309412","5321662",LocalDate.of(2323,7,2));

        empre.calcularSalarioPasante("chuni");
        empre.CalcularSalarioEmpleadoAsalariado("julian",200);
        empre.CalcularSalarioEmpleadoComision("tato",200,3);
        empre.CalcularSalarioEmpleadoComisionyBase("franco",300,6,24);
        empre.CalcularSalarioEmpleadoHora("mique",20,200);

    }
}