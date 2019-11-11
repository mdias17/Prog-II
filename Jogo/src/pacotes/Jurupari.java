/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotes;
import pacotes.minions;
/**
 *
 * @author Dias
 */
public class Jurupari extends Personagem {

   

        public Jurupari(String apelido) {
            super(apelido);
            this.hp = 500;
            this.xp = 1;
            this.level = 25;
            this.forca = 50;
            this.acuracia = 30;
            this.defesa = 30;
            this.inteligencia = 23;
            this.agilidade = 24;
            this.mana = 600;
            this.magia = 28;
        }
        
       
        @Override
        public void treinar(){
        }
        
     @Override
     public void  ataque(Personagem p){
         p.hp-=this.forca + this.magia;
     }
     
     @Override
    public void ataque(minions m) {
        m.hp-=this.forca - m.defesa;
        
    }
     
     
    }
