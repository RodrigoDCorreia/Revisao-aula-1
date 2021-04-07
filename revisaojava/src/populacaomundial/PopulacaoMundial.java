package populacaomundial;

import javax.xml.transform.SourceLocator;
import java.util.function.DoubleToLongFunction;

public class PopulacaoMundial {
    public static void main(String[] args) {
        double populacaoMundial = 7849945556.0;

        int anos = Integer.parseInt(args[0]);

        double popFutura = populacaoMundial * Math.pow(1 + 0.0105, anos);


        System.out.printf("%,2f pessoas.\n", popFutura);
    }
}
