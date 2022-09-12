/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloCarton;

/**
 *
 * @author pasca
 */
public class Carton {
    private String codeBarre; //Code Barre du carton
    private int nombreArticle; //bombre d'article dans un carton
    
    // Constructeur
    /*Initialisation des champs privées*/
    
    public Carton(String codeBarre, int nombreArticle){
        this.codeBarre=codeBarre;
        this.nombreArticle=nombreArticle;
    }
    
    /*Retourne le code barre
    
    */
    public String getCodeBarre(){
        return codeBarre;
    }
    
    /*Retourne le nombre d'article
    
    */
    
    public int getNombreArticle(){
        return nombreArticle;
    }
}
