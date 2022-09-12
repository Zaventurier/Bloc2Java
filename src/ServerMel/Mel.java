/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServerMel;

/**
 *
 * @author pasca
 */
public class Mel {
        private String from;
	private String to;
	private String message;
 
	/*
	* Constructeur de la classe
	* Mémorise les valeurs des paramètres dans les champs de Mél
        *
        * @param from    Origine du message
        * @param to      Destinataire du message
        * @param message Le messages
	*/
	public Mel(String from, String to, String message){
	   this.from = from;
           this.to = to;
           this.message = message;
	}
 
	/*
	* Affiche le contenu du Mél : from, to et message
	*/
	public void print(){
	   System.out.println(message);	
           System.out.println(from);
           System.out.println(to);
	}
    
}
