/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monument;

import plum.exception.DadaException;

/**
 *
 * @author pasca
 */
public class Monument {

    /**
     * @Constante Jours de la semaine
     */
    public static final String JOURS_DE_SEMAINE[]
            = {"Lundi", "Mardi", "Mercredi", "Jeudi",
                "Vendredi", "Samedi", "Dimanche"};

    private String nom; // Nom du monument
    private String id;       // Identifiant du monument

    // Indice correspondant à une valeur de JOURS_DE_SEMAINE
    private int jourDeFermeture;

    /**
     * Constructeur. Mémorise l'id, le nom d'un monument -- et son jour de
     * fermeture
     *
     * @param id Identifiant du monument
     * @param nom Nom du monument
     * @param jourDeFermeture jour de fermeture du monument
     *
     * DadaException.fatal si jourDeFermeture n'est pas un jour de semaine
     * valide - pour vérifier cela on utilise la méthode
     * getIndiceJourDeSemaine()
     */
    public Monument(String id, String nom, String jourDeFermeture) {
        this.id=id;
        this.nom = nom;
        if (getIndiceJourDeSemaine(jourDeFermeture) == -1) {
            DadaException.fatal("Erreur : Le jour de semaine n'existe pas !");
        } else {
            this.jourDeFermeture = getIndiceJourDeSemaine(jourDeFermeture);
        }
    }

    /**
     * Retourne l'indice du jour dans JOURS_DE_SEMAINE
     *
     * @param jour Jour de semaine
     *
     * @return Retourne l'indice du jour dans joursDeSemaine ; -- sinon retourne
     * -1 si jour n'existe pas dans joursDeSemaine
     */
    public int getIndiceJourDeSemaine(String jour) {
        for (int i = 0; i < JOURS_DE_SEMAINE.length; i++) {
            if (jour.equals(JOURS_DE_SEMAINE[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Modifie le jour de fermeture d'un monument
     *
     * @param newJourDeFermeture Nouveau jour de fermeture
     *
     * DadaException.fatal si newJourDeFermeture n'est pas -- un jour de semaine
     * valide
     */
    public void modifJourDeFermeture(String newJourDeFermeture) {
        int i = getIndiceJourDeSemaine(newJourDeFermeture);
        jourDeFermeture = i;
    }

    /**
     * Accesseur sur nom
     *
     *
     * @return le nom du monument
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Accesseur sur id
     *
     *
     * @return l'id du monument
     */
    public String getId() {
        return this.id;
    }

    /**
     * Accesseur sur jour de fermeture
     *
     * @return Retourne le jour de fermeture du monument
     */
    public String getJourDeFermeture() {
        return JOURS_DE_SEMAINE[jourDeFermeture];
    }

    /**
     * Vérifie si jour j est un jour d'ouverture
     *
     * @param j Jour
     *
     * @return true si j est un jour d'ouverture, sinon false
     */
    public boolean estUnJourDouverture(String j) {
        int i = getIndiceJourDeSemaine(j);

        return i != jourDeFermeture;

    }

    /**
     * Vérifie si jour j est un jour de fermeture
     *
     * @param j Jour de la semaine
     *
     * @return true si j est un jour de fermeture, sinon false
     */
    public boolean estUnJourDeFermeture(String j) {
        int i = getIndiceJourDeSemaine(j);

        return i == jourDeFermeture;
    }

    /**
     * Retourne la liste des jours d'ouverture
     *
     *
     * @return Retourne la liste des jours d'ouverture.
     */
    public String[] getJoursDouverture() {
        return null;
    }

}
