package packChevaliersMonstres;

public class Dragons {

	String nom;
	int pointsDevie;
	
	public Dragons() {
		super();
	}
	
	public Dragons(String nom, int pointsDevie) {
		this.nom = nom;
		this.pointsDevie = pointsDevie;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointsDevie() {
		return this.pointsDevie;
	}

	public void setPointsDevie(int pointsDevie) {
		this.pointsDevie = pointsDevie;
	}
}
