/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloIncident;

/**
 *
 * @author pasca
 */
public class Incident {
  private String type; 
  private int nb = 0; // compteur d'incident
 
  // Constructeur
  public Incident( String type ) {}
 
  public String getType() {
      return type;
  }
 
  // retourne le nombre d'incident
  public int getCompteur () {
      return nb;
  }
 
  // Incrémente de 1 le nombre d'incident
  public void incrememter() {
      nb++;
  }
 
}

