/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilhadim;

/**
 *
 * @author 314702912
 */
public class No {
    int valor;
    private No prox;
    
    
    public void setProx(No aux){
        this.prox = aux;
    }
    
    public No getProx(){
        return this.prox;
    }
    
    public No(int valor){ //construtor de no
        this.valor = valor;
        this.prox = null;
    }
    
    
    
    
}
