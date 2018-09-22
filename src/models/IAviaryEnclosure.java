package models;

public interface IAviaryEnclosure {
	public void printCriteria(); //Affiche caracteristiques enclos. [print attributs de l'enclos]
	public void printAnimalsCriteria(); //Affiche la liste des animaux de l'enclos. [objet enclos.print liste des animaux]
	public void addAnimal(); //Ajoute un animal [ajout objet animal à objet enclos]
	public void deleteAnimal(); //Supprime un animal [supprimer objet animal à objet enclos]
	public void cleanEnclosure(); //Nettoye l'enclos si vide [condition sur liste vide] et sale [condition sur ATTRIBUT degré de propreté] + [condition sur ATTRIBUT toit de la cage]
}

/*
 * Attribut suplementaires 
 * toit de la cage
 */
