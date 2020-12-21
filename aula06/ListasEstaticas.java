/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula001_listasestaticas;

/**
 *
 * @author BrunoMulina
 */
public class ListasEstaticas {
    private double [] vetor;
    private int tamanho;
    private int ocupacao;
    
    
    public ListasEstaticas(int tamanho){
        this.vetor = new double[tamanho];
        this.tamanho = tamanho;
        this.ocupacao = 0;
    }
    
    public int inserir_valor(double valor, int pos) {
        if ((pos >= this.tamanho) || (pos < 0)) {
            return -1;
        }
        else {
            this.vetor[pos] = valor;
            return 1;
        }
    }
    
    public double ler_valor(int pos) {
        return this.vetor[pos];
    }

    public void imprimir_valor(){
        for (int i = 0; i < this.ocupacao; i++) {
            System.out.printf("\nvalor[%d] = %f",i, this.vetor[i]);           
        }
    }
    
    public boolean teste_cheio() {
        if (this.ocupacao == this.tamanho) return true;
        else return false;
    }
    
    public boolean teste_vazio() {
        if (this.ocupacao == 0) return true;
        else return false;
    }
    
    
    public int retorna_tamanho() {
        return this.ocupacao;
    }  
    
   public int insere_fila(double valor) {
       if (teste_vazio()) {
           this.vetor[0] = valor;
           this.ocupacao++;
           return 1;
       }
       else if(teste_cheio()) {
        return 0;
       }
       else {
           this.vetor[this.ocupacao] = valor;
           this.ocupacao++;
           return 1;
       }
   } 
   
   
   public int remove_fila() {
       if (teste_vazio()) {
            return 0;
       }
       else {
           for (int i = 0; i < this.ocupacao-1; i++) {
               this.vetor[i] = this.vetor[i+1];
           } 
           this.ocupacao--;
           return 1;
       }  
   }
   
   
     public int insere_pilha(double valor) {
       if (teste_vazio()) {
           this.vetor[0] = valor;
           this.ocupacao++;
           return 1;
       }
       else if(teste_cheio()) {
        return 0;
       }
       else {
           this.vetor[this.ocupacao] = valor;
           this.ocupacao++;
           return 1;
       }
   } 
     
     public int remove_pilha(){
         if (teste_vazio()) {
             return 0;
         }
         else{
             this.ocupacao--;
             return 1;
         }       
     }
    
    
}
