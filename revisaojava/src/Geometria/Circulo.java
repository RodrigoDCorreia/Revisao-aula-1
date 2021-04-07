package Geometria;

public class Circulo extends Forma{
    protected double raio;

    public Circulo() {
        raio = 1.0;
    }

    public Circulo(double raio) {
        setRaio(raio);
    }

    public Circulo(String cor, boolean preenchido, double raio) {
        super(cor, preenchido);
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI*(raio*raio);
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public String toString() {
        return "Circulo[" +
                "raio=" + raio +
                ", " + super.toString() +
                ']';
    }
}
