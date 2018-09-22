package models;

public class SharkFemale extends Shark implements OvipareFemale {
	
	//Attribut supplémentaire constante
	private final static int GIVE_LIFE_TIME = 70;
	private static int nbSharkFemale = 0;
	
	//Constructeurs depuis la classe mère
	public SharkFemale() {
		super();
		setNbSharkFemale(getNbSharkFemale() + 1);
	}

	public SharkFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbSharkFemale(getNbSharkFemale() + 1);
	}
	
	//Getter de la constante
	public static int getGiveLifeTime() {
		return GIVE_LIFE_TIME;
	}

	@Override //Methode pondre des oeufs issue de l'interface OvipareFemale 
	public void layeggs() {
		// TODO Auto-generated method stub
		
	}

	public static int getNbSharkFemale() {
		return nbSharkFemale;
	}

	private static void setNbSharkFemale(int nbSharkFemale) {
		SharkFemale.nbSharkFemale = nbSharkFemale;
	}
	
	
}
