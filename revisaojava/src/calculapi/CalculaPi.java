package calculapi;

public class CalculaPi {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        int numerador = 1;

        for (int i = 1; i < max; i+= 2) {
            System.out.println(numerador + "/"+ i);
            numerador *= -1;

        }
    }
}
