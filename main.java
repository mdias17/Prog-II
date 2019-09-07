/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;

/**
 *
 * @author Dias
 */
public class main {
    public static void main(String[] args){
        
        Personagem p1;
         p1 = new Mago("Dias");
         p1.treinar();
         p1.treinar();
         p1.hello();
    
        Personagem p2;
         p2 = new Guerreiro("Loko");
         p2.hello();
         p2.treinar();
       
        Personagem p3;
         p3 = new Ranger("Robin");
         p3.hello();
         p3.treinar();
    }
}