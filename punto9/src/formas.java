import java.util.ArrayList;

public class formas {
    ArrayList<Forma2d> formas2d = new ArrayList<>();
    ArrayList<Forma3D> formas3d = new ArrayList<>();

    public void agregarForma2D(Forma2d forma) {
        formas2d.add(forma);
    }

    // Method to add a 3D shape to the formas3d list
    public void agregarForma3D(Forma3D forma3D) {
        formas3d.add(forma3D);
    }

    public void MostrarAreasFormas2d(){
        for (Forma2d forma2d : formas2d) {
            System.out.println("el valor de area de " + forma2d.getName() + " es: " + forma2d.getArea());
        }
    }

    public void MostrarAreasFormas3d(){
        for (Forma3D forma3d : formas3d) {
            System.out.println("el valor de area de " + forma3d.getName() + " es: " + forma3d.getArea());
            System.out.println("el valor de volumen de " + forma3d.getName() + " es: " + forma3d.getVolumen());
        }
    }

    public static class Circulo extends Forma2d {
        private double radio;
        private String nombre;

        public Circulo(double radio) {
            this.radio = radio;
            this.nombre = "circulo";
        }

        @Override
        public String getName(){
            return this.nombre;
        }

        @Override
        public double getArea() {
            return Math.PI * Math.pow(radio, 2);
        }
    }

    public static class Rectangulo extends Forma2d {
        private double base;
        private double altura;
        private String nombre;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
            this.nombre = "rectangulo";
        }
        @Override
        public String getName(){
            return this.nombre;
        }


        @Override
        public double getArea() {
            return base * altura;
        }
    }

    public static class cuadrado extends Forma2d {
        private double Lado;
        private String nombre;

        public cuadrado(double lado) {
            Lado = lado;
            this.nombre = "cuadrado";
        }
        @Override
        public String getName(){
            return this.nombre;
        }


        @Override
        public double getArea() {
            return Lado * Lado;
        }
    }

    public static class triángulo extends Forma2d {
        private double base;
        private double altura;
        private String nombre;

        public triángulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
            this.nombre = "triangulo";
        }
        @Override
        public String getName(){
            return this.nombre;
        }


        @Override
        public double getArea() {
            return (base * altura) / 2;
        }
    }

    public static class esfera extends Forma3D {
        private double radio;
        private String nombre;

        public esfera(double radio) {
            this.radio = radio;
            this.nombre = "esfera";
        }
        @Override
        public String getName(){
            return this.nombre;
        }

        @Override
        public double getArea() {
            return 4 * Math.PI * Math.pow(radio,2);
        }
        @Override
        public double getVolumen(){
            return (4/3) * Math.PI * Math.pow(radio,3);
        }
    }

    public static class paralelepipedo extends Forma3D {
        private double arista1;
        private double arista2;
        private double arista3;
        private String nombre;

        public paralelepipedo(double arista1, double arista2, double arista3) {
            this.arista1 = arista1;
            this.arista2 = arista2;
            this.arista3 = arista3;
            this.nombre = "paralepido";
        }

        @Override
        public String getName(){
            return this.nombre;
        }

        @Override
        public double getArea() {
            return 2 * (arista1 * arista2 + arista1 * arista3 + arista2 * arista3);
        }
        @Override
        public double getVolumen(){
            return arista1 * arista2 * arista3;
        }
    }

    public static class cubo extends Forma3D {
        private double arista;
        private String nombre;

        public cubo(double arista) {
            this.arista = arista;
            this.nombre = "cubo";
        }

        @Override
        public String getName(){
            return this.nombre;
        }

        @Override
        public double getArea() {
            return 6 * Math.pow(arista,2);
        }
        @Override
        public double getVolumen(){
            return Math.pow(arista,3);
        }
    }

    public static class tetraedro extends Forma3D {
        private double arista;
        private String nombre;

        public tetraedro(double arista) {
            this.arista = arista;
            this.nombre = "tetraedro";
        }

        @Override
        public String getName(){
            return this.nombre;
        }

        @Override
        public double getArea() {
            return Math.pow(arista,2) * Math.sqrt(3);
        }
        @Override
        public double getVolumen(){
            return Math.pow(arista,3) * (Math.sqrt(2)/12);
        }
    }

}
