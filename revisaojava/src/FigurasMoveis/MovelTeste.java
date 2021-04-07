package FigurasMoveis;

public class MovelTeste {
    public static void main(String[] args) {
        String decisao = args[0];
        if(decisao.equals("c")){
            int raio = Integer.parseInt(args[1]);
            int x = Integer.parseInt(args[2]);
            int y = Integer.parseInt(args[3]);
            int velX = Integer.parseInt(args[4]);
            int velY = Integer.parseInt(args[5]);
            CirculoMovel c = new CirculoMovel(x,y,velX,velY,raio);
            System.out.println(c.toString());
            System.out.println("Movendo para cima");
            c.moverParaCima();
            System.out.println(c.toString());
            System.out.println("Movendo para direita");
            c.moverParaDireita();
            System.out.println(c.toString());
            System.out.println("Movendo para baixo");
            c.moverParaBaixo();
            System.out.println(c.toString());
            System.out.println("Movendo para esquerda");
            c.moverParaEsquerda();
            System.out.println(c.toString());

        }
        else if(decisao.equals("r")){
            int x1 = Integer.parseInt(args[1]);
            int y1 = Integer.parseInt(args[2]);
            int x2 = Integer.parseInt(args[3]);
            int y2 = Integer.parseInt(args[4]);
            int velX = Integer.parseInt(args[5]);
            int velY = Integer.parseInt(args[6]);
            RetanguloMovel r = new RetanguloMovel(x1,y1,x2,y2,velX,velY);
            System.out.println(r.toString());
            System.out.println("Movendo para cima");
            r.moverParaCima();
            System.out.println(r.toString());
            System.out.println("Movendo para direita");
            r.moverParaDireita();
            System.out.println(r.toString());
            System.out.println("Movendo para baixo");
            r.moverParaBaixo();
            System.out.println(r.toString());
            System.out.println("Movendo para esquerda");
            r.moverParaEsquerda();
            System.out.println(r.toString());
        }
        else{
            System.out.println("Decisão inválida");
        }
    }
}
