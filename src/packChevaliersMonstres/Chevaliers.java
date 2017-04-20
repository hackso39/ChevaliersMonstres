package packChevaliersMonstres;

public class Chevaliers {

	private String nom;
	private String prenom;
	private String titre;
	private int age;
	private int pointsDeVie;
	private int pointsDAttaque;
	
	public Chevaliers() {
		super();
	}

	public Chevaliers(String nom, String prenom, String titre, int age, int pointsDeVie, int pointsDAttaque) {
		this.nom = nom;
		this.prenom = prenom;
		this.titre = titre;
		this.age = age;
		this.pointsDeVie = pointsDeVie;
		this.pointsDAttaque = pointsDAttaque;
	}
	
	public void afficher() {
		System.out.println("Je suis le chevaliers : " + this.nom + ", j'ai le titre de : " + this.titre);
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPointsDeVie() {
		return this.pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}

	public int getPointsDAttaque() {
		return this.pointsDAttaque;
	}

	public void setPointsDAttaque(int pointsDAttaque) {
		this.pointsDAttaque = pointsDAttaque;
	}
}
