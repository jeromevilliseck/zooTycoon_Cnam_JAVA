package models;

public class BearFemale extends Bear implements MammalFemale {
	
	//Attribut supplémentaire constante
	private final static int GIVE_LIFE_TIME = 200;
	private static int nbBearFemale = 0;

	//Constructeurs depuis la classe mère
	public BearFemale() {
		super();
		setNbBearFemale(getNbBearFemale() + 1);
	}

	public BearFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbBearFemale(getNbBearFemale() + 1);
	}
	
	//Getter de la constante
	public int getGiveLifeTime() {
		return BearFemale.GIVE_LIFE_TIME;
	}

	@Override //Methode accouchement issue de l'interface MammalFemale 
	public void givelife() {
		// TODO Auto-generated method stub
		
	}

	public static int getNbBearFemale() {
		return nbBearFemale;
	}

	private static void setNbBearFemale(int nbBearFemale) {
		BearFemale.nbBearFemale = nbBearFemale;
	}
	
	
}
