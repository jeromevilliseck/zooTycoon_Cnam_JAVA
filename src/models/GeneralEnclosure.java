package models;

import java.util.ArrayList;

public abstract class GeneralEnclosure implements IStandardEnclosure {

	//Listes
	public enum TypeEnclosure{STANDARD, AVIARY, AQUATIC}
	public enum CleanlinessDegree{BAD, GOOD}
	
	//Attributs
	private String name; //Nom enclos
	private int areaEnclosure; //Superficie enclos
	private TypeEnclosure eTypeEnclosure; //Type de l'enclos
	private CleanlinessDegree eCleanlinessDegree; //Degré de propreté de l'enclos
	private int maxAnimal; //Nombre maximum d'animaux à contenir
	
	//Methodes
	public abstract void printCriteria();
	public abstract void printAnimalsCriteria();
	public abstract void addAnimal();
	public abstract void deleteAnimal();
	public abstract void cleanEnclosure();
	
	//Listing des enclos : utilisation d'une liste de classe static et d'une méthode de classe pas d'instance car pas besoin d'objet : c'est abstrait et "global"
	//Cela fonctionne mais je n'ai pas réussi à créer une arraylist de list étant pris par le temps.
	//Lien : https://stackoverflow.com/questions/8559092/create-an-array-of-arraylists
	private static ArrayList<GeneralEnclosure> generalEnclosuresList = new ArrayList<GeneralEnclosure>();
	
	public static GeneralEnclosure addEnclosure(GeneralEnclosure generalEnclosure) { 
		generalEnclosuresList.add(generalEnclosure);
		return generalEnclosure;
	}
	
	public static ArrayList<GeneralEnclosure> getGeneralEnclosuresList() {
		return generalEnclosuresList;
	}
	public static void setGeneralEnclosuresList(ArrayList<GeneralEnclosure> generalEnclosuresList) {
		GeneralEnclosure.generalEnclosuresList = generalEnclosuresList;
	}
	
	public static GeneralEnclosure setCleanEnclosure (GeneralEnclosure generalEnclosure, int numBer ) {
		generalEnclosuresList.get(numBer).seteCleanlinessDegree(CleanlinessDegree.GOOD);
		return generalEnclosure;
	}
	
	//GETTERS sur les 7 attributs de la classe [enclos standard]
	public String getName() {
		return name;
	}
	public int getAreaEnclosure() {
		return areaEnclosure;
	}
	public TypeEnclosure geteTypeEnclosure() {
		return eTypeEnclosure;
	}
	public CleanlinessDegree geteCleanlinessDegree() {
		return eCleanlinessDegree;
	}
	public int getMaxAnimal() {
		return maxAnimal;
	}
	
	//SETTERS sur les les 7 attributs de la classe [enclos standard]
	public void setName(String name) {
		this.name = name;
	}
	public void setAreaEnclosure(int areaEnclosure) {
		this.areaEnclosure = areaEnclosure;
	}
	public void seteTypeEnclosure(TypeEnclosure eTypeEnclosure) {
		this.eTypeEnclosure = eTypeEnclosure;
	}
	public void seteCleanlinessDegree(CleanlinessDegree eCleanlinessDegree) {
		this.eCleanlinessDegree = eCleanlinessDegree;
	}
	public void setMaxAnimal(int maxAnimal) {
		this.maxAnimal = maxAnimal;
	}
	
	//Constructeur vide
	public GeneralEnclosure() {

	}
	
	//Constructeur passant en paramètres d'entrée les 7 attributs de la classe
	public GeneralEnclosure(String name, int areaEnclosure, TypeEnclosure eTypeEnclosure,
			CleanlinessDegree eCleanlinessDegree, int maxAnimal) {
		super();
		this.name = name;
		this.areaEnclosure = areaEnclosure;
		this.eTypeEnclosure = eTypeEnclosure;
		this.eCleanlinessDegree = eCleanlinessDegree;
		this.maxAnimal = maxAnimal;
	}
	
	@Override
	public String toString() {
		return "GeneralEnclosure [name=" + name + ", areaEnclosure=" + areaEnclosure + ", eTypeEnclosure="
				+ eTypeEnclosure + ", eCleanlinessDegree=" + eCleanlinessDegree + ", maxAnimal=" + maxAnimal + "]";
	}


}