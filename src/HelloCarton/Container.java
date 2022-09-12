/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloCarton;
import java.util.ArrayList;

/**
 *
 * @author pasca
 */
public class Container {
    //Nombre max de carton pour un container
    private int maxCarton;
    
    //Tableau référençant les cartons placés dans le container
    
    private ArrayList<Carton>listCarton;
    
    
    /*Constructeur
    
    */
    
    public Container(int maxCarton){
        this.maxCarton = maxCarton;
        listCarton = new ArrayList();
    }
    
    /*Retourne le nombre de carton
    
    */
    
    public int getNombreCarton(){
        return listCarton.size();
    }
    
    
    public Carton getCarton(int indice){
        return listCarton.get(indice);
        
    }
    
    public boolean isPlein(){
        if(listCarton.size()>= maxCarton){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public Carton rechercherCarton(String codeBarre){
        for (Carton c : listCarton){
            if(codeBarre.equals(c.getCodeBarre())){
                return c;
            }            
        }
       return null; 
    }
    
    
    
    
    public boolean ajouterUnCarton(String codeBarre, int nombreArticle){
        if(rechercherCarton(codeBarre) != null | isPlein()){
            return false;
        }else{
            Carton carton = new Carton(codeBarre,nombreArticle);
            listCarton.add(carton);
            return true;
        }
    }
}
