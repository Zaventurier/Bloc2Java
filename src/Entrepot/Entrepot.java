/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrepot;

import Entrepot.Produit;


/**
 *
 * @author pasca
 */
public class Entrepot {

   private String nomEntrepot;
 
   private Produit[] lesProduits;
 
  // Nombre de produits différents actuellement stockés
  private int cardinal; 
 
 
  public Entrepot( String nomEntrepot){
      this.nomEntrepot = nomEntrepot;
      cardinal = 0;
      lesProduits = new Produit[100];
  }
 
  /**
  * Retourne le nom de l'entrepôt
  * 
  * @return
  *    Retourne le nom de l'entrepôt
  *
  */
  public String getNomEntrepot(){
      return nomEntrepot;
  }
 
  /**
  * Retourne le nombre de produits mémorisés
  * 
  *
  * @return
  *    Retourne le nombre de produits mémorisés
  *
  */
 
  public int getCardinal () {
      return cardinal;
  } 
   public void setNomEntrepot ( String nouveauNomEntrepot ) {
       nomEntrepot = nouveauNomEntrepot;
   }
   
    public boolean ajouterUnProduit ( Produit unProduit ){
        if ( cardinal==100){
            return false;
        }
         if (getNombreUnitésStockées ()>10000){
             return false;
         }
        
        lesProduits[cardinal] = unProduit;
        cardinal++;
        return true;
    }
 
  /**
   * Retourne le produit correspondant à identifiant
   * 
   * @param identifiant Identifiant du produit recherché
   *
   * @return 
   * Retourne le produit correspondant à identifiant.
   * Si le produit n'est pas trouvé retourne null.
   * 
   */
  public Produit getProduit ( int identifiant ){ 
      int i = 0;
      boolean t=false;
      while (!t){
          if (lesProduits[i].getIdentifiant()==identifiant){
              t=true;
          }else{
              i++;
          }
      }
      
      if (t){
          return lesProduits[i];
      }else{
          return null;
      }
  }
 
  /**
   * Retourne le nombre d'nités stockées
   * 
   *
   * @return
   *    Retourne le nombre d'unités stockées
   *    -- pour cela on cumule les quantités en stock de chaque produit
   *
   */
  public int getNombreUnitésStockées (){
      int total=0;
      for(int i=0; i<cardinal;i++){
          total = total + lesProduits[i].getStock();
      }
      
      return total;
  }
   public Entrepot listeProduit ( int stockMinimum ){
       Entrepot ent = new Entrepot("stock mini");
       
       for(int i=0; i<cardinal;i++){
          if(lesProduits[i].getStock()<stockMinimum){
              ent.ajouterUnProduit(lesProduits[i]);
          }
      }
       
       return ent;
   }

    boolean getNombreUnitesStockees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
