package aula04.ExamplesProf;

public class FilaC{

    int comeco;//anda o comeÃ§o para nÃ£o ter que atualizar todos elementos da fila ao chamar o dequeue()
    int fim;
    int qtd;

    int [] vetor;

    public FilaC(int tam){ //construtor da fila estatica circular
        comeco = 0;
        fim = comeco;
        qtd = 0;
        this.vetor = new int [tam];
    }


    public boolean isFull(){
        return (this.qtd == this.vetor.length);
    }

    public void enqueue(int k){
        if(!isFull()){
            vetor[fim] = k;
            fim++;
            qtd++;
        }
        else{
            fim = 0; //inicial fim!=comeco voltar o fim pro comeÃ§o
        }
    }

    public boolean isEmpty(){
        return (this.qtd == 0);
    }

    public int dequeue (){
        if(!isEmpty()){
            int x = vetor[comeco];
            vetor[comeco] = 0; //opcional
            qtd--;
            if(!isFull()){
                comeco++; // circular comeco - fim
            }
            return x;
        }
        return 0;
    }

}