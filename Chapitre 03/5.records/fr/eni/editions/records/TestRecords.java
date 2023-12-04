package fr.eni.editions.records;

public class TestRecords {
	record RecordPersonne(String nom, int age) /*implements Comparable<RecordPersonne>*/{
		//Constructeur
		RecordPersonne(String nom, int age) {
			this.nom=nom;
			this.age=age;
		}
		//ajout de méthodes éventuelles
		/*
		@Override
		public int compareTo(RecordPersonne o) {
			// TODO Auto-generated method stub
			return 0;
		}*/
	};
	
	public static void main(String[] args) {
		RecordPersonne rp = new RecordPersonne("NomDeLaPersonne", 43);
		//Utilisation des variables membres implicites:
		System.out.println(rp.nom);
		System.out.println(rp.age);
		//Utilisation des getters implicites:
		System.out.println(rp.nom());
		System.out.println(rp.age());
		//Utilisation de la méthode toString:
		System.out.println(rp.toString());
	}
}
