package models;

public abstract class Animal implements Male {

	//Listes
	public enum Hunger{LOW, MEDIUM, HIGH}
	public enum Sleeping{DOWN, UP}
	public enum Health{LOW, MEDIUM, HIGH}
	public enum Sex{M, F}

	//Attributs
	private String name;
	private Sex eSex;
	private int weight;
	private int height;
	private int old;
	private Hunger eHunger;
	private Sleeping eSleeping;
	private Health eHealth;

	//Méthodes [Standard communes à tous les animaux > voir interface male]
	public abstract void eat();
	public abstract void scream();
	public abstract void becured();
	public abstract void sleep();
	public abstract void awake();

	//Getters sur 8 Attributs de la classe
	public String getName() {
		return name;
	}
	public Sex getSex() {
		return eSex;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public int getOld() {
		return old;
	}
	public Hunger geteHunger() {
		return eHunger;
	}
	public Sleeping geteSleeping() {
		return eSleeping;
	}
	public Health geteHealth() {
		return eHealth;
	}

	//Setters sur 8 Attributs de la classe
	public void setName(String name) {
		this.name = name;
	}
	public void seteSex(Sex sex) {
		this.eSex = sex;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public void seteHunger(Hunger eHunger) {
		this.eHunger = eHunger;
	}
	public void seteSleeping(Sleeping eSleeping) {
		this.eSleeping = eSleeping;
	}
	public void seteHealth(Health eHealth) {
		this.eHealth = eHealth;
	}

	//Constructeurs

	//Constructeur standard vide
	public Animal(){

	}

	//Constructeur passant en paramètres d'entrée les 8 attributs de la classe
	public Animal(String name, Sex eSex, int weight, int height, int old, Hunger eHunger, Sleeping eSleeping, Health eHealth) {
		this.name = name;
		this.eSex = eSex;
		this.weight = weight;
		this.height = height;
		this.old = old;
		this.eHunger = eHunger;
		this.eSleeping = eSleeping;
		this.eHealth = eHealth;
	}

	@Override
	public String toString() {
		return "Animal [getName()=" + getName() + ", getSex()=" + getSex() + ", getWeight()=" + getWeight()
		+ ", getHeight()=" + getHeight() + ", getOld()=" + getOld() + ", geteHunger()=" + geteHunger()
		+ ", geteSleeping()=" + geteSleeping() + ", geteHealth()=" + geteHealth() + "]";
	}



}
