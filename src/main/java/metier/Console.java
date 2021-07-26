package metier;


import java.time.LocalDate;

public abstract class Console {


	private String nom;
	private double prix;
	private LocalDate dateDeSortie;

	public Console(String nom) {
		this.nom = nom;
	}
	

	public Console(String nom, double prix, LocalDate dateDeSortie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateDeSortie = dateDeSortie;
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
