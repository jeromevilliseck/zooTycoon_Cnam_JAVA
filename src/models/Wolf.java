package models;

public abstract class Wolf extends Animal {
	
	//Conditions permettant en fonction du type [ici male ou femelle -> liste enum] passé en paramètre de créer un objet permettant de passer des paramètres différents propres à la classe
	public static Wolf create(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping, Health eHealth) {
		if (eSex == Sex.F) {
			return new WolfFemale(name, eSex,weight, height,old,eHunger, eSleeping, eHealth);
		} else {
			return new WolfMale(name, eSex,weight, height,old,eHunger, eSleeping,eHealth);
		}
	}
	
	//Constructeur standard
	public Wolf() {
		super();
	}

	//Constructeur prenant en paramètre les 8 attributs de sa classe parent
	protected Wolf(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping, Health eHealth) {
		super(name, eSex, weight, height, old, eHunger, eSleeping, eHealth);
	}

	//Reprends les 5 methodes de sa classe parent
	public void scream() {
	}

	public void eat() {
	}

	public void becured() {
	}

	public void sleep() {
	}

	public void awake() {
	}
	
	//Plus une méthode spécifique au type d'animal [loup]
	public void wander() {
	}
	

	@Override
	public String toString() {
		return "Ce loup s'appelle " + getName() + " ,il est de sexe " + getSex() + " ,son poids est de " + getWeight()
				+ " kilos, il mesure " + getHeight() + " centimètres, il est agé de " + getOld() + " années, son niveau de faim est actuellement " + geteHunger()
				+ " , son niveau de fatigue est actuellement " + geteSleeping() + " , sa santé est en niveau " + geteHealth() + ".";
	}
}
