/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author 314702912
 */
public class Main {
     
    public static void main(String[] args) {
           
        double [] notas_j = {10, 5, 8, 1, 2};
        String [] dp_j = {"Estrutura de Dados","Matematica Discreta", "Banco de Dados","Sociologia","Literatura"};
        
        Aluno joao = new Aluno ("Joao", 25, notas_j, dp_j);
               
        //vetor de objetos do tipo Aluno (trio);
        
        Aluno [] trio = new Aluno [3];
        
        trio[0] = joao;
        
 
        double [] notas_m = {2, 8, 5, 10, 9};
        String [] dp_m = {"Estrutura de Dados","Matematica Discreta", "Banco de Dados","Sociologia","Literatura"};
        
        Aluno maria = new Aluno ("Maria", 19, notas_m, dp_m);
        trio[1] = maria;
        
        double [] notas_f = {6, 10, 5, 8, 7};
        String [] dp_f = {"Estrutura de Dados","Matematica Discreta", "Banco de Dados","Sociologia","Literatura"};
        
        Aluno fabio = new Aluno ("Fabio", 23, notas_f, dp_f);
        fabio.atual.facul = "ADS Mooca"; //sobreescrevendo
        
        trio[2] = fabio;
        
        for(int i=0; i<trio.length; i++){
            System.out.println("NOTAS da "+trio[i].atual.facul+" "+trio[i].atual.univ);
            trio[i].apresentacao();
            trio[i].exibe_nota();
            System.out.println("------------------------------------------");
        }
        
        
        
        
     }
}
