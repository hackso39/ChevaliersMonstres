package packChevaliersMonstres;

public abstract class Combattant {

	private String nom;
	private String prenom;
	private int age;
	private int pointsDeVie;
	private int pointsDAttaque;
		
	public Combattant(String nom, String prenom, int age, int pointsDeVie, int pointsDAttaque) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.pointsDeVie = pointsDeVie;
		this.pointsDAttaque = pointsDAttaque;
	}

	public Combattant() {
		super();
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
