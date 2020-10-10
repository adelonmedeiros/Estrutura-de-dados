package pilhadim;

import java.util.Stack;

/**
 *
 * @author 314702912
 */
public class Pilha {

    /**
     * @param args the command line arguments
     */

    // implements Comparable
    // int compareTo();

    public static void main(String[] args) {
        Stack <String> pilha = new Stack(); //objeto do tipo Stack
        //dinamico pq nao passou tamanho no construtor do objeto stack
        //pilha empilhar (push)
        //desempilhar (pop)
        //default q o proprio elemento passado via parametro herdado da classe Object
        pilha.push("Livro de cÃ¡lculo IV");//livro #1

        pilha.push("Livro de LÃ³gica - Ascencio");//livro #2

        pilha.push("BÃ­blia Sagrada");//livro #3

        pilha.push("Auto-ajuda : como controlar meu tempo");//livro #4

        System.out.println(pilha.pop()); //desempilha

        System.out.println(pilha.size()); //size tamanho da pilha

        System.out.println(pilha.peek()); //so mostra o q ta no topo da pilha mas n desempilha

        System.out.println(pilha.peek().charAt(0));

        System.out.println(pilha.peek().length());

        int c = 0;

        char [] palavra = {'c','a','s','a'};
        for(int i=0; i<palavra.length; i++){

            if(palavra[i]=='a'){
                c++;
            }
        }
        System.out.println("SÃ£o "+c+" incidencias de (a)");


        if('c' == 'C'){
            System.out.println("false");
        }
        else if("Chrysler".equals("Cowboy")){

        }


        System.out.println(pilha.pop());

        System.out.println(pilha.remove(0));

        pilha.clear();// limpar a pilha


    }

}