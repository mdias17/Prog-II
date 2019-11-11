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

    private String apelido;
    protected int hp;
    protected int forca;
    protected int xp;
    protected int level;
    protected int inteligencia;
    protected int acuracia;
    protected int magia;
    protected int defesa;
    protected int agilidade;
    protected int mana;

    public Personagem(String apelido) {
        this.apelido = apelido;
        this.xp = 1;
        this.level = 1;

    }

    public Personagem() {
        this("Sem nome");
    }

    public abstract void treinar();

    public abstract void ataque(Personagem p);
    public abstract void ataque(minions m);
    
    public void dados() {
        System.out.println("-----DADOS------\n" + this.apelido );
        System.out.println("Nick: " + this.apelido);
        System.out.println("HP: " + this.hp + "| MP: " + this.mana);
        System.out.println("ATK: " + this.forca + "| DEF: " + this.defesa);
        System.out.println("MAG: " + this.magia + "| INT: " + this.inteligencia);
        System.out.println("AGI: " + this.agilidade + "| ACU: " + this.acuracia);
        System.out.println("Level " + this.level + "(" + this.xp + "-XP" + ")");
        System.out.println("-------------------------\n");
    }

    public String getApelido() {
        return apelido;
    }

    public int getHp() {
        return hp;
    }

    public int getForca() {
        return forca;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getAcuracia() {
        return acuracia;
    }

    public int getMagia() {
        return magia;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public int getMana() {
        return mana;
    }
    
    
    
    
}
