/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Monument;
import plum.exception.DadaException;
import plum.console.Clavier;
import java.util.ArrayList;


/**
 *
 * @author pasca
 */
public class TestMonument {
    public static void main(String[] args){
    Monument m = null;
 
    int menu;
    do{
 
     System.out.println("1- Instancier un monument");
     System.out.println("2- Tester getIndiceJourDeSemaine");
     System.out.println("3- Tester modifJourDeFermeture");
     System.out.println("4- Tester getNom et getID");
     System.out.println("5- Tester estUnJourDeFermeture");
     System.out.println("6- Tester getJourDeFermeture");
     System.out.println("7- Tester getJourDouverture");
     System.out.println("8- Afficher le contenu de joursDeSemaine ");
     System.out.println("0- quitter");
 
     menu=Clavier.lireInt("Choisir?");
     switch (menu){
         case 1:
             m = new Monument("1", "Louvre", "Mardi");
             break;
         case 2:
             System.out.println(m.getIndiceJourDeSemaine("Mercredi"));
             break;
         case 3:
             m.modifJourDeFermeture("Jeudi");
             break;
         case 4:
             System.out.println(m.getNom());
             System.out.println(m.getId());
             break;
         case 5:
             
             System.out.println(m.estUnJourDeFermeture("Lundi"));
             break;
         case 6:
             System.out.println(m.getJourDeFermeture());
             break;
         case 7:
             System.out.println(m.getJoursDouverture());
             break;
         case 8:
             for (int i =0; i<m.JOURS_DE_SEMAINE.length;i++){
                 System.out.println(m.JOURS_DE_SEMAINE[i]);
             }
             break;
      
 
     }
    }while(menu != 0);
  }

    
}
