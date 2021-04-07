package Cartas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> monte;
    private int cartaAtual;
    public static final int TOTAL_DE_CARTAS = 52;

    public static final String[] NAIPES = {
            "Paus", "Ouros", "Copas", "Espadas"
    };

    public static final String[] VALORES = {
            "Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito",
            "Nove", "Dez", "Valete", "Dama", "Rei"
    };

    public Baralho() {
        //instancia o monte com TOTAL_DE_CARTAS
        monte = new ArrayList<>(TOTAL_DE_CARTAS);

        //para cada naipe faça
        for (String naipe : NAIPES){
            //para cada valor faça
            for (String valor : VALORES){
                Carta c = new Carta(naipe, valor);

                monte.add(c);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(monte);
        cartaAtual = 0;
    }

    public Carta distribute(){
        if(monte.isEmpty()){
            throw new RuntimeException("Baralho vazio.");
        }

        return monte.get(cartaAtual++);
    }
}
