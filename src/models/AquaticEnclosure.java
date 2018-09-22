package models;

import java.util.ArrayList;
import java.util.Scanner;

import models.Animal.Health;
import models.Animal.Hunger;
import models.Animal.Sleeping;

public class AquaticEnclosure extends GeneralEnclosure implements IAquaticEnclosure {
	//Liste
	public enum SalinityWater {GOOD, BAD}

	//Attribut de la liste
	private SalinityWater eSalinityWater;
	public int basinDepth;

	private static int nbAquaticEnclosure = 0;
	private static ArrayList<GoldFish> goldFishList;
	private static ArrayList<Shark> sharkList;
	private static ArrayList<Penguin> penguinList;
	private static ArrayList<Whale> whaleList;

	public int getBasinDepth() {
		return basinDepth;
	}
	public ArrayList<GoldFish> getGoldFishList() {
		return goldFishList;
	}
	public ArrayList<Shark> getSharkList() {
		return sharkList;
	}
	public ArrayList<Penguin> getPenguinList() {
		return penguinList;
	}
	public ArrayList<Whale> getWhaleList() {
		return whaleList;
	}
	public void setBasinDepth(int basinDepth) {
		this.basinDepth = basinDepth;
	}
	public void setGoldFishList(ArrayList<GoldFish> goldFishList) {
		AquaticEnclosure.goldFishList = goldFishList;
	}
	public void setSharkList(ArrayList<Shark> sharkList) {
		AquaticEnclosure.sharkList = sharkList;
	}
	public void setPenguinList(ArrayList<Penguin> penguinList) {
		AquaticEnclosure.penguinList = penguinList;
	}
	public void setWhaleList(ArrayList<Whale> whaleList) {
		AquaticEnclosure.whaleList = whaleList;
	}
	public AquaticEnclosure() {
		super();
		AquaticEnclosure.goldFishList = new ArrayList<GoldFish>();
		AquaticEnclosure.sharkList = new ArrayList<Shark>();
		AquaticEnclosure.penguinList = new ArrayList<Penguin>();
		AquaticEnclosure.whaleList = new ArrayList<Whale>();
		setNbAquaticEnclosure(getNbAquaticEnclosure() + 1);
	}
	public AquaticEnclosure(String name, int areaEnclosure, TypeEnclosure eTypeEnclosure,
			CleanlinessDegree eCleanlinessDegree, int maxAnimal) {
		super(name, areaEnclosure, eTypeEnclosure, eCleanlinessDegree, maxAnimal);
		AquaticEnclosure.goldFishList = new ArrayList<GoldFish>();
		AquaticEnclosure.sharkList = new ArrayList<Shark>();
		AquaticEnclosure.penguinList = new ArrayList<Penguin>();
		AquaticEnclosure.whaleList = new ArrayList<Whale>();
		setNbAquaticEnclosure(getNbAquaticEnclosure() + 1);
	}

	public GoldFish addGoldFish(GoldFish goldfish) { 
		AquaticEnclosure.goldFishList.add(goldfish);
		return goldfish;
	}

	public Shark addShark(Shark shark) {
		AquaticEnclosure.sharkList.add(shark);
		return shark;
	}

	public Penguin addPenguin(Penguin penguin) {
		AquaticEnclosure.penguinList.add(penguin);
		return penguin;
	}

	public Whale addWhale(Whale whale) {
		AquaticEnclosure.whaleList.add(whale);
		return whale;
	}

