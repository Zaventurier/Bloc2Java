/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrepot;

/**
 *
 * @author pasca
 */
public class Produit {
    private int id;
    private String nom;
    private double prix;
    private int qteStock;
 
    public Produit ( int idProduit, 
                   String nomProduit, 
                   double prixProduit, 
                   int qteStockProduit ) {
        id = idProduit;
        nom = nomProduit;
        prix = prixProduit;
        qteStock = qteStockProduit;
    }
    public int getIdentifiant(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public double getprix(){
        return prix;
    }
    public int getStock(){
        return qteStock;
    }
    public void setNom(String nouveauNom){
        nom = nouveauNom;
    }
    public void setPrix(double nouveauPrix){
        prix = nouveauPrix;
    }
    public void stocker(int quantitéLivrée){
        qteStock = qteStock + quantitéLivrée;
    }
    public int destocker(int quantitéDestockée){
        if(quantitéDestockée > qteStock){
            int qte = qteStock;
            qteStock = 0;
            return qte;
            
        }
        qteStock = qteStock-quantitéDestockée;
        return quantitéDestockée;
    }
    
}
