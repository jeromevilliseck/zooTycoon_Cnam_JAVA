package models;

import java.util.ArrayList;
import java.util.Scanner;

import models.Animal.Health;
import models.Animal.Hunger;
import models.Animal.Sleeping;

public class NormalEnclosure extends GeneralEnclosure {
	
		private static int nbNormalEnclosure = 0; //Initialisation du compteur à 0.
		private int max;
		private static ArrayList<Wolf> wolfList; //Liste de type loup dans l'enclos normal
		private static ArrayList<Tiger> tigerList;
		private static ArrayList<Bear> bearList;
	
		public static ArrayList<Wolf> getWolfList() {
			return wolfList;
		}

		public ArrayList<Tiger> getTigerList() {
			return tigerList;
		}

		public ArrayList<Bear> getBearList() {
			return bearList;
		}

		public void setWolfList(ArrayList<Wolf> wolfList) {
			NormalEnclosure.wolfList = wolfList;
		}

		public void setTigerList(ArrayList<Tiger> tigerList) {
			NormalEnclosure.tigerList = tigerList;
		}

		public void setBearList(ArrayList<Bear> bearList) {
			NormalEnclosure.bearList = bearList;
		}

		//Constructeur 
		public NormalEnclosure() {
			super();
			NormalEnclosure.wolfList = new ArrayList<Wolf>();
			NormalEnclosure.tigerList = new ArrayList<Tiger>();
			NormalEnclosure.bearList = new ArrayList<Bear>();
			setNbNormalEnclosure(getNbNormalEnclosure() + 1); //Compteur
		}

		//Constructeur avec paramètres
		public NormalEnclosure(String name, int areaEnclosure, TypeEnclosure eTypeEnclosure,
				CleanlinessDegree eCleanlinessDegree, int maxAnimal) {
			super(name, areaEnclosure, eTypeEnclosure, eCleanlinessDegree, maxAnimal);
			NormalEnclosure.wolfList = new ArrayList<Wolf>();
			NormalEnclosure.tigerList = new ArrayList<Tiger>();
			NormalEnclosure.bearList = new ArrayList<Bear>();
			setNbNormalEnclosure(getNbNormalEnclosure() + 1);
		}
		
		//Méthodes
		public void printCriteria() {
			System.out.println("L'enclos " + getName() + " à une surface de " + getAreaEnclosure() + ". Il est de type" + geteTypeEnclosure() + ". Son niveau de propreté est" + geteCleanlinessDegree() + ". Il pourra contenir au maximum" + getMaxAnimal() + "animaux");
		}
		
		//Ajout dans la liste d'un animal
		public Wolf addWolf(Wolf wolf) { 
			NormalEnclosure.wolfList.add(wolf);
			return wolf;
		}
		
		public Tiger addTiger(Tiger tiger) { 
			NormalEnclosure.tigerList.add(tiger);
			return tiger;
		}
		
		public Bear addBear(Bear bear) { 
			NormalEnclosure.bearList.add(bear);
			return bear;
		}
		
		//Methodes agissant sur les paramètres et objets animaux > pas besoin de créer d'objet pour les utiliser > static
		//Design pattern ou méthode void avec arguments et conditions dans la méthode à faire ici dans l'avenir pour éviter la répétition du code.
		//Optimisation nécessaire.
		
