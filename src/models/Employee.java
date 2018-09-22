package models;

import java.util.ArrayList;

public class Employee {
		//Liste
		public enum SexEmployee{M, F}
		

		//Attributs
		private String name;
		private SexEmployee eSexEmployee;
		private String age; //Nous avons mis un string car nous partons du principe que l'utilisateur peut saisir n'importe quoi autre que des chiffres
		private String printSexEmployee;
		
		private static int numberOfEmployee = 0; //Attribut de classe et non d'instance > commun à tous les objets crées de cette classe
		
		
		//Methodes
		public void examineEnclosure() { 
			
		} //Examine l'enclos [affiche caractéristiques de l'enclos] + [affiche la liste des animaux]
		
		public void cleanEnclosure() {
			
		} //Nettoyer l'enclos
		
		public void feedAnimalEnclosure() {
			
		} //Nourrit les animaux d'un enclos
		
		public void transfertEnclosure() {
			
		} //Transfert les animaux  d'un enclos à un autre
		
		public void presenteEmployee() { // a effacer ensuite
			System.out.println("je vous présente l'employé" + getName());
		}
		
		//Méthode permettant pour une saisie utilisateur de sortir les caractères et de laisser uniquement des chiffres
		//Quand on lui demandera son age si il saisit autres choses que des chiffres on les sort
		public static int[] getIntegers(String str) {
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    //découper la phrase en mots
		    String[] splited = str.split(" ");
		    //parcourir les mots
		    for (String current : splited) {
		        try {
		            //tenter de convertir le mot en int
		            int parsedInt = Integer.parseInt (current);
		            //ajouter l Integer à la list
		            list.add(parsedInt);                    //un "auto boxing", une instance de Integer est créée à partir d'un int
		        } catch (NumberFormatException e) {
		            //c est pas un int
		        }
		    }
		    //construire le résultat
		     int[] result = new int[list.size()];
		    for (int i = 0 ; i < list.size() ; i++) {
		        //parcourir la list de Integer créée
		        result[i] = list.get(i);
		    }
		    return result;
		}
		
		
		
		public void setSex(SexEmployee sex) {
			this.seteSexEmployee(sex);
			if (sex.equals(SexEmployee.M)) {
				this.setPrintSexEmployee("un garçon");
			} else {
				this.setPrintSexEmployee("une fille");
			}
			 
		}

		//Getters
		public String getName() {
			return name;
		}

		public SexEmployee geteSexEmployee() {
			return eSexEmployee;
		}

		public String getAge() {
			return age;
		}
		
		public String getPrintSexEmployee() {
			return printSexEmployee;
		}

		//Setters
		public void setName(String name) {
			this.name = name;
		}

		public void seteSexEmployee(SexEmployee eSexEmployee) {
			this.eSexEmployee = eSexEmployee;
		}

		public void setAge(String string) {
			this.age = string;
		}
		
		public void setPrintSexEmployee(String printSexEmployee) {
			this.printSexEmployee = printSexEmployee;
		}
		
		
		//Constructeurs
		public Employee() {
			// TODO Auto-generated constructor stub
			numberOfEmployee++;
		}

		public Employee(String name, SexEmployee eSexEmployee, String age) {
			super();
			this.name = name;
			this.eSexEmployee = eSexEmployee;
			this.age = age;
			numberOfEmployee++; //Incrementation de l'attribut de classe à chaque ajout à placer ds chaque constructeurs.
		}
		
		public Employee(String name, SexEmployee eSexEmployee) {
			super();
			this.name = name;
			this.eSexEmployee = eSexEmployee;
			this.age = "30 ans";
			numberOfEmployee++;
		}

		@Override
		public String toString() {
			return "Employee [name =" + name + ", eSexEmployee=" + eSexEmployee + ", age=" + age + "]";
		}

		//Accesseur de l'attribut de classe > Setter non necessaire on a pas a le modifier de l'exterieur
		//Static car méthode de classe n'utilisant que des attribut de classe et non d'instance.
		public static int getNumberOfEmployee() {
			return numberOfEmployee;
		}
		
		
		
}
