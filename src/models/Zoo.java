package models;

public class Zoo {
	
		// Fonction de Retour à la ligne dans les system out print
		public String Newline = System.getProperty("line.separator");
	
		//Attributs
		private String zooName; //Nom du zoo
		private final static int MAX_NUMBER_ENCLOSURES = 8; //Nombre maximal d'enclos [contrainte de nombre]
		
		//Méthodes
		
		//Affiche le nombre d'animaux présents dans le zoo
		public void animalsInTheZoo() {
			System.out.println("Sont actuellement présent dans le zoo :");
		} //
		
		//Message de bienvenue dans le zoo
		public void printZooName(String versionZoo) {
			System.out.println("Bienvenue dans le zoo " + zooName + " (version "+ versionZoo +").");
		}

		//Getters
		public String getZooName() {
			return zooName;
		}

		//Getters sur la constante
		public static int getMaxNumberEnclosures() {
			return MAX_NUMBER_ENCLOSURES;
		}

		

		//Setters
		public void setZooName(String zooName) {
			this.zooName = zooName;
		}

		

		
		//Constructeurs
		public Zoo() {
			super();
		}

		public Zoo(String zooName, int existingEnclosures) {
			super();
			this.zooName = zooName;
		}
		
		//Comptage de l'ensemble des animaux du zoo
		public int getNumberAnimals() {
			return WolfMale.getNbWolfMale() + WolfFemale.getNbWolfFemale() + WhaleMale.getNbWhaleMale() + WhaleFemale.getNbWhaleFemale() + TigerMale.getNbTigerMale() + TigerFemale.getNbTigerFemale() + SharkMale.getNbSharkmale() + SharkFemale.getNbSharkFemale() + PenguinMale.getNbPenguinMale() + PenguinFemale.getNbPenguinFemale() + GoldFishMale.getNbGoldFishMale() + GoldFishFemale.getGiveLifeTime() + EagleMale.getNbEagleMale() + EagleFemale.getNbEagleFemale() + BearMale.getNbBearMale() + BearFemale.getNbBearFemale();
		}
		
		//Condition pour afficher un message si le Zoo est vide ou impression du total
		public void numberAnimalsControl() {
			Zoo test = new Zoo();
			if (test.getNumberAnimals() == 0) {
				System.out.println("Votre Zoo est vide !");
			}
			else {
				System.out.println(getNumberAnimals());
			}
		}
		
		//Condition avec affichage du nombre d'animaux dans le zoo par types d'animaux
		public void numberAnimalsControlDetailed() {
			Zoo test = new Zoo();
			if (test.getNumberAnimals() == 0) {
				System.out.println("Votre Zoo est vide !");
			}
			else {
				System.out.println("Loups males : " + WolfMale.getNbWolfMale() + Newline + "Loups femelles : " + WolfFemale.getNbWolfFemale() + Newline + "Baleines males : " + Newline + WhaleMale.getNbWhaleMale() + Newline + "Baleines femelles : " + WhaleFemale.getNbWhaleFemale() + Newline + "Tigres males : " + TigerMale.getNbTigerMale() + Newline + "Tigres femelles : " + TigerFemale.getNbTigerFemale() + Newline + "Requins males : " + SharkMale.getNbSharkmale() + Newline + "Requins Femelles : " + SharkFemale.getNbSharkFemale() + Newline + "Penguins Males : " + PenguinMale.getNbPenguinMale() + Newline + "Penguins femelles : " + PenguinFemale.getNbPenguinFemale() + Newline + "Poissons males : " + GoldFishMale.getNbGoldFishMale() + Newline + "Poissons rouges femelles" + GoldFishFemale.getNbGoldFishFemale() + Newline + "Aigles males : " + EagleMale.getNbEagleMale() + Newline + "Aigles femelles : " + EagleFemale.getNbEagleFemale() + Newline + "Ours males : " + BearMale.getNbBearMale() + Newline + "Ours femelles" + BearFemale.getNbBearFemale() + Newline);
			}
		}
		
		//Recuperation du nombre d 'enclos type Normal
		public int numberNormalEnclosures() {
			return NormalEnclosure.getNbNormalEnclosure();
		}
		
		//Recuperation du nombre d 'enclos type Aquarium
		public int numberAquaticEnclosures() {
			return AquaticEnclosure.getNbAquaticEnclosure();
		}
		
		//Recuperation du nombre d'enclos type Voliere
		public int numberAviaryEnclosures() {
			return AviaryEnclosure.getNbAviaryEnclosure();
		}
		
		//Recuperation du nombre total d'enclos
		public int numberTotalEnclosures() {
			return NormalEnclosure.getNbNormalEnclosure() + AquaticEnclosure.getNbAquaticEnclosure() + AviaryEnclosure.getNbAviaryEnclosure();
		}
		
		
}
