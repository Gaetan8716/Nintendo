package test;

import java.util.ArrayList;
import java.util.List;

import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Jeu;
import metier.Portable;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		
		List <Console> consoles = new ArrayList();
		
		Portable ds = new Portable("DS");
		Salon wii = new Salon("WII");
		Hybride swtch = new Hybride("Switch");
		
		consoles.add(ds);
		consoles.add(wii);
		consoles.add(swtch);
		
		List <Jeu> jeux = new ArrayList();
		
		Jeu j1 = new Jeu("Mario_Kart", (List) consoles.get(0));
		Jeu j2 = new Jeu("Pokemon", (List) consoles.get(1));
		Jeu j3 = new Jeu("Zelda", (List) consoles.get(2));
		Jeu j4 = new Jeu("Smash Bros", (List) consoles.get(2));
		Jeu j5 = new Jeu("Metroid", (List) consoles.get(0));
		
		jeux.add(j1);
		jeux.add(j2);
		jeux.add(j3);
		jeux.add(j4);
		jeux.add(j5);
		
		Client c1 = new Client("Testi", "Testou", (List) jeux.get(3));
	}

}
