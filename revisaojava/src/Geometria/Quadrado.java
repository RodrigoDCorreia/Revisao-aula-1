package Geometria;

public class Quadrado extends Retangulo{

    public Quadrado() {
    }

    public Quadrado(double lado) {
        super(lado, lado);
    }

    public Quadrado(String cor, boolean preenchido, double lado) {
        super(cor, preenchido, lado, lado);
    }

    public double getLado() {
        return getAltura();
    }

    public void setLado(double lado) {
        setAltura(lado);
        setBase(lado);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                ", lado=" + getAltura() +
                '}';
    }
}
