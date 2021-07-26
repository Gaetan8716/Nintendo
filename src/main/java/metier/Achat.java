package metier;

import java.time.LocalDate;

public class Achat {

	private Jeu jeu;
	private LocalDate date;
	private Boutique boutique;
	
	
	public Achat(Jeu jeu, LocalDate date, Boutique boutique) {
		this.jeu = jeu;
		this.date = date;
		this.boutique = boutique;
	}


	public Jeu getJeu() {
		return jeu;
	}


	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Boutique getBoutique() {
		return boutique;
	}


	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}


	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", date=" + date + ", boutique=" + boutique + "]";
	}
	
	
	
}
