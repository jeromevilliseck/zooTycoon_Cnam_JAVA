package models;

public class EagleFemale extends Eagle implements OvipareFemale {

	private final static int GIVE_LIFE_TIME = 45; //45 jours de gestation.
	private static int nbEagleFemale = 0;
	
	public EagleFemale() {
		super();
		setNbEagleFemale(getNbEagleFemale() + 1);
	}

	EagleFemale(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
		setNbEagleFemale(getNbEagleFemale() + 1);
	}

	public void givelife() {
		
	}

	//Getter uniquement sur une constante pas de setter
	public static int getGiveLifeTime() {
		return GIVE_LIFE_TIME;
	}
	
	@Override //Methode pondre des oeufs issue de l'interface OvipareFemale 
	public void layeggs() {
		// TODO Auto-generated method stub
		
	}

	public static int getNbEagleFemale() {
		return nbEagleFemale;
	}

	private static void setNbEagleFemale(int nbEagleFemale) {
		EagleFemale.nbEagleFemale = nbEagleFemale;
	}

}
