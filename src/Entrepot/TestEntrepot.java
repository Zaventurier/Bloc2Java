/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrepot;
import plum.console.Clavier;
/**
 *
 * @author pasca
 */
public class TestEntrepot {
    public static void main(String[] args) {
        Entrepot e = new Entrepot("Valadon");
// Ajouter 4 produits différents
// Afficher la valeur du booléen retourné
Produit p = new Produit(0, "SSD 50Go", 131.99, 5);
        e.ajouterUnProduit(p);
        p = new Produit(1, "SSD 500Go", 131.99, 21);
        e.ajouterUnProduit(p);
        p = new Produit(2, "SSD 500Go", 131.99, 21000);
        e.ajouterUnProduit(p);
        p = new Produit(3, "SSD 5000Go", 131.99, 5);
        e.ajouterUnProduit(p);
        
// Ajouter 1 produit dépassant le nombre d'unité
// Afficher la valeur du booléen retourné 
System.out.println(e.getNomEntrepot());
        System.out.println(e.getCardinal());
        e.setNomEntrepot("Suzanne");
        System.out.println(e.getNomEntrepot());
        System.out.println(e.getProduit(2).getNom() + " " + e.getProduit(2).getStock());
        e.getProduit(3);
        System.out.println(e.getNombreUnitesStockees());
        
        Entrepot tropPetit = e.listeProduit(10);
        for (int i = 1; i <= tropPetit.getCardinal(); i++) {
            if (tropPetit.getProduit(i) != null) {
                System.out.println(tropPetit.getProduit(i).getNom() + " " + tropPetit.getProduit(i).getStock());
            }
        }

        if (e.getProduit(1) != null) {
            System.out.println(e.getProduit(1).getNom() + "" + e.getProduit(1).getStock());
        }
        if (e.getProduit(12) != null) {
            System.out.println(e.getProduit(12).getNom() + "" + e.getProduit(12).getStock());
        }
        
        
        
    }
}

     
 
 
 
 
     // Afficher un produit (nom et stock) d'après son identifiant
 
 
 
 
     // Rechercher un produit inexistant et afficher le message "le produit n'existe pas"
 
 
 
 
 
     // Afficher le nombre d'unités en stock
 
 
     // Afficher le nom  et la quantité de chaque produit
     // dont le stock est inférieur à 10
 
 

