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
        this.xp = 1;
        this.level = 1;
        
    }    
    
    public Personagem(){
        this("Sem nome");
    }
    
    public abstract void treinar();
    public abstract void ataque(Personagem p);

    
    public void hello(){
        System.out.println("-----DADOS------\n");
        System.out.println("Nick: " + this.apelido);
        System.out.println("HP: "+this.hp +"| MP: "+this.mana);
        System.out.println("ATK: "+this.forca +"| DEF: "+this.defesa);
        System.out.println("MAG: "+this.magia +"| INT: "+this.inteligencia);
        System.out.println("AGI: "+this.agilidade+"| ACU: "+this.acuracia);
        System.out.println("Level "+this.level+"("+this.xp+"-XP"+")");
        System.out.println("-------------------------\n");
    }
}   
    
    
