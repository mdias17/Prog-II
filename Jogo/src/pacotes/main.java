/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pacotes;

import interfacegrafica.JanelaPrincipal;
import static java.awt.SystemColor.menu;
import pacotes.luta;
import pacotes.Menu;
import javax.swing.JButton;
/**
 *
 * @author Dias
 */
public class main {
    public static void main(String[] args){
        Personagem p1 ;
           p1 = new Baltazar("Merlin");
           p1.treinar();
           p1.treinar();
           p1.dados();
        
         //new Menu().setVisible(true);  
         JanelaPrincipal jp = new JanelaPrincipal(p1);
         jp.setVisible(true);
      
      
    }
}