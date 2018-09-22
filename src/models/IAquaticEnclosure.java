package models;

public interface IAquaticEnclosure {
	public void printCriteria(); //Affiche caracteristiques enclos. [print attributs de l'enclos]
	public void printAnimalsCriteria(); //Affiche la liste des animaux de l'enclos. [objet enclos.print liste des animaux]
	public void addAnimal(); //Ajoute un animal [ajout objet animal à objet enclos]
	public void deleteAnimal(); //Supprime un animal [supprimer objet animal à objet enclos]
	public void cleanEnclosure(); //Nettoye l'enclos si vide [liste vide] + sale [attribut a valeur sale] + eau suffisante [attribut à valeur haute] + salinité suffisante [attribut à valeur haute]
}

/*
 * Attributs suplémentaires 
 * profondeur du bassin [salinityWater]
 * salinité de l'eau [basinDepth]
 */