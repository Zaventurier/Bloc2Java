package OperationAB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import plum.console.Clavier;

/**
 *
 * @author jules
 */
public class HelloOperationAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        OperationAB operateur = new OperationAB();
        
		operateur.setA(10);
		operateur.setB(20);
		
		sout(operateur.getA());
		
        int r = operateur.calculer('*');
		System.out.println (r); //200
        
        
        boolean b = operateur.comparer('>');
		System.out.println (b);//false
		
		operateur.echange();
		sout(operateur.getA());//20
		sout (operateur.getB());//10
             
    }
    
}
