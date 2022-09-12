package Monument;
import java.util.ArrayList;

class MonumentsDeParis{
 
   // collection des momuments de Paris
   private ArrayList<Monument> listeMonument;
 
   /*
   * Indice de parcours du tableau des Monuments
   *
   * Fonctionne UNIQUEMENT avec 
   * --- isNextLireOk(), allerAuDébutDeLListe() et lire()
   */
   private int positionLireCourant = -1; 
 
  /**
  * Constructeur. Charge les données de la classe
  *
  */
  public MonumentsDeParis(){
    listeMonument = ChargeurMonument.init();
  }
 
  /**
  * rechercher un monument avec son id
  * 
  * @param id Identifiant du monument
  *
  * @return Retourne le monument trouvé; sinon retourne null
  */
  public Monument recherchebyId( String id ){
    for (int i = 0; i< listeMonument.size();i++){
        if (id = listeMonument.get(i)){
            
        }
    }
  }
 
  /**
  * Retourne le premier monument ouvert le jour j  
  * 
  * @param j Nom du jour
  *
  * @return Retourne le monument ouvert, si aucun monument ouvert retourne null
  */
  public Monument premierOuvert( String j ){
    ;
  }
 
  /**
  * Retourne la liste des monuments fermés au jour j 
  * 
  * @param j Nom du jour
  *
  * @return Retourne la liste des monuments fermés le jour j
  */
  public Array<Monument> listeMonumentsFermés( String j ){
    ;
  }
 
  /**
  * Retourne les jours d'ouvertures commun entre 2 monuments
  * 
  * @param m1 Monument
  * @param m2 Monument
  *
  * @return Retourne les jours d'ouvertures communs entre m1 et m2
  *
  */
  public String[] listeDesJoursCommuns( Monument m1 , Monument m2 ){
   ;
 } 
 
  /**
  * Permet de se positionner au début de la liste
  *- des monuments avant de lire()
  * 
  *
  */
  public void allerAuDébutDeLaListe(){
    positionLireCourant = 0;
  }
 
  /**
  * Retourne true s'il y a au moins un document à lire.
  * -- autrement dit retourne true si le prochain lire() retourne un document 
  * --- plutôt que de provoquer une exception
  *
  */
  public boolean isNextLireOk(){
 
    if (positionLireCourant >= listeMonument.size()) return false;
 
    return true;
  }
 
  /**
  * Lit le document courant puis se positionne sur le suivant.
  * 
  * @Exception Exception si positionLireCourant est en dehors de la liste
  * @Attention la première utilisation de lire() nécessite l'usage de allerAuDébutDeLaListe()
  *
  * @return Retourne le document lu.
  */
  public Monument lire(){
 
    Monument m;
    m = listeMonument.get(positionLireCourant);
 
    positionLireCourant++;
 
    return m;
  }
 
}