public class Main {
    public static void main(String[] args) {
        formas f = new formas();
        f.agregarForma2D(new formas.Circulo(2));
        f.agregarForma2D(new formas.cuadrado(2));
        f.agregarForma2D(new formas.Rectangulo(2,2));
        f.agregarForma2D(new formas.triángulo(2,3));
        f.agregarForma3D(new formas.esfera(2));
        f.agregarForma3D(new formas.tetraedro(2));
        f.agregarForma3D(new formas.cubo(2));
        f.agregarForma3D(new formas.paralelepipedo(2,2,2));

        f.MostrarAreasFormas2d();
        f.MostrarAreasFormas3d();
    }
}