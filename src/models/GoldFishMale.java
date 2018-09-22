package models;

public class GoldFishMale extends GoldFish {

	private static int nbGoldFishMale = 0;
	
	public GoldFishMale() {
		super();
		setNbGoldFishMale(getNbGoldFishMale() + 1);
	}

	public GoldFishMale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbGoldFishMale(getNbGoldFishMale() + 1);
	}

	public static int getNbGoldFishMale() {
		return nbGoldFishMale;
	}

	private static void setNbGoldFishMale(int nbGoldFishMale) {
		GoldFishMale.nbGoldFishMale = nbGoldFishMale;
	}
	
}
