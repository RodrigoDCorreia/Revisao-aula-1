package Cartas;

public class CartaTeste {
    public static void main(String[] args) {
        Baralho b = new Baralho();
        System.out.println("Embaralhando o monte!");
        b.shuffle();

        boolean baralhoNaoVazio = true;

        while (baralhoNaoVazio) {
            try {
                System.out.println("Distribuindo " + b.distribute());
            } catch (IndexOutOfBoundsException ex){
                System.out.println("Nenhuma carta no baralho.");
                baralhoNaoVazio = false;
            }
        }
    }
}
