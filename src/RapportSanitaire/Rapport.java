/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RapportSanitaire;

/**
 *
 * @author pasca
 */
class Rapport {
    
    public Rapport(String nomControleur, String nomFichier){
        this.nomControleur = nomControleur;
        this.nomFichier = nomFichier;
    }
public String getNomControleur(){
    return nomControleur;
}
    
}
