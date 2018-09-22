package models;

public class WhaleFemale extends Whale implements MammalFemale {
	
	//Attribut supplémentaire constante
	private final static int GIVE_LIFE_TIME = 70;
	private static int nbWhaleFemale = 0;

	//Constructeurs depuis la classe mère
	public WhaleFemale() {
		super();
		setNbWhaleFemale(getNbWhaleFemale() + 1);
	}

	public WhaleFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbWhaleFemale(getNbWhaleFemale() + 1);
	}
	
	//Getter de la constante
	public int getGiveLifeTime() {
		return WhaleFemale.GIVE_LIFE_TIME;
	}

	@Override //Methode accouchement issue de l'interface MammalFemale 
	public void givelife() {
		// TODO Auto-generated method stub
		
	}

	public static int getNbWhaleFemale() {
		return nbWhaleFemale;
	}

	private static void setNbWhaleFemale(int nbWhaleFemale) {
		WhaleFemale.nbWhaleFemale = nbWhaleFemale;
	}
	
	
}
