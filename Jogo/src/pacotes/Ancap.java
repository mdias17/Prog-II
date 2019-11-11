/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;
import pacotes.Personagem;
/**
 *
 * @author mpirixan
 */
public class Ancap extends minions{
    public Ancap(String apelido){
        super(apelido);
        this.apelido = apelido;
        this.hp = 120;
        this.level = 1;
        this.forca = 10;
        this.acuracia = 30;
        this.defesa = 10;
        this.inteligencia = 15;
        this.agilidade = 20;
        this.mana = 10;
        this.magia = 10;
        
    }
    @Override
    public void ataque(Personagem p){
     p.hp-=this.forca; 
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
    public void ataque(minions m) {
        m.hp-=this.forca - m.defesa;
        
    }
    
}
