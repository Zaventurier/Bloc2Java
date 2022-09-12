/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc2java;

/**
 *
 * @author pasca
 */
public class Monnaie {
    private int valM; //en centime
 
   public Monnaie() {
     valM = 0;
   }
 
   public boolean setVal(int val){
 
     if ( !isPieceOk(val) ) return false;
 
     valM  = val;
 
     return true;
   }
 
   public int getVal(){
     return valM;
   }
 
   public boolean isPieceOk(int valM){
 
      int tp[]={1,2,5,10,20,50,100,200};
 
      boolean t = false;
      for(int i = 0; i < tp.length ; i++){
        if(valM == tp[i]) {
           t = true;
           break;
        }
      }
 
      return t;
   }
}
    
