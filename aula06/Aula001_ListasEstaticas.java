/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula001_listasestaticas;

import java.util.Locale;

/**
 *
 * @author BrunoMulina
 */
public class Aula001_ListasEstaticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("teste de lista estatica...");
        
        ListasEstaticas ls = new ListasEstaticas(10);
        
        //if (ls.inserir_valor(-12, 5) == 1) { System.out.println("Inserção ok"); }
        //else {System.out.println("Erro na inserção"); }
            
        //ls.imprimir_valor();
        
        //double dadolido = ls.ler_valor(0);       
        //System.out.printf("\no valor da posição 0 do vetor é: %f",dadolido);
        
        
        
        ls.insere_pilha(5);
        ls.insere_pilha(71);
        ls.insere_pilha(999);
        ls.imprimir_valor();
        
        ls.remove_pilha();
        ls.imprimir_valor();
        
    }
    
}
