package aula03;
import java.lang.StackOverflowError;
import java.lang.NullPointerException;
public class Pilha {
    char [] p; //pilha estatica usa vetor
    char [] n; //pilha estatica usa vetor

    int topo; //indice do topo


    public Pilha(int tamanho){
        this.p = new char [tamanho];
        this.n = new char [tamanho];
        topo = -1; //marcando indice nulo pra mostrar que a pilha estÃ¡ vazia
    }


    public boolean isFull(){
        return (topo == this.p.length - 1);
    }

    //empilhar so pode ser feito se a pilha nao estiver cheia
    public void push (char elemento, char naipe){
        if(!isFull()){
            this.topo++;
            this.p[topo] = elemento;
            this.n[topo] = naipe;
        }else{
            System.out.println("EstÃ¡ cheia a pilha!!");
            throw new StackOverflowError();
        }
    }

    public boolean isEmpty(){
        return (this.topo == -1);
    }

    //desempilhar so pode ser feito se a pilha nÃ£o estiver vazia
    public char pop (){
        char elemento = ' ';
        if(!isEmpty()){
            elemento = this.p[topo];
            elemento = this.n[topo];
            topo--;
        }else{
            System.out.println("EstÃ¡ vazia nÃ£o dÃ¡ pra tirar o que nÃ£o existe");
            throw new NullPointerException();
        }
        return elemento;
    }

    public char peek_p(){

        switch(this.peek_n()){
            case 'P' : System.out.print("â™£ ");
                break;
            case 'C' : System.out.print("â™¥ ");
                break;
            case 'O' : System.out.print("â™¦ ");
                break;
            case 'E' : System.out.print("â™  ");
                break;
            default: System.out.println("Erro");
        }
        return (this.p[topo]);

    }

    public char peek_n(){
        return (this.n[topo]);
    }

    public int size(){
        return this.topo + 1; // -1 + 1 = 0 vazio. 0 + 1 = 1 elementos. 4 no topo + 1 = 5 elementos
    }
}