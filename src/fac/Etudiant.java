package fac;

public class Etudiant {
	private String nom;
	private String prenom;
	private String numDossier;
	
	public Etudiant(String nom, String prenom, String numDossier) {
		this.nom=nom;
		this.prenom=prenom;
		this.numDossier=numDossier;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getNumDossier() {
		return numDossier;
	}
	
}
