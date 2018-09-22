package models;

public class PenguinFemale extends Penguin implements OvipareFemale {
	
	//Attribut supplémentaire constante
	private final static int GIVE_LIFE_TIME = 70;
	private static int nbPenguinFemale = 0;

	//Constructeurs depuis la classe mère
	public PenguinFemale() {
		super();
		setNbPenguinFemale(getNbPenguinFemale() + 1);
	}

	public PenguinFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbPenguinFemale(getNbPenguinFemale() + 1);
	}
	
	//Getter de la constante
	public static int getGiveLifeTime() {
		return GIVE_LIFE_TIME;
	}

	@Override //Methode pondre des oeufs issue de l'interface OvipareFemale
	public void layeggs() {
		// TODO Auto-generated method stub
		
	}

	public static int getNbPenguinFemale() {
		return nbPenguinFemale;
	}

	private static void setNbPenguinFemale(int nbPenguinFemale) {
		PenguinFemale.nbPenguinFemale = nbPenguinFemale;
	}
	
	
}
