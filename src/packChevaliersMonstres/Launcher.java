package packChevaliersMonstres;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {
		
		Chevaliers fred = new Chevaliers("Martin", "Frederic", "Duc", 47, 100, 100);
		Chevaliers chris = new Chevaliers("Dupont", "Christophe", "LeToutPuissant", 26, 100, 100);
		Ecuyers yann = new Ecuyers("Henri","Yann", 30, 100, 100);
		Dragons feu = new Dragons("Feu", 100);
		
		List<Chevaliers> listeChevaliers = new ArrayList<Chevaliers>();
	
		listeChevaliers.add(fred);
		listeChevaliers.add(chris);

		for(int i = 0 ; i < listeChevaliers.size() ; i++) {
			listeChevaliers.get(i).afficher();
		}
		
		while(feu.getPointsDevie() > 0) {
			
			if(feu.getPointsDevie() > 0) {
				System.out.println(fred.getPrenom() + " tape le Dragon");
				feu.setPointsDevie(feu.getPointsDevie() - fred.getPointsDAttaque());
				System.out.println("Le Dragon possède : " + feu.getPointsDevie() + " de vie !");
			}
			
			if(feu.getPointsDevie() > 0) {
				System.out.println(chris.getPrenom() + " tape le Dragon");
				feu.setPointsDevie(feu.getPointsDevie() - chris.getPointsDAttaque());
				System.out.println("Le Dragon possède : " + feu.getPointsDevie() + " de vie !");
			}
		}
		
	}

}
