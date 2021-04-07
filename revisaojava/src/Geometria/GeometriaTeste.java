package Geometria;

public class GeometriaTeste {
    public static void main(String[] args) {
        double raio = Double.parseDouble(args[0]);
        double altura = Double.parseDouble(args[1]);
        double base = Double.parseDouble(args[2]);
        double lado = Double.parseDouble(args[3]);

        Retangulo r = new Retangulo(base, altura);
        Circulo c = new Circulo(raio);
        Quadrado q = new Quadrado(lado);

        System.out.println("Testes realizados\n");
        System.out.println("Área do Círculo: " + c.getArea());
        System.out.println("Perímetro do Círculo: " + c.getPerimetro());
        System.out.println("Área do Retângulo: " + r.getArea());
        System.out.println("Perímetro do Retângulo: " + r.getPerimetro());
        System.out.println("Área do Quadrado: " + q.getArea());
        System.out.println("Perímetro do Quadrado: " + q.getPerimetro());
    }
}
