/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleAgenda;

/**
 *
 * @author pasca
 */
    public class RendezVous{
  /*
   * champs de la classe
   */
   private String nom;
   private int heure;
 
    /**
   * Constructeur. Initialise les champs de la classe
   *
   */
   public RendezVous( String nom, int heure ){
     this.nom = nom;
     this.heure = heure;
   }
 
   public String getNom(){
     return nom;
   }
 
   public int getHeure(){
     return heure;
   }
 
}

