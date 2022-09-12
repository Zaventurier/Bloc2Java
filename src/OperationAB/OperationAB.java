package OperationAB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import plum.console.Clavier;
import plum.exception.*;
/**
 *
 * @author jules
 */
public class OperationAB {

    private int a;
    private int b;

    /**
     * Constructeur. Initialise les champs a et b à zéro
     *
     */
    public OperationAB() {
        a = 0;
        b = 0;
    }

    /**
     * Modificateur. Modifie la valeur du champ a
     *
     * @param valA Valeur à mémoriser
     */
    public void setA(int valA) {
       a= valA ;
    }

    /**
     * Modificateur. Modifie la valeur du champ b
     *
     * @param valB Valeur à mémoriser
     */
    public void setB(int valB) {
        b=valB;
    }

    /**
     * Accesseur. Lit la valeur de a
     *
     * @return Retourne la valeur du champ a
     */
    public int getA() {
        return a;
    }

    /**
     * Accesseur. Lit la valeur de b
     *
     * @return Retourne la valeur du champ b
     */
    public int getB() {
        return b;
    }

    /**
     * Effectue un calcul entre a et b.
     *
     * @param op Opérateurs possibles : +,-,*,/
     *
     * @return Retourne le résultat de l'opération demandé
     */
    public long calculer(char op) {
        
      int resultat = 0;
        
      if (op==('+')){
          resultat = a+b;
                 
      }
      if (op==('-')){
          resultat = a-b;
                  
      }
      if (op==('*')){
          resultat = a*b;
                  
      }
      if (op==('/')){
          resultat = a/b;
                
      }
	  
	  if (op!='+' & op!='-' & op:='*' & op!='/'){
		  Dada.exception ("opérateur erroné : " + op);
	  }
	  
      return resultat;
      
    }

    /**
     * Compare a et b.
     *
     * Exemple : si comp vaut '>' : retourne true si a > b ; sinon false
     *
     * @param comp Comparateurs possibles : >,<,=
     *
     * @return Retourne true ou false
     */
    public boolean comparer(char comp) {
        
       
        if(comp=='>'){
            
            if ( a  > b ){       
				return true;
			}else{
				return false;
			}
		}	
		
	if(comp=='<'){
			return a < b;
        }
		
		if(comp=='='){ 
		 return a == b;
        }
        
         return false;
         
    }

    /**
     * Echange les valeurs de a et b
     *
     */
    public void echanger() {
        
        
        int temp;
        
        temp =a;
        a=b;
        b=temp;
    }
    
    public void testException(){
        //DataException.fatal("Erreur");
    }
    
 
}
