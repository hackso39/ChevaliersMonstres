package packChevaliersMonstres;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

	private static final int ZERO_POINT_DE_VIE = 0;

	public static void main(String[] args) {
		
		Chevaliers fred = new Chevaliers("Martin", "Frederic", "Duc", 47, 100, 100);
		Chevaliers chris = new Chevaliers("Dupont", "Christophe", "LeToutPuissant", 26, 100, 100);
		Ecuyers yann = new Ecuyers("Henri","Yann", 30, 100, 100);
		Dragons feu = new Dragons("Feu", 300);
		
		List<Chevaliers> listeChevaliers = new ArrayList<Chevaliers>();
	
		listeChevaliers.add(fred);
		listeChevaliers.add(chris);

		for(int i = 0 ; i < listeChevaliers.size() ; i++) {
			listeChevaliers.get(i).afficher();
		}
		
		System.out.println("Le Dragon : " + feu.getNom() + ", possède : " + feu.getPointsDevie() + " point(s) de vie !");
		
		while(feu.getPointsDevie() > 0) {
			
			for(int i = 0 ; i < listeChevaliers.size() ; i++) {
				if(feu.getPointsDevie() > 0) {
					System.out.println(listeChevaliers.get(i).getPrenom() + " tape le Dragon");
					feu.setPointsDevie(feu.getPointsDevie() - listeChevaliers.get(i).getPointsDAttaque());
					System.out.println("Le Dragon possède : " + feu.getPointsDevie() + " de vie !");
					if(feu.getPointsDevie() == ZERO_POINT_DE_VIE) {
						System.out.println("Le Dragon : " + feu.getNom() + " est mort !!!");
					}
				}
			}
			
			for (Chevaliers chevaliers : listeChevaliers) {
				System.out.println(chevaliers.getPrenom());
			}
		}
	}
}
