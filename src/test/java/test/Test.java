package test;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console ds = new Console("DS");
		Console wii = new Console("WII");
		Console swtch = new Console("Switch");

		
		Jeu j1 = new Jeu("Mario_Kart", ds);
		Jeu j2 = new Jeu("Pokemon", wii);
		Jeu j3 = new Jeu("Zelda", swtch);
		Jeu j4 = new Jeu("Smash Bros", swtch);
		Jeu j5 = new Jeu("Metroid", ds);

	}

}
