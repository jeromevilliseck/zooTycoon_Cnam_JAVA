package models;

public class WolfFemale extends Wolf implements MammalFemale {

	private static final int GIVE_LIFE_TIME = 70; 
	private static int nbWolfFemale = 0; //Initialisation compteur à 0
	
	
	//Constructeurs
	public WolfFemale() {
		super();
		nbWolfFemale++;
	}

	public WolfFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		nbWolfFemale++;
	}

	//ICI IL FAUDRA DEFINIR LA METHODE
	public void givelife() {
	}

	//Getter uniquement sur une constante pas de setter
	public int getGiveLifeTime() { //Supprimer la constante de cette classe probleme accessibilité
		return WolfFemale.GIVE_LIFE_TIME;
	} //Une méthode statique ou attribut (de classe) NE DOIS JAMAIS être appelé sur une instance ou this
	
	
	//Idem getter uniquement on ne modifie pas depuis l'extérieur le compteur
	public static int getNbWolfFemale() {
		return nbWolfFemale;
	}

	@Override
	public String toString() {
		return "WolfFemale [getName()=" + getName() + ", getSex()=" + getSex() + ", getWeight()=" + getWeight()
				+ ", getHeight()=" + getHeight() + ", getOld()=" + getOld() + ", geteHunger()=" + geteHunger()
				+ ", geteSleeping()=" + geteSleeping() + ", geteHealth()=" + geteHealth() + ", getGiveLifeTime()=" + getGiveLifeTime() + "]";
	}
}