		//LOUPS
		public static void deleteWolf() {
			for (int i = 0; i < getWolfList().size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + getWolfList().get(i));
			}
			@SuppressWarnings("resource")
			Scanner scRemoveWolf = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à supprimer");
			int indexChoice = scRemoveWolf.nextInt();
			NormalEnclosure.wolfList.remove(getWolfList().get(indexChoice));
		}
		
		public static void feedWolf() {
			System.out.println("La liste des loups est la suivante :" + System.getProperty("line.separator"));
			for (int i = 0; i < wolfList.size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + wolfList.get(i));
			}
			@SuppressWarnings("resource")
			Scanner scFeedWolf = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à nourrir");
			int indexChoice = scFeedWolf.nextInt();
			Wolf target =wolfList.get(indexChoice);
			target.seteHunger(Hunger.HIGH);
		}
		
		public static void sleepingOrderWolf() {
			System.out.println("La liste des loups est la suivante :" + System.getProperty("line.separator"));
			for (int i = 0; i < wolfList.size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + wolfList.get(i));
			}
			@SuppressWarnings("resource")
			Scanner scFeedWolf = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à endormir");
			int indexChoice = scFeedWolf.nextInt();
			Wolf target =wolfList.get(indexChoice);
			target.seteSleeping(Sleeping.DOWN);
		}
		
		public static void sickingOrderWolf() {
			System.out.println("La liste des loups est la suivante :" + System.getProperty("line.separator"));
			for (int i = 0; i < wolfList.size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + wolfList.get(i));
			}
			@SuppressWarnings("resource")
			Scanner scFeedWolf = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à rendre malade");
			int indexChoice = scFeedWolf.nextInt();
			Wolf target =wolfList.get(indexChoice);
			target.seteHealth(Health.LOW);
		}
		
		//TIGRES
		public static void deleteTiger() {
			for (int i = 0; i < tigerList.size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + tigerList.get(i));
			}
			@SuppressWarnings("resource")
			Scanner scRemoveTiger = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à supprimer");
			int indexChoice = scRemoveTiger.nextInt();
			NormalEnclosure.tigerList.remove(tigerList.get(indexChoice));
		}
		
		public static void feedTiger() {
			System.out.println("La liste des loups est la suivante :" + System.getProperty("line.separator"));
			for (int i = 0; i < tigerList.size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + tigerList.get(i));
			}
			@SuppressWarnings("resource")
			Scanner scFeedTiger = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à nourrir");
			int indexChoice = scFeedTiger.nextInt();
			Tiger target =tigerList.get(indexChoice);
			target.seteHunger(Hunger.HIGH);
		}
		
		public static void sleepingOrderTiger() {
			System.out.println("La liste des tigres est la suivante :" + System.getProperty("line.separator"));
			for (int i = 0; i < tigerList.size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + tigerList.get(i));
			}
			@SuppressWarnings("resource")
			Scanner scFeedTiger = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à endormir");
			int indexChoice = scFeedTiger.nextInt();
			Tiger target =tigerList.get(indexChoice);
			target.seteSleeping(Sleeping.DOWN);
		}
		
		public static void sickingOrderTiger() {
			System.out.println("La liste des tigres est la suivante :" + System.getProperty("line.separator"));
			for (int i = 0; i < tigerList.size(); ++i) {
				System.out.println("En position du chiffre" + i + " :" + tigerList.get(i));
			}
			@SuppressWarnings("resource")
			Scanner scFeedTiger = new Scanner(System.in);
			System.out.println("Tapez le chiffre de l'animal à rendre malade");
			int indexChoice = scFeedTiger.nextInt();
			Tiger target =tigerList.get(indexChoice);
			target.seteHealth(Health.LOW);
		}
		
		//OURS
				public static void deleteBear() {
					for (int i = 0; i < bearList.size(); ++i) {
						System.out.println("En position du chiffre" + i + " :" + bearList.get(i));
					}
					@SuppressWarnings("resource")
					Scanner scRemoveBear = new Scanner(System.in);
					System.out.println("Tapez le chiffre de l'animal à supprimer");
					int indexChoice = scRemoveBear.nextInt();
					NormalEnclosure.bearList.remove(bearList.get(indexChoice));
				}
				
				public static void feedBear() {
					System.out.println("La liste des loups est la suivante :" + System.getProperty("line.separator"));
					for (int i = 0; i < bearList.size(); ++i) {
						System.out.println("En position du chiffre" + i + " :" + bearList.get(i));
					}
					@SuppressWarnings("resource")
					Scanner scFeedBear = new Scanner(System.in);
					System.out.println("Tapez le chiffre de l'animal à nourrir");
					int indexChoice = scFeedBear.nextInt();
					Bear target =bearList.get(indexChoice);
					target.seteHunger(Hunger.HIGH);
				}
				
				public static void sleepingOrderBear() {
					System.out.println("La liste des tigres est la suivante :" + System.getProperty("line.separator"));
					for (int i = 0; i < bearList.size(); ++i) {
						System.out.println("En position du chiffre" + i + " :" + bearList.get(i));
					}
					@SuppressWarnings("resource")
					Scanner scFeedBear = new Scanner(System.in);
					System.out.println("Tapez le chiffre de l'animal à endormir");
					int indexChoice = scFeedBear.nextInt();
					Bear target =bearList.get(indexChoice);
					target.seteSleeping(Sleeping.DOWN);
				}
				
				public static void sickingOrderBear() {
					System.out.println("La liste des tigres est la suivante :" + System.getProperty("line.separator"));
					for (int i = 0; i < bearList.size(); ++i) {
						System.out.println("En position du chiffre" + i + " :" + bearList.get(i));
					}
					@SuppressWarnings("resource")
					Scanner scFeedBear = new Scanner(System.in);
					System.out.println("Tapez le chiffre de l'animal à rendre malade");
					int indexChoice = scFeedBear.nextInt();
					Bear target =bearList.get(indexChoice);
					target.seteHealth(Health.LOW);
				}

		@Override
		public String toString() {
			return "NormalEnclosure [getName()=" + getName() + ", getAreaEnclosure()=" + getAreaEnclosure()
					+ ", geteTypeEnclosure()=" + geteTypeEnclosure() + ", geteCleanlinessDegree()="
					+ geteCleanlinessDegree() + ", getMaxAnimal()=" + getMaxAnimal() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		@Override
		public void printAnimalsCriteria() {
			System.out.println("Pour les enclos des ours :" + "\n" + getBearList() +"\n" + "Pour les enclos des loups :" + "\n" + getWolfList() + "\n" + "Pour les enclos des tigres" + "\n" + getTigerList() + "\n");
			
		}

		@Override
		public void addAnimal() {
			// Remplacé par des methodes add[type de l'animal]
			
		}

		@Override
		public void deleteAnimal() {
			// Remplacé par des methodes delete[type de l'animal]
			
		}

		@Override
		public void cleanEnclosure() {
			this.seteCleanlinessDegree(CleanlinessDegree.GOOD);
			
		}

		public static int getNbNormalEnclosure() {
			return nbNormalEnclosure;
		}

		private static void setNbNormalEnclosure(int nbNormalEnclosure) {
			NormalEnclosure.nbNormalEnclosure = nbNormalEnclosure;
		}

		public int getMax() {
			return max;
		}

		public void setMax(int max) {
			this.max = max;
		}
		
}