	//POISSONSROUGES
	public static void deleteGoldFish() {
		for (int i = 0; i < goldFishList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + goldFishList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scRemoveGoldFish = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à supprimer");
		int indexChoice = scRemoveGoldFish.nextInt();
		AquaticEnclosure.goldFishList.remove(goldFishList.get(indexChoice));
	}

	public static void feedGoldFish() {
		System.out.println("La liste des poissons rouges  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < goldFishList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + goldFishList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedGoldFish = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à nourrir");
		int indexChoice = scFeedGoldFish.nextInt();
		GoldFish target =goldFishList.get(indexChoice);
		target.seteHunger(Hunger.HIGH);
	}

	public static void sleepingOrderGoldFish() {
		System.out.println("La liste des poissons rouges  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < goldFishList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + goldFishList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedGoldFish = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à endormir");
		int indexChoice = scFeedGoldFish.nextInt();
		GoldFish target =goldFishList.get(indexChoice);
		target.seteSleeping(Sleeping.DOWN);
	}

	public static void sickingOrderGoldFish() {
		System.out.println("La liste des poissons rouges est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < goldFishList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + goldFishList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedGoldFish = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à rendre malade");
		int indexChoice = scFeedGoldFish.nextInt();
		GoldFish target =goldFishList.get(indexChoice);
		target.seteHealth(Health.LOW);
	}

	//REQUINS
	public static void deleteShark() {
		for (int i = 0; i < sharkList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + sharkList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scRemoveShark = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à supprimer");
		int indexChoice = scRemoveShark.nextInt();
		AquaticEnclosure.sharkList.remove(sharkList.get(indexChoice));
	}

	public static void feedShark() {
		System.out.println("La liste des requins  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < sharkList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + sharkList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedShark = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à nourrir");
		int indexChoice = scFeedShark.nextInt();
		Shark target =sharkList.get(indexChoice);
		target.seteHunger(Hunger.HIGH);
	}

	public static void sleepingOrderShark() {
		System.out.println("La liste des poissons rouges  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < sharkList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + sharkList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedShark = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à endormir");
		int indexChoice = scFeedShark.nextInt();
		Shark target =sharkList.get(indexChoice);
		target.seteSleeping(Sleeping.DOWN);
	}

	public static void sickingOrderShark() {
		System.out.println("La liste des poissons rouges est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < sharkList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + sharkList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedShark = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à rendre malade");
		int indexChoice = scFeedShark.nextInt();
		Shark target =sharkList.get(indexChoice);
		target.seteHealth(Health.LOW);
	}


	//PENGUIN
	public static void deletePenguin() {
		for (int i = 0; i < penguinList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + penguinList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scRemovePenguin= new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à supprimer");
		int indexChoice = scRemovePenguin.nextInt();
		AquaticEnclosure.penguinList.remove(penguinList.get(indexChoice));
	}

	public static void feedPenguin() {
		System.out.println("La liste des poissons rouges  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < penguinList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + penguinList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedPenguin = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à nourrir");
		int indexChoice = scFeedPenguin.nextInt();
		Penguin target =penguinList.get(indexChoice);
		target.seteHunger(Hunger.HIGH);
	}

	public static void sleepingOrderPenguin() {
		System.out.println("La liste des poissons rouges  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < penguinList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + penguinList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedPenguin = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à endormir");
		int indexChoice = scFeedPenguin.nextInt();
		Penguin target =penguinList.get(indexChoice);
		target.seteSleeping(Sleeping.DOWN);
	}

	public static void sickingOrderPenguin() {
		System.out.println("La liste des poissons rouges est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < penguinList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + penguinList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedPenguin = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à rendre malade");
		int indexChoice = scFeedPenguin.nextInt();
		Penguin target =penguinList.get(indexChoice);
		target.seteHealth(Health.LOW);
	}

	//Baleine
	public static void deleteWhale() {
		for (int i = 0; i < whaleList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + whaleList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scRemoveWhale = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à supprimer");
		int indexChoice = scRemoveWhale.nextInt();
		AquaticEnclosure.whaleList.remove(whaleList.get(indexChoice));
	}

	public static void feedWhale() {
		System.out.println("La liste des poissons rouges  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < whaleList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + whaleList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedWhale = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à nourrir");
		int indexChoice = scFeedWhale.nextInt();
		Whale target =whaleList.get(indexChoice);
		target.seteHunger(Hunger.HIGH);
	}

	public static void sleepingOrderWhale() {
		System.out.println("La liste des poissons rouges  est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < whaleList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + whaleList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedWhale = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à endormir");
		int indexChoice = scFeedWhale.nextInt();
		Whale target =whaleList.get(indexChoice);
		target.seteSleeping(Sleeping.DOWN);
	}

	public static void sickingOrderWhale() {
		System.out.println("La liste des poissons rouges est la suivante :" + System.getProperty("line.separator"));
		for (int i = 0; i < whaleList.size(); ++i) {
			System.out.println("En position du chiffre" + i + " :" + whaleList.get(i));
		}
		@SuppressWarnings("resource")
		Scanner scFeedWhale = new Scanner(System.in);
		System.out.println("Tapez le chiffre de l'animal à rendre malade");
		int indexChoice = scFeedWhale.nextInt();
		Whale target =whaleList.get(indexChoice);
		target.seteHealth(Health.LOW);
	}

	@Override
	public String toString() {
		return "AquaticEnclosure [basinDepth=" + basinDepth + ", goldFishList=" + goldFishList + ", sharkList="
				+ sharkList + ", penguinList=" + penguinList + ", whaleList=" + whaleList + "]";
	}
	public void cleanEnclosure() {

	}
	@Override
	public void printCriteria() {
		// TODO Auto-generated method stub

	}
	@Override
	public void printAnimalsCriteria() {
		// TODO Auto-generated method stub

	}
	@Override
	public void addAnimal() {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAnimal() {
		// TODO Auto-generated method stub

	}
	public static int getNbAquaticEnclosure() {
		return nbAquaticEnclosure;
	}
	private static void setNbAquaticEnclosure(int nbAquaticEnclosure) {
		AquaticEnclosure.nbAquaticEnclosure = nbAquaticEnclosure;
	}
	public SalinityWater geteSalinityWater() {
		return eSalinityWater;
	}
	public void seteSalinityWater(SalinityWater eSalinityWater) {
		this.eSalinityWater = eSalinityWater;
	}
}
