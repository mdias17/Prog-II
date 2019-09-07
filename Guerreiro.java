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
        p.hp-=this.forca;
    }
    
}
