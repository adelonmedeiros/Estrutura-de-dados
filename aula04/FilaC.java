package aula04;

public class FilaC {

    int comeco;
    int fim;
    int qtd;

    int[] vetor;

    public FilaC(int tam) {

        comeco = 0;
        fim = comeco;
        qtd = 0;
        this.vetor = new int[tam];
    }

    public boolean isFull() {
        return (this.qtd == this.vetor.length);
    }

    public void enqueue(int k) {
        if (!isFull()) {
            vetor[fim] = k;
            fim++;
            qtd++;

        } else {
            fim = 0;
        }
    }

    public boolean isEmpty() {
        return (this.qtd == 0);
    }

    public int dequeue() {
        if (!isEmpty()) {
            int x = vetor[comeco];
            vetor[comeco] = 0;
            qtd--;
            if (!isFull()) {
                comeco++;
            }
            return x;
        }
        return 0;
    }
}