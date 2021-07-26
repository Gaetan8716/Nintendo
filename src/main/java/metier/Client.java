package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Achat> listeDAchat= new ArrayList();
	public Client(String nom, String prenom, List<Achat> listeDAchat) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.listeDAchat = listeDAchat;
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
	public List<Achat> getListeDeJeu() {
		return listeDAchat;
	}
	public void setListeDeJeu(List<Achat> listeDAchat) {
		this.listeDAchat = listeDAchat;
	}

	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listeDAchat=" + listeDAchat + "]";
	}
	

}
