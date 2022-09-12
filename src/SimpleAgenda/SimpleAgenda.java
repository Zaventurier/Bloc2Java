/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleAgenda;

import SimpleAgenda.RendezVous;
/**
 *
 * @author pasca
 */
class SimpleAgenda{
 
   /*
   * champs de la classe
   */
   private RendezVous rv[];
 
 
   // Nombre de rendez-vous mémorisés
   private int vCount;
 
   /**
   * Constructeur. Initialise les champs a et b à zéro
   *
   */
   public SimpleAgenda(){
     vCount = 0;
 
     rv = new RendezVous[100];
   }
 
   /**
   * Ajoute un rendez-vous.
   * Condition 1 : Le nom ne doit pas déjà avoir été mémorisé
   * Condition 2 : L'heure doit être dans la bonne plage horaire
   *
   * @param nom   Nom de la personne ayant rendez-vous
   * @param heure Heure du rendez-vous
   * 
   * @return Retourne true si l'ajout a été fait; sinon false
   */
   public boolean ajouteUnRendezVous( String nom, int heure){
     if (recherche(nom) != -1 || !isOkPlageHoraire(heure)){
         return false;
     }
     rv[vCount] = new RendezVous(nom, heure);
     vCount++;
     return true;
   }
 
   /**
   * Indique si heure est dans la plage horaire prévue
   * Plage horaire des rendez-vous : 8h - 20h
   * 
   * @param heure Heure à vérifier
   *
   * @return Retourne true si heure est dans la plage horaire; sinon false 
   */
   public boolean isOkPlageHoraire(int heure){
     if(heure < 8 || heure > 20){
         return false;
     }
     return true;
   }
 
   /**
   * Recherche un nom et retourne l'index correspondant
   * 
   * @param nom Nom de la personne recherchée
   *
   * @return Retourne l'indice si trouvé ; sinon retourne -1 
   */
   public int recherche(String nom){
       for (int i = 0; i < vCount ; i++){
           if(rv[i].getNom().equals(nom)){
               return i;
           }
       }
       return -1;
   }
 
   /**
   * Retourne le nombre de rendez-vous
   * 
   * @return Retourne le nombre de rendez-vous
   */	
   public int count(){
     return vCount;
   }
 
   /**
   * Retourne le nom correspondant à la position spécifiée dans le tableau
   * 
   * @param indice Indice du nom à retourner
   *
   * @return Retourne le nom à la position spécifiée
   */
   public String getNom(int indice){
      return rv[indice].getNom();
   }
 
   /**
   * Retourne l'heure correspondant à la position spécifiée dans le tableau
   * 
   * @param indice Indice de l'heure à retourner
   *
   * @return Retourne l'heure à la position spécifiée
   */
   public int getHeure(int indice){
       return rv[indice].getHeure();
   }
   
   SimpleAgenda getSimpleAgenda(int hDebut, int hFin){
       SimpleAgenda si = new SimpleAgenda();
       for (int i = 0; i< vCount;i++){
           RendezVous unRv = rv[i];
           if (unRv.getHeure() >= hDebut & unRv.getHeure() <= hFin){
               si.ajouteUnRendezVous(unRv.getNom(), unRv.getHeure());
           }
       }
       return si;
   }
   public boolean ReservePlageHoraire (String Nom, int hDebut, int hFin){
       
       return true;
   }return false;
}
