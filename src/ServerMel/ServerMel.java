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
public class ServerMel {
    // Nombre maximum de mél
	public static final int MAXM = 200; 
 
	private Mel lesmel[];
	private int cardinal; //nombre de méls mémorisés
 
	/*
	* Constructeur de la classe
	* 
	* Ne fait rien ... de particulier
	*/
	public ServerMel(){
	   lesmel = new Mel[MAXM];
           cardinal=0;
	}
 
	/*
	 * 1- Délivre le dernier mél : principe LIFO (Last IN First Out)
	 * 2- Supprime le mél délivré
	 * 
	 * @return Le mél délivré ou null si aucun mél
	 */
	public Mel getNextMél(){
            if(cardinal == 0){
                return null;
            }
            cardinal--;
            Mel m=lesmel[cardinal];
            //lesmel[cardinal]=null;
            return m;
	}
 
	/*
	* Ajoute un mél
	* Une exception DadaException est provoquée si cardinal > MAXM
        *
        * @param from    Origine du message
        * @param to      Destinataire du message
        * @param message Le message
	*/
	public void addNewMél(String from, String to, String message){
            //Si le mail est ajouté, return true
            //Si cardinal > MAXM, return false
            
            
            
            lesmel[cardinal] = new Mel(from, to, message);
            cardinal++;
            
            
            //Exeption -> Si il y à plus de 200 mails : erreur
            if (cardinal > MAXM){
                
                  
            }
            
	}

}
