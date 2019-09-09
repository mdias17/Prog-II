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
        this.apelido = apelido;
        this.hp = 100;
        this.xp = 1;
        this.level = 1;
        this.acuracia = 10;
        this.forca = 5;
        this.defesa = 3;
        this.agilidade = 5;
        this.magia = 20;
        this.mana = 150;
        
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
        p.hp-=this.magia;
    }
    
}
