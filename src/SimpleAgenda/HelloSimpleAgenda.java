package SimpleAgenda;
import plum.console.Clavier;

public class HelloSimpleAgenda {

    public static void main(String[] args) {
        SimpleAgenda rv = new SimpleAgenda();
        int menu;
        String nom;
        int heure;
        int indice;
        boolean valide;

        do {
            System.out.println("1 : Ajouter un rendez-vous");
            System.out.println("2 : Afficher heure RV d'une personne");
            System.out.println("3 : Liste des rendez-vous pour une heure donnée");
            System.out.println("4 : Tous les RV (nom et heure)");
            System.out.println("5 : Nombre de RV pour chaque heure");
            System.out.println("6 : Retourner le nombre de RDV pour une plage horaire donnée");
            System.out.println("0 : quitter");
            menu = Clavier.lireInt("Choisissez : ");
            switch (menu) {
                case 1:
                    nom = Clavier.lireTexte("Entrez votre nom de famille : ");
                    heure = Clavier.lireInt("Entrez votre heure de rendez-vous : ");
                    valide = rv.ajouteUnRendezVous(nom, heure);
                    if (!valide) {
                        System.out.println("Soit vous avez déjà un rendez-vous, soit votre heure est non valide !");
                        System.out.println("Les horaires d'ouvertures sont de 8h à 20h");
                    } else {
                        System.out.println("Rendez-vous validé !");
                    }
                    break;
                case 2:
                    nom = Clavier.lireTexte("Entrez le nom de famille : ");
                    indice = rv.recherche(nom);
                    if (indice != -1) {
                        System.out.println("M(me). " + nom + " a rendez-vous à " + rv.getHeure(indice) + "h");
                    } else {
                        System.out.println("M(me." + nom + "n'a pas de rendez-vous !");
                    }
                    break;
                case 3:
                    boolean rdvTrouve = false;
                    heure = Clavier.lireInt("Entrez l'heure à regarder : ");
                    for (int i = 0; i < rv.count(); i++) {
                        if (rv.getHeure(i) == heure) {
                            System.out.println("Rendez vous n°" + (i + 1) + " : "
                                    + rv.getNom(i) + ".");
                            rdvTrouve = true;
                        }

                    }
                    if (!rdvTrouve) {
                        System.out.println("Aucun rendez vous pour cette heure !");
                    }
                    break;
                case 4:
                    for (int i = 0; i < rv.count(); i++) {
                        System.out.println("Rendez vous n°" + (i + 1) + " : "
                                + rv.getNom(i) + " à " + rv.getHeure(i) + "h.");
                    }
                    break;
                case 5:
                    //solution 1
                    int compteur = 0;
                    for (int i = 8; i <= 20; i++) {
                        for (int y = 0; y < rv.count(); y++) {
                            if (rv.getHeure(y) == i) {
                                compteur++;
                            }
                        }
                        System.out.println(compteur + " rdv à " + i + "h.");

                    }

                    //solution 2
                    int[] c = new int[13];
                    for (int y = 0; y < rv.count(); y++) {

                        int h = rv.getHeure(y);
                        h = h - 8;
                        c[h]++;
                    }
                    for(int i=0;i<c.length;i++){
                       System.out.println(c[i] + " rdv à " + (i+8) + "h."); 
                    }

                    break;
                case 6:
                    int hd = Clavier.lireInt("Heure début ?");
                    int hf = Clavier.lireInt("Heure Fin ?");
                    SimpleAgenda sa;
                    sa = rv.getSimpleAgenda(hd, hf);
                    for (int i=0 ;i<sa.count();i++){
                        System.out.println(sa.getNom(i) + ": " + sa.getHeure(i));
                    }

                default:
                    System.out.println("Veuillez entrer un nombre entre 0 et 6 !");
            }

        } while (menu != 0);
    }

}
