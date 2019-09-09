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
public class Guerreiro extends Personagem{

    public Guerreiro(String apelido) {
        super(apelido);
        this.hp = 150; //Pode se definir tirando os argumentos acima
        this.forca = 20;
        this.xp = 1;
        this.level = 1;
        this.inteligencia = 10;
        this.defesa = 15;
        this.acuracia = 10;
        this.agilidade = 10;
        this.magia = 5;
        this.mana = 20;
        
        
        
        
    }
    
  
    
    
    @Override
    public void treinar() {
        forca+=5;
        inteligencia++;
    }

    /**
     *
     * @param p
     */
    @Override
    public void ataque(Personagem p) {
        p.hp-=this.forca - p.defesa;
        
    }
   
    
}
