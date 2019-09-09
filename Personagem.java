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
public abstract class Personagem {

    String apelido;
    int hp;
    int forca;
    int xp;
    int level;
    int inteligencia;
    int acuracia;
    int magia;
    int defesa;
    int agilidade;
    int mana;
    
    public Personagem(String apelido){
        this.apelido = apelido;
        this.hp = 100; //Pode se definir tirando os argumentos acima
        this.forca = 20;
        this.xp = 1;
        this.level = 1;
        
    }    
    
    public Personagem(){
        this("Sem nome");
    }
    
    public abstract void treinar();
    public abstract void ataque(Personagem p);

    
    public void hello(){
        System.out.println("Eu sou " + this.apelido);
        System.out.println("Tenho "+this.hp+" pontos de HP");
        System.out.println("Com "+this.forca+" de força.");
        System.out.println("E level "+this.level+"("+this.xp+"-XP"+")");
        System.out.println("-------------------------\n");
    }
}   
    
    
