public class Fila {

    private int [] codigo;
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila(){
        codigo = new int[1000];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void enfileirar(int elemento){
    codigo[ultimo] = elemento;
    ultimo = (ultimo++) % codigo.length;
    total++;
    }

    public int desemfileirar(){
    int elemento = codigo[primeiro];
    primeiro = (primeiro--) % codigo.length;
    total--;
    return elemento;
    }

    public boolean isEmpty(){
    return total==0;
    }

    public boolean isFull(){
    return  total==codigo.length;
    }
}