/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;

/**
 *
 * @author mpirixan
 */
public abstract class Player extends Personagem {
    String apelido;
    
    
    
    public Player(String apelido){
        this.apelido = apelido;
    } 
    
    public abstract void dinheiro();
    
    
}
