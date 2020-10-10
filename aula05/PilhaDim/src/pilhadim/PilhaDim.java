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
public class PilhaDim {

    No topo;

    public void push(int x){
        
        No novo = new No(x); //(i)
        
        novo.setProx(this.topo); // novoNo.setProxNo (this.topo) (ii)
        
        this.topo = novo; //(iii)

    }

    public int pop(){
        No aux  = this.topo; // retorna pra exibir
        
        topo = topo.getProx(); //so avança
        
        return aux.valor;
        
    }
    
    
}
