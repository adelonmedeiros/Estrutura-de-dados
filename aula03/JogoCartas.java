package aula03;
import java.util.Arrays;
import java.util.Scanner;

public class JogoCartas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite seu nome:");

        String nome = entrada.nextLine();

        PilhaNome inversao = new PilhaNome(nome.length());

        for(int i=0; i<nome.length(); i++){
            inversao.push(nome.charAt(i));
        }

        while(!inversao.isEmpty()){
            System.out.print(inversao.pop());
        }
        System.out.println("");

        Pilha baralho = new Pilha (5);

        while (!baralho.isFull()){
            System.out.println("Digite uma carta (1-9) (K,J,Q)");

            char carta = entrada.next().charAt(0);

            System.out.println("Digite a inicial do Naipe (C: Copas, P: Paus, E: Espadas, O: Ouros)");
            char naipe = entrada.next().charAt(0);

            baralho.push(carta,naipe);


            System.out.println(Arrays.toString(baralho.p));
            System.out.println(Arrays.toString(baralho.n));
            System.out.println("size da pilha:"+baralho.size());
        }

        while(!baralho.isEmpty()){
            System.out.println(baralho.peek_p());
            baralho.pop();
        }


    }

}
