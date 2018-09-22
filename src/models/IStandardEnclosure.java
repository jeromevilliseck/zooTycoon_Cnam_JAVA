package models;

public interface IStandardEnclosure { //Interface enclos standard
		public void printCriteria(); //Affiche caracteristiques enclos. [print attributs de l'enclos]
		public void printAnimalsCriteria(); //Affiche la liste des animaux de l'enclos. [objet enclos.print liste des animaux]
		public void addAnimal(); //Ajoute un animal [ajout objet animal à objet enclos]
		public void deleteAnimal(); //Supprime un animal [supprimer objet animal à objet enclos]
		public void cleanEnclosure(); //Nettoye l'enclos si vide et sale [condition sur liste vide] [condition sur ATTRIBUT degré de propreté]
}