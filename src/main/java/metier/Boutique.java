package metier;

import java.util.List;

public class Boutique {
	
private String nom;
private String Adresse;
private List Jeux;

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public List getJeux() {
	return Jeux;
}
public void setJeux(List jeux) {
	Jeux = jeux;
}
@Override
public String toString() {
	return "Boutique [nom=" + nom + ", Adresse=" + Adresse + ", Jeux=" + Jeux + "]";
} 
	
}
