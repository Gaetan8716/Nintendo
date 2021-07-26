package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Achat;
import metier.Boutique;
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
		
		Boutique boutique = new Boutique("Microbatard", "Rue de l'Arnaque", jeux);
		LocalDate ld = LocalDate.parse("2021-11-30");
		Achat article1 = new Achat(j1, ld , 60, boutique);
		List <Achat> listeDAchat = new ArrayList() ;
		listeDAchat.add(article1);

		Client c1 = new Client("Testi", "Testou", listeDAchat);
	}

}
