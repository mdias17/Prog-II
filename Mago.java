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
public class Mago extends Personagem{

    public Mago(String apelido) {
        super(apelido);
    }
    
    

    @Override
    public void treinar() {
        inteligencia+=5;
        forca++;
    }

    /**
     *
     * @param p
     */
    @Override
    public void ataque(Personagem p) {
        p.hp-=this.inteligencia;
    }
    
}
