package models;

public class BearMale extends Bear {

	private static int nbBearMale = 0;
	
	public BearMale() {
		super();
		setNbBearMale(getNbBearMale() + 1);
	}

	public BearMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbBearMale(getNbBearMale() + 1);
	}

	public static int getNbBearMale() {
		return nbBearMale;
	}

	private static void setNbBearMale(int nbBearMale) {
		BearMale.nbBearMale = nbBearMale;
	}



}
