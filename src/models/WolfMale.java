package models;

public class WolfMale extends Wolf {

	private static int nbWolfMale = 0; //Initialisation compteur à 0
	
	public WolfMale() {
		super();
		setNbWolfMale(getNbWolfMale() + 1); //Identique à nbWolfMale++ mais plus propre passe par l'accesseur
	}

	public WolfMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbWolfMale(getNbWolfMale() + 1);
	}

	@Override
	public String toString() {
		return "Le loup male s'appelle" + getName() + " de sexe " + getSex() + " de poids " + getWeight()
				+ " de taille " + getHeight() + " d'age " + getOld() + " de niveau de faim " + geteHunger()
				+ "de statut de sommeil " + geteSleeping() + " de santé " + geteHealth() + " et de type " + getClass()
				+ " son identifiant est " + hashCode();
	}

	public static int getNbWolfMale() {
		return nbWolfMale;
	}

	private static void setNbWolfMale(int nbWolfMale) { //Private on accède pas depuis l'extérieur au compteur
		WolfMale.nbWolfMale = nbWolfMale;
	}

	
	
}
