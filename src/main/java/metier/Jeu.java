package metier;

import java.util.List;

public class Jeu {

	private String titre;
	private List console;
	
	
	
	public Jeu(String titre, List console) {
		this.titre = titre;
		this.console = console;
	}



	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public List getConsole() {
		return console;
	}



	public void setConsole(List console) {
		this.console = console;
	}



	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", console=" + console + "]";
	}
	
	
}
