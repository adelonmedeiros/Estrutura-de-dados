public class Pilha {

    char[] elementos;
    int topo;

    public Pilha() {
        this.elementos = new char[25];
        topo = -1; // posiçao inválida do vetor
    }

    public void push(char e) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow!");
        }
        topo++;
        this.elementos[topo] = e;

    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack!");
        }
        char e;
        e = elementos[topo];
        topo--;
        return e;

    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == this.elementos.length - 1);
    }

    public int topo() {
        if (isEmpty()) {
            throw new RuntimeException("Empty Stack!");
        }
        return this.elementos[topo];

    }
}