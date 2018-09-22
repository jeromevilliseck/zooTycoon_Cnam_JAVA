package models;

public abstract class Shark extends Animal {
	//Condition pour l'instanciation
	
	public static Shark create(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping, Health eHealth) {
		if (eSex == Sex.F) {
			return new SharkFemale(name, eSex,weight, height,old,eHunger, eSleeping,eHealth);
		} else {
			return new SharkMale(name, eSex,weight, height,old,eHunger, eSleeping,eHealth);
		}
	}
	
	

	//Constructeur vide depuis la super classe Animal
	public Shark() {
		super();
	}

	//Constructeur à paramètres depuis la super classe Animal
	public Shark(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping,
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
	public void swim() {
	}
}
