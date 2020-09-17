package aula03;
public class PilhaNome {
    char [] letra;
    int topo; //indice do topo


    public PilhaNome(int tamanho){
        this.letra = new char [tamanho];
        topo = -1; //marcando indice nulo pra mostrar que a pilha estÃ¡ vazia
    }


    public boolean isFull(){
        return (topo == this.letra.length - 1);
    }

    //empilhar so pode ser feito se a pilha nao estiver cheia
    public void push (char elemento){
        if(!isFull()){
            this.topo++;
            this.letra[topo] = elemento;
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
            elemento = this.letra[topo];
            topo--;
        }else{
            System.out.println("EstÃ¡ vazia nÃ£o dÃ¡ pra tirar o que nÃ£o existe");
            throw new NullPointerException();
        }
        return elemento;
    }

    public char peek(){
        return (this.letra[topo]);

    }


    public int size(){
        return this.topo + 1; // -1 + 1 = 0 vazio. 0 + 1 = 1 elementos. 4 no topo + 1 = 5 elementos
    }

}