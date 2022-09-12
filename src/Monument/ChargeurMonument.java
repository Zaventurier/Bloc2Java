package Monument;
import plum.exception.DadaException;
import java.util.ArrayList;
/*
 * Constitue le jeu d'essai de MonumentsDeParis.java
 * 
 *
/**
 * Constitue le jeu d'essai de MonumentsDeParis.java
 * 
 */    


public class ChargeurMonument{
 
       /**
       * Retourne les monuments de Paris
       * 
       * @return Retourne les monuments de paris
       */
       public static ArrayList<Monument> init (){
         String t[] = {
    	"Musée National du Moyen Age-Thermes de Cluny",
    	"Musée de la Chasse et de la Nature",
    	"Musée d'Art et d'Histoire du Judaïsme",
    	"Musée National Picasso",
    	"Musée Cognacq-Jay, Musée du XVIIIe siècle de la ville de Paris",
    	"Musée Carnavalet-Histoire de Paris",
    	"Galerie d’entomologie (Muséum national d'histoire naturelle)",
    	"Musée de l'Assistance Publique - Hôpitaux de Paris",
    	"Galerie d'Anatomie Comparée et de Paléontologie (Muséum d'Histoire Naturelle)",
    	"Galerie de Botanique (Muséum National National d'Histoire Naturelle)",
    	"Galerie de Minéralogie et de Géologie (Muséum d'Histoire Naturelle)",
    	"Maison de Victor Hugo",
    	"Crypte Archéologique du Parvis Notre-Dame",
    	"Musées Arts Décoratifs  Mode et du Textile",
    	"Musée National Eugène Delacroix",
    	"Grande Galerie de l'Evolution (Muséum National d'Histoire Naturelle)",
    	"Musée de l'Armée",
    	"Maison de Balzac",
    	"Musée du Louvre",
    	"Musée National de la Marine",
    	"Mémorial du Maréchal Leclerc de Hauteclocque et de la Libération de Paris - Musée Jean Moulin",
    	"Musée National du Sport",
    	"Musée Jean-Jacques Henner",
    	"Musée de Montmartre",
    	"Musée Bouchard",
    	"Musée Cernuschi, Musée des Arts de l'Asie de la ville de Paris",
    	"Les Catacombes",
    	"Musée Zadkine",
    	"Musée Galliéra - Musée de la Mode de la ville de Paris",
    	"Etablissement Public du Musée d'Orsay",
    	"Musée National de la Légion d'Honneur et des Ordres de Chevalerie",
    	"Musée de la Musique",
    	"Petit Palais, Musée des Beaux-Arts de la ville de Paris",
    	"Musée de la Vie Romantique",
    	"Musée de la Publicité (Les Arts Décoratifs)",
    	"Etablissement public de la Porte Dorée - Aquarium Tropical",
    	"Établissement Public de la Porte Dorée - Cité Nationale de l’Histoire de l’Immigration",
    	"Musée Lénine",
    	"Musée Nissim de Camondo (Les Arts Décoratifs)",
    	"Musée Hébert",
    	"Musée des Monuments Français",
    	"Institut du Monde Arabe",
    	"Musées des Arts Décoratifs",
    	"Musée National Auguste Rodin",
    	"Musée National Gustave Moreau",
    	"Musée de la Franc-Maçonnerie",
    	"Musée National de L'Orangerie des Tuileries",
    	"Musée d'Art Moderne de la ville de Paris",
    	"Musée d'Ennery",
    	"M.U.C.E.M. - Musée des ATP",
    	"Musée Bourdelle",
    	"Musée de l'Homme (Muséum National d'Histoire Naturelle)",
    	"Etablissement Public du Musée des Arts Asiatiques Guimet"
      };
 
 
      ArrayList<Monument> lm = new ArrayList();
 
      for (int i = 0; i < lm.size() ; i++){
 
        int jour =(int) (Math.random() * 7); // 0 à 6
 
        String id = "M" + t[i].substring(1,3) + i;
 
        Monument m = new Monument ( id, t[i], Monument.JOURS_DE_SEMAINE[jour]);
        lm.add(m);
      }
 
      return lm;
    }
}