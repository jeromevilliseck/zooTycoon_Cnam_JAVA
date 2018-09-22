package models;

public class TigerMale extends Tiger {

	private static int nbTigerMale = 0;
	
	public TigerMale() {
		super();
		setNbTigerMale(getNbTigerMale() + 1);
	}

	public TigerMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbTigerMale(getNbTigerMale() + 1);
	}

	public static int getNbTigerMale() {
		return nbTigerMale;
	}

	private static void setNbTigerMale(int nbTigerMale) {
		TigerMale.nbTigerMale = nbTigerMale;
	}
	
}
