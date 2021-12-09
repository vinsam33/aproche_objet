package application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;


import domain.City;
import domain.CityRepository;
import domain.Concert;
import domain.Event;
import domain.Theatre;
import infra.RepositoryInMemory;

public class MyAppli {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		City jolicite = new City();
		CityRepository rep = new RepositoryInMemory();
		System.out.println("Bienvenue dans le systeme de gestion de joliCité");
		System.out.println("Si vous voulez utiliser le jeu d'essai d'evenement, tapez 1 et si vous voulez vous meme écrire des evenements tapez 2");
		List<Event> events = new ArrayList<>();
	
		switch (Integer.parseInt(sc.nextLine())) {
		case 1:
			List<Calendar> cal = new ArrayList<>();
			cal.add(new GregorianCalendar(2021,01,13));
			events.add(new Concert(cal,"concert1",150,2 ));
		    cal = new ArrayList<>();
			cal.add(new GregorianCalendar(2021,01,04));
			cal.add(new GregorianCalendar(2021,01,05));
			cal.add(new GregorianCalendar(2021,01,06));
			events.add(new Theatre(cal,"theatre1",150,2 ));
			cal = new ArrayList<>();
			cal.add(new GregorianCalendar(2021,01,12));
			events.add(new Concert(cal,"concert2",150,2 ));
			cal = new ArrayList<>();
			cal.add(new GregorianCalendar(2021,01,27));
			cal.add(new GregorianCalendar(2021,01,28));
			cal.add(new GregorianCalendar(2021,01,29));
			events.add(new Theatre(cal,"theatre2",150,2 ));
			cal = new ArrayList<>();
			cal.add(new GregorianCalendar(2021,01,14));
			events.add(new Concert(cal,"concert3",150,2 ));
			for (Event e : events) {
				if(!jolicite.attributeEvent(e)) {
					System.out.println("un des evenements n'a pas put etre attribué, fermeture du programme");
					System.exit(0);
				}
			}
			rep.save(jolicite);
			System.out.println("Tout les evenements ont put etre attribué et la programmation a été sauvegardé en mémoire");
			jolicite.displayEvents();
			break;
		case 2:
			System.out.println("Veuillez rentrer un 'evenement, cet evenement doit etre programmé en Janvier 2021");
			do {
				String [] date = new String[3];
				String [] dateDebut = new String[3];
				String [] dateFin = new String[3];
				List<Calendar> calMan = new ArrayList<>();
				System.out.println("veuillez tapez le nom  de l'evenement");
				String name = sc.nextLine();
				System.out.println("veuillez tapez la capacite de l'evenement");
				int cap = Integer.parseInt(sc.nextLine());
				System.out.println("veuillez tapez la duree de l'evenement (en heure) ");
				int duration = Integer.parseInt(sc.nextLine());
				System.out.println("veuillez tapez 1 si l'evenement est un concert et 2 si l'evenement est un theatre");
				switch(Integer.parseInt(sc.nextLine())) {
				case 1 :
					System.out.println("Veuillez écrire la date du concert au format DD/MM/YYYY");
					String dateTmp = sc.nextLine();
					date = dateTmp.split("/");
					calMan.add(new GregorianCalendar(Integer.parseInt(date[2]),Integer.parseInt(date[1]),Integer.parseInt(date[0])));
					events.add(new Concert(calMan, name, cap, duration));
					break;
				case 2:
					System.out.println("Veuillez écrire la premiere date de la piece de theatre au format DD/MM/YYYY");
					String dateTmpDebut = sc.nextLine();
					dateDebut = dateTmpDebut.split("/");
					System.out.println("Veuillez écrire la derniere date de la piece de theatre au format DD/MM/YYYY");
					String dateTmpFin = sc.nextLine();
					dateFin = dateTmpFin.split("/");
					if (Integer.parseInt(dateDebut[0]) > Integer.parseInt(dateFin[0])) {
						System.out.println("erreur : la derniere date est avant la premiere");
						break;
					}
					for (int i = Integer.parseInt(dateDebut[0]);i<=Integer.parseInt(dateDebut[0]); i++) {
						calMan.add(new GregorianCalendar(Integer.parseInt(dateDebut[2]),Integer.parseInt(dateDebut[1]),i));
					}
					events.add(new Theatre(calMan, name, cap, duration));
					break;
				}
				System.out.println("Si vous voulez rentrer un nouvel evenement tapez 1, si vous avez termniner, taper 2");
			}while(Integer.parseInt(sc.nextLine()) != 2);
			for (Event e : events) {
				if(!jolicite.attributeEvent(e)) {
					System.out.println("un des evenements n'a pas put etre attribué, fermeture du programme");
					System.exit(0);
				}
			}
			rep.save(jolicite);
			System.out.println("Tout les evenements ont put etre attribué et la programmation a été sauvegardé en mémoire");
			jolicite.displayEvents();
			break;
		
		}

	}

}
