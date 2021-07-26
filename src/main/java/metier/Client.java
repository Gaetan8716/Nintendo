package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Jeu> listeDeJeu= new ArrayList();
	public Client(String nom, String prenom, List<Jeu> listeDeJeu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeDeJeu = listeDeJeu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Jeu> getListeDeJeu() {
		return listeDeJeu;
	}
	public void setListeDeJeu(List<Jeu> listeDeJeu) {
		this.listeDeJeu = listeDeJeu;
	}

	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeDeJeu=" + listeDeJeu + "]";
	}
	

}
