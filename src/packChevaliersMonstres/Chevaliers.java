package packChevaliersMonstres;

public class Chevaliers extends Combattant{

	private String titre;
	
	public Chevaliers() {
		super();
	}

	public Chevaliers(String nom, String prenom, String titre, int age, int pointsDeVie, int pointsDAttaque) {
		super(nom, prenom, age, pointsDeVie, pointsDAttaque);
		this.titre = titre;
	}
	
	public void afficher() {
		System.out.println("Je suis le chevaliers : " + getNom() + ", j'ai le titre de : " + this.titre);
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
}
