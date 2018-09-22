package models;

public class SharkMale extends Shark {

	private static int nbSharkmale = 0;
	
	public SharkMale() {
		super();
		setNbSharkmale(getNbSharkmale() + 1);
	}

	public SharkMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbSharkmale(getNbSharkmale() + 1);
	}

	public static int getNbSharkmale() {
		return nbSharkmale;
	}

	private static void setNbSharkmale(int nbSharkmale) {
		SharkMale.nbSharkmale = nbSharkmale;
	}
	
}
