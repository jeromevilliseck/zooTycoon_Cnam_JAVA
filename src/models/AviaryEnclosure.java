package models;

import java.util.ArrayList;

public class AviaryEnclosure extends GeneralEnclosure implements IAviaryEnclosure {

	private static int nbAviaryEnclosure = 0;
	private ArrayList<Eagle> eagleList;

	//Attribut suplémentaire toit de la cage
	public enum Roof{GOOD, BAD}
	private Roof eRoof;

	public AviaryEnclosure() {
		super();
		this.eagleList = new ArrayList<Eagle>();
		setNbAviaryEnclosure(getNbAviaryEnclosure() + 1);
	}

	public AviaryEnclosure(String name, int areaEnclosure, TypeEnclosure eTypeEnclosure,
			CleanlinessDegree eCleanlinessDegree, int maxAnimal) {
		super(name, areaEnclosure, eTypeEnclosure, eCleanlinessDegree, maxAnimal);
		this.eagleList = new ArrayList<Eagle>();
		setNbAviaryEnclosure(getNbAviaryEnclosure() + 1);
	}

	public void cleanEnclosure() {

	}

	public Eagle addEagle(Eagle eagle) {
		this.eagleList.add(eagle);
		return eagle;
	}

	@Override
	public String toString() {
		return "AviaryEnclosure [eagleList=" + eagleList + "]";
	}

	@Override
	public void printCriteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printAnimalsCriteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAnimal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAnimal() {
		// TODO Auto-generated method stub

	}

	public static int getNbAviaryEnclosure() {
		return nbAviaryEnclosure;
	}

	private static void setNbAviaryEnclosure(int nbAviaryEnclosure) {
		AviaryEnclosure.nbAviaryEnclosure = nbAviaryEnclosure;
	}

	public Roof geteRoof() {
		return eRoof;
	}

	public void seteRoof(Roof eRoof) {
		this.eRoof = eRoof;
	}

}
