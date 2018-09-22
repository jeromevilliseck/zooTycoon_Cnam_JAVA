package models;

public class GoldFishFemale extends GoldFish implements OvipareFemale {
	
	//Attribut supplémentaire constante
	private final static int GIVE_LIFE_TIME = 70;
	private static int nbGoldFishFemale = 0;

	//Constructeurs depuis la classe mère
	public GoldFishFemale() {
		super();
		setNbGoldFishFemale(getNbGoldFishFemale() + 1);
	}

	public GoldFishFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbGoldFishFemale(getNbGoldFishFemale() + 1);
	}
	
	//Getter de la constante
	public static int getGiveLifeTime() {
		return GIVE_LIFE_TIME;
	}

	@Override //Methode pondre des oeufs issue de l'interface OvipareFemale 
	public void layeggs() {
		// TODO Auto-generated method stub
		
	}

	public static int getNbGoldFishFemale() {
		return nbGoldFishFemale;
	}

	private static void setNbGoldFishFemale(int nbGoldFishFemale) {
		GoldFishFemale.nbGoldFishFemale = nbGoldFishFemale;
	}
	
	
}
