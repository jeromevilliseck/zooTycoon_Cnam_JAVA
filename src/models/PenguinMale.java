package models;

public class PenguinMale extends Penguin {

	private static int nbPenguinMale = 0;
	
	public PenguinMale() {
		super();
		setNbPenguinMale(getNbPenguinMale() + 1);
	}

	public PenguinMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbPenguinMale(getNbPenguinMale() + 1);
	}

	public static int getNbPenguinMale() {
		return nbPenguinMale;
	}

	private static void setNbPenguinMale(int nbPenguinMale) {
		PenguinMale.nbPenguinMale = nbPenguinMale;
	}
	
}
