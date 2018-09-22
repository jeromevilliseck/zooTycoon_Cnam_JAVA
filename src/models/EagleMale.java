package models;

public class EagleMale extends Eagle {

	private static int nbEagleMale= 0;
	
	public EagleMale() {
		super();
		setNbEagleMale(getNbEagleMale() + 1);
	}

	public EagleMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbEagleMale(getNbEagleMale() + 1);
	}

	public static int getNbEagleMale() {
		return nbEagleMale;
	}

	private static void setNbEagleMale(int nbEagleMale) {
		EagleMale.nbEagleMale = nbEagleMale;
	}
	
}
