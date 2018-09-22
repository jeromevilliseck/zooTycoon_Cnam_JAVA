package models;

public abstract class Eagle extends Animal {
	//Condition pour l'instanciation
	
	public static Eagle create(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping, Health eHealth) {
		if (eSex == Sex.F) {
			return new EagleFemale(name, eSex,weight, height,old,eHunger, eSleeping,eHealth);
		} else {
			return new EagleMale(name, eSex,weight, height,old,eHunger, eSleeping,eHealth);
		}
	}
	
	

	//Constructeur vide depuis la super classe Animal
	public Eagle() {
		super();
	}

	//Constructeur à paramètres depuis la super classe Animal
	public Eagle(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
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

	//Méthode spécifique au type [nager]
	public void fly() {
	}
}
