/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerMel;

import plum.console.Clavier;

/**
 *
 * @author pasca
 */
public class HelloServeurMel {

    public static void main(String[] args) {
        ServerMel sm = new ServerMel();
        int menu;
        String from;
        String to;
        String message;
        boolean ajout;

        do {
            System.out.println("1 : Ajouter un mèl");
            System.out.println("2 : Afficher un mèl");
            System.out.println("3 : Afficher tout les messages");
            menu = Clavier.lireInt("Choisissez : ");
            switch (menu) {
                case 1:
                    from = Clavier.lireTexte("Saisir l'expéditeur :");
                    to = Clavier.lireTexte("Saisir le destinataire :");
                    message = Clavier.lireTexte("Saisir le message :");
                    sm.addNewMél(from, to, message);
                    break;
                case 2:
                    Mel m = sm.getNextMél();
                    if (m !=null){
                        m.print();
                    }else{
                        System.out.println("Aucun mail !");
                    }
                    //sm.getNextMél().print();

                    break;
                case 3:
                    Mel m2 = sm.getNextMél();
                    if(m2 == null){
                        System.out.println("Aucun message");
                        break;
                    }
                    while(m2 != null);
                    m2.print();
                    m2 = sm.getNextMél();
                    /*while(sm.getNextMél() != null){
                        sm.getNextMél().print();
                    }*/
                    break;
            }

        } while (menu != 0);
    }
}
