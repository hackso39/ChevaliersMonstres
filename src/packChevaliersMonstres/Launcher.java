package packChevaliersMonstres;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

	private static final int ZERO_POINT_DE_VIE = 0;

	public static void main(String[] args) {
		
		Chevaliers fred = new Chevaliers("Martin", "Frederic", "Duc", 47, 100, 100);
		Chevaliers chris = new Chevaliers("Dupont", "Christophe", "LeToutPuissant", 26, 100, 100);
		Ecuyers yann = new Ecuyers("Henri","Yann", 30, 100, 100);
		Ecuyers florian = new Ecuyers("Cassepied","Florian", 33, 100, 100);
		Dragons feu = new Dragons("Feu", 300);
		Dragons glace = new Dragons("Glace", 500);
		
		List<Chevaliers> listeChevaliers = new ArrayList<Chevaliers>();
		listeChevaliers.add(fred);
		listeChevaliers.add(chris);

		List<Ecuyers> listeEcuyers = new ArrayList<Ecuyers>();
		listeEcuyers.add(yann);
		//listeEcuyers.add(florian);
		
		List<Combattant> listeCombatants = new ArrayList<Combattant>();
		listeCombatants.addAll(listeChevaliers);
		listeCombatants.addAll(listeEcuyers);
		combattre(listeCombatants, feu);
		
		combattre(listeCombatants, florian);
		
	}
	
	private static void combattre(List<Combattant> listeCombatants, Dragons dragon) {
		
		System.out.println("Le Dragon : " + dragon.getNom() + ", possède : " + dragon.getPointsDevie() + " point(s) de vie !");
		
		while(dragon.getPointsDevie() > ZERO_POINT_DE_VIE) {
			
			for(int i = 0 ; i < listeCombatants.size() ; i++) {
				if(dragon.getPointsDevie() > ZERO_POINT_DE_VIE) {
					System.out.println(listeCombatants.get(i).   getPrenom() + " tape le Dragon");
					dragon.setPointsDevie(dragon.getPointsDevie() - listeCombatants.get(i).getPointsDAttaque());
					System.out.println("Le Dragon possède : " + dragon.getPointsDevie() + " point(s) de vie !");
					if(dragon.getPointsDevie() <= ZERO_POINT_DE_VIE) {
						System.out.println("Le Dragon : " + dragon.getNom() + " est mort !!!");
					}
				}
			}
		}
	}
	
	private static void combattre(List<Combattant> listeCombatants, Combattant combattant) {
		
		System.out.println("Le combattant : " + combattant.getNom() + ", possède : " + combattant.getPointsDeVie() + " point(s) de vie !");
		
		while(combattant.getPointsDeVie() > ZERO_POINT_DE_VIE) {
			
			for(int i = 0 ; i < listeCombatants.size() ; i++) {
				if(combattant.getPointsDeVie() > ZERO_POINT_DE_VIE) {
					System.out.println(listeCombatants.get(i).   getPrenom() + " tape le combattant");
					combattant.setPointsDeVie(combattant.getPointsDeVie() - listeCombatants.get(i).getPointsDAttaque());
					System.out.println("Le combattant possède : " + combattant.getPointsDeVie() + " point(s) de vie !");
					if(combattant.getPointsDeVie() <= ZERO_POINT_DE_VIE) {
						System.out.println("Le combattant : " + combattant.getNom() + " est mort !!!");
					}
				}
			}
		}
	}
}
