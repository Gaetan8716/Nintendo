package test;

import java.util.ArrayList;
import java.util.List;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		
		List <Console> consoles = new ArrayList();
		
		Console ds = new Console("DS");
		Console wii = new Console("WII");
		Console swtch = new Console("Switch");
		
		consoles.add(ds);
		consoles.add(wii);
		consoles.add(swtch);		
		
		Jeu j1 = new Jeu("Mario_Kart", (List) consoles.get(0));
		Jeu j2 = new Jeu("Pokemon", (List) consoles.get(1));
		Jeu j3 = new Jeu("Zelda", (List) consoles.get(2));
		Jeu j4 = new Jeu("Smash Bros", (List) consoles.get(2));
		Jeu j5 = new Jeu("Metroid", (List) consoles.get(0));
		
		Client c1 = new Client("Testi", "Testou", )
			
	}

}
