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
public class Thalia extends Personagem{
    
    public Thalia(String Thalia){
        super(Thalia);
        this.hp = 120;
        this.xp = 1;
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
  public void treinar(){
      acuracia+=5;
      agilidade+=3;
              
  }  

    /**
     *
     * @param p
     */
    @Override
public void ataque(Personagem p){
    p.hp-=this.forca;
}
@Override
    public void ataque(minions m) {
        m.hp-=this.forca - m.defesa;
        
    }

}

