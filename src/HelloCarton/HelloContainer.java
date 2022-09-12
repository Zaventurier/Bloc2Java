/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloCarton;
import java.util.ArrayList;
import plum.console.Clavier;

/**
 *
 * @author pasca
 */
public class HelloContainer {
    public static void main(String[] args){
        Container c = new Container(2000);
        
        int menu;
        
        do{
            System.out.println("1- Ajouter un carton");
            System.out.println("2- Liste des cartons");
            
            menu = Clavier.lireInt("Choisir ?");
            
            switch (menu){
                case 1:
                    String codeBarre = Clavier.lireTexte("Saisir code barre :");
                    int nombreArticle = Clavier.lireInt("Saisir nombre article :");
                    if(c.ajouterUnCarton(codeBarre, nombreArticle) == false){
                        System.out.println("Carton non ajouté");
                    }else{
                        c.ajouterUnCarton(codeBarre, nombreArticle);
                        System.out.println("Carton ajouté");
                    }
                    break;
                case 2:
                    for (int i = 0; i < c.getNombreCarton();i++){
                        System.out.println("Carton n°" + c.getCarton(i).getCodeBarre()
                        + " : " + c.getCarton(i).getNombreArticle() + " article(s)");
                    }
                    break;
                
            }
        }while(menu!=0);
    }
    
    
}
