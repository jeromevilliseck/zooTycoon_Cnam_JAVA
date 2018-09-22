package models;

public class EnclosureFactory {
	
	//Conditions permettant en fonction du type [ici aquatic ou aviary ou standard] passé en paramètre de créer un objet permettant de passer des paramètres différents propres à la classe
	public static GeneralEnclosure create(String name, int areaEnclosure, GeneralEnclosure.TypeEnclosure eTypeEnclosure, GeneralEnclosure.CleanlinessDegree eCleanlinessDegree, int maxAnimal) {
		if (eTypeEnclosure == GeneralEnclosure.TypeEnclosure.STANDARD) {
			return new NormalEnclosure(name, areaEnclosure, eTypeEnclosure, eCleanlinessDegree, maxAnimal);
		} else if (eTypeEnclosure == GeneralEnclosure.TypeEnclosure.AVIARY) {
			return new AviaryEnclosure(name, areaEnclosure,  eTypeEnclosure,  eCleanlinessDegree, maxAnimal);
		} else {
			return new AquaticEnclosure(name, areaEnclosure,  eTypeEnclosure,  eCleanlinessDegree, maxAnimal);
		}
			
	}
	
	//Constructeurs
	private EnclosureFactory() {
		super();
	}
	
}
