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
public class Main {
    
    public static void main(String[] args) {

        PilhaDim n = new PilhaDim();
        
        n.push(15);
        n.push(22);
        n.push(50);
        
        System.out.println(n.pop());
        System.out.println(n.pop());
        System.out.println(n.pop());

        


    }
    
}
