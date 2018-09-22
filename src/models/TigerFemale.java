package models;

public class TigerFemale extends Tiger implements MammalFemale {
	
	//Attribut supplémentaire constante
	private final static int GIVE_LIFE_TIME = 70;
	private static int nbTigerFemale = 0;

	//Constructeurs depuis la classe mère
	public TigerFemale() {
		super();
		setNbTigerFemale(getNbTigerFemale() + 1);
	}

	public TigerFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbTigerFemale(getNbTigerFemale() + 1);
	}
	
	//Getter de la constante
	public int getGiveLifeTime() {
		return TigerFemale.GIVE_LIFE_TIME;
	}

	@Override //Methode accouchement issue de l'interface MammalFemale 
	public void givelife() {
		// TODO Auto-generated method stub
		
	}

	public static int getNbTigerFemale() {
		return nbTigerFemale;
	}

	private static void setNbTigerFemale(int nbTigerFemale) {
		TigerFemale.nbTigerFemale = nbTigerFemale;
	}
	
	
}
