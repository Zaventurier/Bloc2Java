package HelloIncident;
import java.util.ArrayList;
import plum.console.Clavier;

class HelloIncident {
 
  public static void main(String[] args){
 
    ArrayList <Incident> incidents = new ArrayList();
    
    String nom;
 
    int menu;
    do {
 
      System.out.println("1- Ajouter un nouvel incident");
      System.out.println("2- Liste des incidents");
      System.out.println("3- Supprimer un incident"); 
      System.out.println("4- Afficher le type d'incident le plus courant");
      System.out.println("5- Afficher les 3 derniers incidents");
      System.out.println("0- quitter");
 
      menu = Clavier.lireInt("Choisir?");
      switch (menu){
          case 1:
              //Saisir le nom d'un technicien et l'ajouter dans technicien
              nom = Clavier.lireTexte("Saisir nom du Technicien :");
              Incident inc = new Incident(nom);
              incidents.add(inc);
              break;
          case 2:
              for(int i = 0;i<incidents.size();i++){
                  Incident in = incidents.get(i);
                  System.out.println(in.getType() + " :" + in.getCompteur());
              }
              break;
          case 3:
              String sin = Clavier.lireTexte("Saisir incident :");
              for (int i=0;i<incidents.size();i++){
                  Incident U = incidents.get(i);
                  if(U.getType().equals(sin)){
                      incidents.remove(i);
                  }else{
                      System.out.println("L'incident est inexistant !");
                  }
              }
              break;
          case 4:
              if (incidents.size() == 0){
                  break;
              }
              int imax=0;
              for (int i =0;i<incidents.size();i++){
                  Incident in = incidents.get(i);
                  if (in.getCompteur() > incidents.get(imax).getCompteur()){
                      imax = i;
                  }
              }
              System.out.println(incidents.get(imax).getType() + " : " + incidents.get(imax).getCompteur());
              break;
          case 5:
              if (incidents.size() == 0){
              break;
              }
              int imax2[] = new int[3];
              imax2[0] = 0;
              imax2[1] = 0;
              imax2[2] = 0;
              
              for (int i =0;i<incidents.size();i++){
                  Incident in = incidents.get(i);
                  for (int j = 0; j< imax2.length;j++){
                      Incident imaxj = incidents.get(imax2[j]);
                      if (in.getCompteur()> imaxj.getCompteur()){
                          imax2[j] = i;
                          break;
                      }
                  }
              }
              break;
      }
    } while ( menu != 0 );
  }
 
  /*
  * Recherche un type d'incident dans incidents 
  *
  * @param incidents Collection d'incident
  * @param type type d'incident 
  * 
  * @return l'indice de type dans la collection ; -1 si non trouvé
  */
 
  static int rechercher ( ArrayList<Incident> incidents , String type ) {
      for(int i =0; i< incidents.size();i++){
          if (incidents.get(i).getType().equals(type)){
              return i;
          }    
      }
      return -1; 
}
}