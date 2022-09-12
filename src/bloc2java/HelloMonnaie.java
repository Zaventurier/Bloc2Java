/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc2java;

import plum.console.Clavier;


/**
 *
 * @author pasca
 */
public class HelloMonnaie {
    public static void main(String args[])
 {
   int val = Clavier.lireInt("Valeur de la pièce ? ");
 
   Monnaie m = new Monnaie();
 
   boolean t = m.setVal(val);
 
   if ( !t ) {
     System.out.println("pièce non reconnue");
   }
 
 
   System.out.println("Valeur mémorisée dans m = " + m.getVal());
 
   System.out.print("Nom et adresse de l'objet m = " + m);
 }	
}
    
