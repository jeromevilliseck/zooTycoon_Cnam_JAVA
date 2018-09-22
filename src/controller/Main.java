package controller;

import java.util.*;

import models.*;
import models.Animal.*;
import models.AquaticEnclosure.SalinityWater;
import models.AviaryEnclosure.Roof;
import models.Employee.SexEmployee;
import models.GeneralEnclosure.CleanlinessDegree;
import models.GeneralEnclosure.TypeEnclosure;

/**
 * @author Jerome Villiseck
 * @version 1.0
 * @since Java 1.7
 * @name ZooTycoon
 */

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Fonction de Retour à la ligne dans les system out print
		String Newline = System.getProperty("line.separator");

		// Creation de l'employe
		Employee employee1 = new Employee();
		// Instanciation de l'objet sans valeurs définies sur les attributs
		// (constructeur vide de défaut)

		// Creation du zoo
		Zoo yourZoo = new Zoo();
		// Creation de l'objet yourZoo avec des valeurs sur les attributs non
		// définies (il va falloir utiliser accesseurs et mutateurs)

		// Creation des enclos sous forme de librairies crées avec la factory.
		// (Pour une question de gain de temps en méthodes type i/o (scanner sur
		// chaque attribut dans la factory puis switch case), les enclos ne
		// seront pas à la
		// main de l'utilisateur en creation suppression ici)

		// ENCLOS TERRESTRES <<< 3
		GeneralEnclosure wolfEnclosureLibrairy = EnclosureFactory.create("enclos des loups", ((int)(Math.random()* ((500 - 100) + 1))),
				TypeEnclosure.STANDARD, CleanlinessDegree.GOOD, 10);
		GeneralEnclosure.addEnclosure(
				wolfEnclosureLibrairy); /*
				 * Ajout dans la liste d'instance
				 * (static) de general enclosure
				 */

		GeneralEnclosure tigerEnclosureLibrairy = EnclosureFactory.create("enclos des tigres", 300,
				TypeEnclosure.STANDARD, CleanlinessDegree.BAD, 5);
		GeneralEnclosure.addEnclosure(tigerEnclosureLibrairy);

		GeneralEnclosure bearEnclosureLibrairy = EnclosureFactory.create("enclos des ours", 230, TypeEnclosure.STANDARD,
				CleanlinessDegree.GOOD, 6);
		GeneralEnclosure.addEnclosure(bearEnclosureLibrairy);

		// ENCLOS AQUATIQUES <<< 4
		GeneralEnclosure goldFishEnclosureLibrairy = EnclosureFactory.create("bassin des poissons rouges", 100,
				TypeEnclosure.AQUATIC, CleanlinessDegree.GOOD, 65);
		((AquaticEnclosure) goldFishEnclosureLibrairy).setBasinDepth(300);
		((AquaticEnclosure) goldFishEnclosureLibrairy).seteSalinityWater(SalinityWater.GOOD);
		GeneralEnclosure.addEnclosure(goldFishEnclosureLibrairy);

		GeneralEnclosure penguinEnclosureLibrairy = EnclosureFactory.create("bassin des pengouins", 450,
				TypeEnclosure.AQUATIC, CleanlinessDegree.GOOD, 20);
		((AquaticEnclosure) penguinEnclosureLibrairy).setBasinDepth(500);
		((AquaticEnclosure) penguinEnclosureLibrairy).seteSalinityWater(SalinityWater.BAD);
		GeneralEnclosure.addEnclosure(penguinEnclosureLibrairy);

		GeneralEnclosure sharkEnclosureLibrairy = EnclosureFactory.create("bassin des requins", 1090,
				TypeEnclosure.AQUATIC, CleanlinessDegree.GOOD, 9);
		((AquaticEnclosure) sharkEnclosureLibrairy).setBasinDepth(2000);
		((AquaticEnclosure) sharkEnclosureLibrairy).seteSalinityWater(SalinityWater.GOOD);
		GeneralEnclosure.addEnclosure(sharkEnclosureLibrairy);

		GeneralEnclosure whaleEnclosureLibrairy = EnclosureFactory.create("bassin des baleines", 67800,
				TypeEnclosure.AQUATIC, CleanlinessDegree.BAD, 300);
		((AquaticEnclosure) whaleEnclosureLibrairy).setBasinDepth(56000);
		((AquaticEnclosure) whaleEnclosureLibrairy).seteSalinityWater(SalinityWater.GOOD);
		GeneralEnclosure.addEnclosure(whaleEnclosureLibrairy);

		// ENCLOS AERIENS <<< 1
		GeneralEnclosure eagleEnclosureLibrairy = new AviaryEnclosure();
		((AviaryEnclosure) eagleEnclosureLibrairy).seteRoof(Roof.GOOD);
		GeneralEnclosure.addEnclosure(eagleEnclosureLibrairy);

		// Scanner pour le nom du zoo
		Scanner scNameZoo = new Scanner(System.in);
		// Objet scNameZoo instancié avec la classe Scanner (InputStream
		// méthode)
		System.out.println("Veuillez saisir le nom de votre zoo :");
		// AFFICHAGE CONSOLE DEMANDE DE SAISIE
		yourZoo.setZooName(scNameZoo.nextLine());
		/*
		 * Mutateur de l'attribut ZooName (classe Zoo) de l'objet yourZoo
		 * prenant en parametres la méthode nextLine de l'objet scNameZoo
		 */

		// Nom de l'employe
		Scanner scNameEmployee = new Scanner(System.in);
		System.out.println(Newline + "Quel nom pour votre employé ? ");
		employee1.setName(scNameEmployee.nextLine());

		// Sexe de l'employe
		Scanner scSexEmployee = new Scanner(System.in);
		System.out.println(Newline + "Est-ce un Garçon (saisir M) ou une Fille (saisir F) ? ");
		String userChoice = scSexEmployee.nextLine();
		if (userChoice.equals("M")) {
			employee1.setSex(SexEmployee.M);
		} else if (userChoice.equals("F")) {
			employee1.setSex(SexEmployee.F);
		} else
			employee1.setSex(SexEmployee.M);

		// Age de l'employe
		Scanner scAgeEmployee = new Scanner(System.in);
		System.out.println(Newline + "Et que âge a t'il ?");
		String recuperationSaisie = scAgeEmployee.nextLine();
		int[] result = Employee.getIntegers(recuperationSaisie);
		for (int y : result) {
			employee1.setAge(y + "ans");
		}

		// Affichage du nom du zoo et de l'employee
		System.out.println(Newline);
		yourZoo.printZooName("1.0");
		// En paramètre de la fonction la version de l'application.
		System.out.println("Vous aller diriger " + Employee.getNumberOfEmployee() + " employé(s) qui s'appelle "
				+ employee1.getName() + ", agé(e) de " + employee1.getAge() + " et qui est "
				+ employee1.getPrintSexEmployee() + ".");

		/**
		 * Affichage des caractéristiques des enclos existants
		 * 
		 * @param Constante
		 *            de la classe
		 * @return Nb d'enclos existants
		 * @since JDK [Version à ne mettre que spécifiquement pour des
		 *        fonctionnalités dans les montées de version]
		 */
		System.out.println("Le nombre maximal d'enclos que vous aller pouvoir gérer est de"
				+ Zoo.getMaxNumberEnclosures() + " enclos." + Newline);
		// Aurait pu être remplacé par
		// System.out.println(GeneralEnclosure.getGeneralEnclosuresList().size());

		// Système de menu
		int systemCount = 0;
		do {

			Scanner scNumberSelect = new Scanner(System.in);
			System.out.println("Que souhaitez vous faire ?" + Newline + "[1] Afficher nombre des animaux du zoo"
					+ Newline + "[2] Afficher nombre des animaux du zoo détaillée par type et sexe" + Newline
					+ "[3] Afficher nombre d'enclos" + Newline
					+ "[4] Afficher les enclos de manière détaillée avec leurs caractéristiques" + Newline
					+ "[5] Modifier les caracteristiques d'un animal" + Newline + "[6] Nettoyer un enclos sale"
					+ Newline + "[7] Créer un nouvel animal");
			int userMenuChoice = scNumberSelect.nextInt();
			switch (userMenuChoice) {
			case 1:
				System.out.println(Newline + yourZoo.getNumberAnimals());
				break; // Methode de type int avec return
			case 2:
				yourZoo.numberAnimalsControlDetailed();
				break; // Methode de type void de part la condition incluse
				// dedans.
			case 3:
				System.out.println(Newline + "Les enclos présents sont :" + Newline + "Enclos de type terrestre : "
						+ yourZoo.numberNormalEnclosures() + "unités." + Newline + "Enclos de type aquatique : "
						+ yourZoo.numberAviaryEnclosures() + "unités." + Newline + "Enclos de type volière : "
						+ yourZoo.numberAviaryEnclosures() + "unités.");
				break;
			case 4:
				for (int x = 0; x < GeneralEnclosure.getGeneralEnclosuresList().size(); ++x) {
					System.out.println(Newline + "Enclos n° " + (x + 1) + Newline
							+ GeneralEnclosure.getGeneralEnclosuresList().get(x));
				}
			case 7:
				System.out.println("Création d'un nouvel animal");

				// Creation d'animaux
				Scanner scNumberCreateAnimal = new Scanner(System.in);
				System.out.println("Combien d'animaux voulez-vous créer ?");
				int numberCreateAnimalChoiceUser = scNumberCreateAnimal.nextInt();
				for (int y = 0; y < numberCreateAnimalChoiceUser; ++y) {

					Scanner scUserCreateAnimalType = new Scanner(System.in);
					System.out.println("Selectionnez son type en tapant sur la touche : " + Newline + "1-> Loup"
							+ Newline + "2-> Baleine" + Newline + "3-> Tigre" + Newline + "4-> Requin" + Newline
							+ "5-> Pengouin " + Newline + "6-> Poisson rouge " + Newline + "7-> Aigle" + Newline
							+ "8-> Ours ");
					int animalTypeChoiceUser = scUserCreateAnimalType.nextInt();

					Scanner scUserCreateAnimalName = new Scanner(System.in);
					System.out.println("Tapez son nom");
					String animalNameChoiceUser = scUserCreateAnimalName.nextLine();

					Scanner scUserCreateAnimalSex = new Scanner(System.in);
					System.out.println("Tapez son sexe (M ou F)");
					String animalSexChoiceUser = scUserCreateAnimalSex.nextLine().toUpperCase();
					while (!(animalSexChoiceUser.equals("M") || animalSexChoiceUser.equals("F"))) {
						System.out.println("Tu t'es trompé recommence (M ou F)");
						animalSexChoiceUser = scUserCreateAnimalSex.nextLine().toUpperCase();
					}

					Sex SexCreateAnimal = null;
					switch (animalSexChoiceUser) {
					case "F":
						SexCreateAnimal = Sex.F;break;
					case "M":
						SexCreateAnimal = Sex.M;break;
					}

					Scanner scUserCreateAnimalWeight = new Scanner(System.in);
					System.out.println("Tapez son poids");
					int animalWeightChoiceUser = scUserCreateAnimalWeight.nextInt();

					Scanner scUserCreateAnimalHeight = new Scanner(System.in);
					System.out.println("Tapez sa taille");
					int animalHeightChoiceUser = scUserCreateAnimalHeight.nextInt();

					Scanner scUserCreateAnimalOld = new Scanner(System.in);
					System.out.println("Tapez son age");
					int animalOldChoiceUser = scUserCreateAnimalOld.nextInt();

					Scanner scUserCreateAnimalHunger = new Scanner(System.in);
					System.out.println("Quel est son niveau de faim ?" + Newline + "Pour bas tapez 1" + Newline
							+ "Pour moyen tapez 2" + Newline + "Pour haut tapez 3");
					Hunger animalHungerChoiceUser = null;
					switch (scUserCreateAnimalHunger.nextInt()) {
					case '1':
						animalHungerChoiceUser = Hunger.LOW;
						break;
					case '2':
						animalHungerChoiceUser = Hunger.MEDIUM;
						break;
					case '3':
						animalHungerChoiceUser = Hunger.HIGH;
						break;
					}

					Scanner scUserCreateAnimalSleeping = new Scanner(System.in);
					System.out.println("Il est éveillé ou il dors ?" + Newline + "Pour l'éveiller tapez 1" + Newline
							+ "Pour l'endormir tapez 2");
					Sleeping animalSleepingChoiceUser = null;
					switch (scUserCreateAnimalSleeping.nextInt()) {
					case '1':
						animalSleepingChoiceUser = Sleeping.UP;
						break;
					case '2':
						animalSleepingChoiceUser = Sleeping.DOWN;
						break;
					}

					Scanner scUserCreateAnimalHealth = new Scanner(System.in);
					System.out.println("Quel est son niveau de santé ?" + Newline + "Bas tapez 1" + Newline
							+ "Moyen tapez 2" + Newline + "Haut tapez 3");
					Health animalHealthChoiceUser = null;
					switch (scUserCreateAnimalHealth.nextInt()) {
					case '1':
						animalHealthChoiceUser = Health.LOW;
						break;
					case '2':
						animalHealthChoiceUser = Health.MEDIUM;
						break;
					case '3':
						animalHealthChoiceUser = Health.HIGH;
						break;
					}

					// En fonction du type d'animal saisi (touche 1 à 8) par
					// l'utilisateur, le switch va creer un animal du type
					// corespondant
					// et le placer dans une ArrayList, crée depuis les 3
					// classes
					// enclosures de chaque type
					switch (animalTypeChoiceUser) {
					case 1:

						Wolf temp0 = Wolf.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser); // Creation
						// en
						// passant
						// par
						// le
						// design
						// pattern

						((NormalEnclosure) wolfEnclosureLibrairy).addWolf(temp0); // ajout
						// de
						// l'objet
						// dans
						// la
						// bibliothèque
						// correspondant
						// à
						// son
						// type.
						// Les
						// 2
						// opérations
						// aurait
						// pu
						// être
						// groupées
						// en
						// une
						// mais
						// sont
						// laissées
						// séparées
						// pour
						// plus
						// de
						// clarté.

						break;

					case 2:

						Whale temp1 = Whale.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser);

						((AquaticEnclosure) whaleEnclosureLibrairy).addWhale(temp1);
						System.out.println(whaleEnclosureLibrairy);

						break;

					case 3:

						Tiger temp2 = Tiger.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser);

						((NormalEnclosure) tigerEnclosureLibrairy).addTiger(temp2);
						System.out.println(tigerEnclosureLibrairy);

						break;

					case 4:

						Shark temp3 = Shark.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser);

						((AquaticEnclosure) sharkEnclosureLibrairy).addShark(temp3);

						break;

					case 5:

						Penguin temp4 = Penguin.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser);

						((AquaticEnclosure) penguinEnclosureLibrairy).addPenguin(temp4);

						break;

					case 6:

						GoldFish temp5 = GoldFish.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser);

						((AquaticEnclosure) goldFishEnclosureLibrairy).addGoldFish(temp5);

						break;

					case 7:

						Eagle temp6 = Eagle.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser);

						((AviaryEnclosure) eagleEnclosureLibrairy).addEagle(temp6);

						break;

					case 8:

						Bear temp7 = Bear.create(animalNameChoiceUser, SexCreateAnimal, animalWeightChoiceUser,
								animalHeightChoiceUser, animalOldChoiceUser, animalHungerChoiceUser,
								animalSleepingChoiceUser, animalHealthChoiceUser);

						((NormalEnclosure) bearEnclosureLibrairy).addBear(temp7);

						break;

					} // END_SWITCH (animalTypeChoiceUser)

				} // END_FOR

				break;

			case 5: // Boucle dans l'avenir avec variables locales
				System.out.println("Modification d'un animal existant" + Newline);
				Scanner scUserAnimalModifyChoice = new Scanner(System.in);
				System.out.println("Quel type d'animal souhaitez-vous modifiez ?" + Newline + "TERRE" + Newline
						+ Newline + "1 <<< LOUPS" + Newline + "2 <<< TIGRES" + Newline + "3 <<< OURS" + Newline
						+ "AQUATIQUE" + Newline + "4 <<< POISSONS ROUGE" + Newline + "5 <<< REQUINS" + Newline
						+ "6 <<< PENGUINS" + Newline + "7 <<< BALEINES" + Newline + "8 <<< AIGLES");
				int userAnimalModifyChoice = scUserAnimalModifyChoice.nextInt();
				switch (userAnimalModifyChoice) {
				case 1:
					Scanner scUserAnimalModifyChoice1 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice1 = scUserAnimalModifyChoice1.nextInt();
					switch (userAnimalModifyChoice1) {
					case 1:
						NormalEnclosure.deleteWolf();
						break;
					case 2:
						NormalEnclosure.feedWolf();
						break;
					case 3:
						NormalEnclosure.sleepingOrderWolf();
						break;
					case 4:
						NormalEnclosure.sickingOrderWolf();
						break;
					}
					break;

				case 2:
					Scanner scUserAnimalModifyChoice2 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice2 = scUserAnimalModifyChoice2.nextInt();
					switch (userAnimalModifyChoice2) {
					case 1:
						NormalEnclosure.deleteTiger();
						break;
					case 2:
						NormalEnclosure.feedTiger();
						break;
					case 3:
						NormalEnclosure.sleepingOrderTiger();
						break;
					case 4:
						NormalEnclosure.sickingOrderTiger();
						break;
					}
					break;
				case 3:
					Scanner scUserAnimalModifyChoice3 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice3 = scUserAnimalModifyChoice3.nextInt();
					switch (userAnimalModifyChoice3) {
					case 1:
						NormalEnclosure.deleteBear();
						break;
					case 2:
						NormalEnclosure.feedBear();
						break;
					case 3:
						NormalEnclosure.sleepingOrderBear();
						break;
					case 4:
						NormalEnclosure.sickingOrderBear();
						break;
					}
					break;
				case 4:
					Scanner scUserAnimalModifyChoice4 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice4 = scUserAnimalModifyChoice4.nextInt();
					switch (userAnimalModifyChoice4) {
					case 1:
						AquaticEnclosure.deleteGoldFish();
						break;
					case 2:
						AquaticEnclosure.feedGoldFish();
						break;
					case 3:
						AquaticEnclosure.sleepingOrderGoldFish();
						break;
					case 4:
						AquaticEnclosure.sickingOrderGoldFish();
						break;
					}
				case 5:
					Scanner scUserAnimalModifyChoice5 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice5 = scUserAnimalModifyChoice5.nextInt();
					switch (userAnimalModifyChoice5) {
					case 1:
						AquaticEnclosure.deleteShark();
						break;
					case 2:
						AquaticEnclosure.feedShark();
						break;
					case 3:
						AquaticEnclosure.sleepingOrderShark();
						break;
					case 4:
						AquaticEnclosure.sickingOrderShark();
						break;
					}
				case 6:
					Scanner scUserAnimalModifyChoice6 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice6 = scUserAnimalModifyChoice6.nextInt();
					switch (userAnimalModifyChoice6) {
					case 1:
						AquaticEnclosure.deletePenguin();
						break;
					case 2:
						AquaticEnclosure.feedPenguin();
						break;
					case 3:
						AquaticEnclosure.sleepingOrderPenguin();
						break;
					case 4:
						AquaticEnclosure.sickingOrderPenguin();
						break;
					}
				case 7:
					Scanner scUserAnimalModifyChoice7 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice7 = scUserAnimalModifyChoice7.nextInt();
					switch (userAnimalModifyChoice7) {
					case 1:
						AquaticEnclosure.deleteWhale();
						break;
					case 2:
						AquaticEnclosure.feedWhale();
						break;
					case 3:
						AquaticEnclosure.sleepingOrderWhale();
						break;
					case 4:
						AquaticEnclosure.sickingOrderWhale();
						break;
					}
					break;
				case 8:
					Scanner scUserAnimalModifyChoice8 = new Scanner(System.in);
					System.out.println("Et quel action souhaitez-vous faire ?" + Newline + "1 <<< Supprimer un animal"
							+ Newline + "2 <<< Nourrir un animal" + Newline + "3 <<< Endormir un animal" + Newline
							+ "4 <<< Rendre un animal malade");
					int userAnimalModifyChoice8 = scUserAnimalModifyChoice8.nextInt();
					switch (userAnimalModifyChoice8) {
					case 1:
						System.out.println("methode a écrire");
						break;
					case 2:
						System.out.println("methode a écrire");
						break;
					case 3:
						System.out.println("methode a écrire");
						break;
					case 4:
						System.out.println("methode a écrire");
						break;
					}
					break;
				}
				break;

			case 6:
				for (int a = 0; a < GeneralEnclosure.getGeneralEnclosuresList().size(); ++a) {
					System.out.println(Newline + "Enclos n° " + (a + 1) + Newline
							+ GeneralEnclosure.getGeneralEnclosuresList().get(a));
				}
				Scanner scCleanChoice = new Scanner(System.in);
				System.out.println("Quel enclos voulez vous nettoyer ?");
				int userCleanChoice = scCleanChoice.nextInt();
				switch (userCleanChoice) {
				case 1:
					GeneralEnclosure.setCleanEnclosure(wolfEnclosureLibrairy, (userCleanChoice - 1));
					break;
				case 2:
					GeneralEnclosure.setCleanEnclosure(tigerEnclosureLibrairy, (userCleanChoice - 1));
					break;
				case 3:
					GeneralEnclosure.setCleanEnclosure(bearEnclosureLibrairy, (userCleanChoice - 1));
					break;
				case 4:
					GeneralEnclosure.setCleanEnclosure(goldFishEnclosureLibrairy, (userCleanChoice - 1));
					break;
				case 5:
					GeneralEnclosure.setCleanEnclosure(sharkEnclosureLibrairy, (userCleanChoice - 1));
					break;
				case 6:
					GeneralEnclosure.setCleanEnclosure(penguinEnclosureLibrairy, (userCleanChoice - 1));
					break;
				case 7:
					GeneralEnclosure.setCleanEnclosure(whaleEnclosureLibrairy, (userCleanChoice - 1));
					break;
				case 8:
					GeneralEnclosure.setCleanEnclosure(eagleEnclosureLibrairy, (userCleanChoice - 1));
					break;
				}
				break;

			} // END_SWITCH (userMenuChoice)

		} while (systemCount < 100);

	} // END_METHODE MAIN

} // END_CLASS
