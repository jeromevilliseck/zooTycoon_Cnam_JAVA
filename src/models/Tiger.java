package models;

public abstract class Tiger extends Animal {
	//Condition pour l'instanciation
	
	public static Tiger create(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping, Health eHealth) {
		if (eSex == Sex.F) {
			return new TigerFemale(name, eSex,weight, height,old,eHunger, eSleeping,eHealth);
		} else {
			return new TigerMale(name, eSex,weight, height,old,eHunger, eSleeping,eHealth);
		}
	}
	
	

	//Constructeur vide depuis la super classe Animal
	public Tiger() {
		super();
	}

	//Constructeur à paramètres depuis la super classe Animal
	public Tiger(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
			Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
	}

	//Méthodes
	public void scream() {
	}

	public void becured() {
	}

	public void sleep() {
	}

	public void awake() {
	}
	
	public void eat() {
	}

	//Méthode spécifique au type
	public void wander() {
	}
}
