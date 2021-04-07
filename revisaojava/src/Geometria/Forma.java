package Geometria;

public abstract class Forma {
    protected String cor;
    protected boolean preenchido;

    public Forma() {
        cor = "Red";
        preenchido = true;
    }

    public Forma(String cor, boolean preenchido) {
        setCor(cor);
        setPreenchido(preenchido);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }

    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma[" +
                "cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                ']';
    }
}
