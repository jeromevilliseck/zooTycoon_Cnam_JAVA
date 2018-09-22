package models;

public class WhaleMale extends Whale {

	private static int nbWhaleMale = 0;
	
	public WhaleMale() {
		super();
		setNbWhaleMale(getNbWhaleMale() + 1);
	}

	public WhaleMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbWhaleMale(getNbWhaleMale() + 1);
	}

	public static int getNbWhaleMale() {
		return nbWhaleMale;
	}

	private static void setNbWhaleMale(int nbWhaleMale) {
		WhaleMale.nbWhaleMale = nbWhaleMale;
	}
	
}
