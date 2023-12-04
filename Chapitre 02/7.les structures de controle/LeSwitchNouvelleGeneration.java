
public class LeSwitchNouvelleGeneration {
		public static void main(String[] args) {
			Jour unJour = Jour.DIMANCHE;
			switch (unJour) {
			case LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI 
						-> System.out.println("On est en semaine");
			case SAMEDI, DIMANCHE 
						-> System.out.println("On est en week-end");
			}
			
			
			int typeJour = switch(unJour) {
			case LUNDI, MARDI, MERCREDI, JEUDI, VENDREDI 
						-> 0;
			case SAMEDI, DIMANCHE 
						-> 1;
			};
			System.out.println(typeJour);
			
			int typeJourSiContientUnM = switch(unJour) {
				case MARDI, MERCREDI, SAMEDI, DIMANCHE -> {
					if(unJour==Jour.MARDI || unJour==Jour.MERCREDI) {
						yield 0;
					}
					else {
						yield 1;
					}
				}
				default -> -1;
			};
			System.out.println(typeJourSiContientUnM);
		}
}
