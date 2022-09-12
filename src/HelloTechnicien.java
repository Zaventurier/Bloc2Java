
import java.util.ArrayList;
import plum.console.Clavier;

public class HelloTechnicien {

    public static void main(String args[]) {

        ArrayList<String> technicien = new ArrayList<String>();

        char rep;
        String nom;

        do {
            System.out.println("a- ajouter un technicien");
            System.out.println("b- afficher liste des techniciens");
            System.out.println("c- rechercher un technicien");
            System.out.println("d- rechercher un technicien par une lettre");
            System.out.println("q- quitter");

            rep = Clavier.lireChar("Votre Choix ?");

            switch (rep) {
                case 'a':
                    //Saisir le nom d'un technicien et l'ajouter dans technicien
                    nom = Clavier.lireTexte("Saisir nom du Technicien :");
                    technicien.add(nom);
                    break;

                case 'b':
                    //afficher la liste des techniciens
                    for (int i = 0; i < technicien.size(); i++) {
                        String nomTec = technicien.get(i);
                        System.out.println(nomTec);
                    }

                    break;

                case 'c':
                    String rech = Clavier.lireTexte("Nom du technicien :");
                    int i = rechercher(technicien, rech);

                    if (i != -1) {
                        System.out.println("Ce technicien est à l'indice" + i);
                    } else {
                        System.out.println("pas trouvé!!");
                    }

                    break;
                case 'd':
                    char lettre = Clavier.lireChar("Saisir un caractère :");
                    ArrayList<String> listecp = listeCommencePar(technicien, lettre);

                    for (String nomcp : listecp) {
                        System.out.println(nomcp);
                    }
                    if (listecp.isEmpty()) {
                        System.out.println("Aucun nom ne commence par " + lettre);
                    }

                    break;

            }
        } while (rep != 'q');
    }

    //recherche nom dans technicien
    // - si trouvé : on retourne l'indice
    // - si non trouvé ; on retourne -1
    private static int rechercher(ArrayList<String> technicien, String rech) {
        for (int i = 0; i < technicien.size(); i++) {
            if (technicien.get(i).equals(rech)) {
                return i;
            }
        }
        return -1;

    }

    private static ArrayList<String> listeCommencePar(ArrayList<String> technicien, char lettre) {
        ArrayList<String> cp = new ArrayList<String>();
        for (int i = 0; i < technicien.size(); i++) {
            String nom = technicien.get(i);
            if (nom.charAt(0) == lettre) {
                cp.add(nom);
            }

        }
        return cp;
    }

}
