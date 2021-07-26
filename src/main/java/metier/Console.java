package metier;

import java.time.LocalDate;

public class Console {

	private String nom;
	private double prix;
	private LocalDate dateDeSortie;

	public Console(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
