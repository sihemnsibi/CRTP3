package package1;

public class Coordonnees {
	private String nom;
	private String prenom; 
	private String adresse;
	private int telephone;
	public Coordonnees () {
		
	}
	public Coordonnees (String nom, String prenom,String adresse,int telephone) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.telephone=telephone;
		
		
	}
	public Coordonnees (String nom,String prenom,String adresse) {
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		
	}
	public Coordonnees (String nom,String prenom,int telephone) {
		this.nom=nom;
		this.prenom=prenom;
		this.telephone=telephone;
		
	}
	public Coordonnees (String nom,String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
	public void setNom (String nom) {
		this.nom=nom;
	}
	public String getNom () {
		return nom;
		
	}
	public void setPrenom (String prenom) {
		this.prenom=prenom;
	}
	public String getPrenom () {
		return prenom ;
	}
	public void setAdresse (String adresse) {
		this.adresse=adresse;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setTelephone (int telephone) {
        this.telephone=telephone;		
	}
	public int getTelephone () {
		return telephone;
	}
	public String toString() {
		return ("nom :"+nom+" prenom:"+prenom+" adresse"+adresse+" telephone:"+telephone+" \n");
	}
	

}
