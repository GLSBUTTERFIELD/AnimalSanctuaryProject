package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Attendant;
import com.skilldistillery.sanctuary.entities.Cow;
import com.skilldistillery.sanctuary.entities.Parrot;
import com.skilldistillery.sanctuary.entities.Sanctuary;
import com.skilldistillery.sanctuary.entities.Wolf;

public class AnimalSanctuaryApp {
	private Scanner kb = new Scanner(System.in);
	private Sanctuary sanctuary = new Sanctuary();

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	public void launchApp() {
		sanctuary.setAttendant(new Attendant());
		System.out.println("Welcome to the Skill Distillery Sanctuary!");
		boolean keepGoing = true;
		do {
			displayMenu();
			String userInput = kb.nextLine();
			switch (userInput) {
			case "1":
				System.out.println("\nThe sanctuary currently includes: ");
				sanctuary.listAnimals();
				break;
			
			case "2":
				if(sanctuary.isFull()) {
					System.out.println("\nSorry, the sanctuary is full.");
					break;
				}
				
				displayAnimalsToAdd();
				String animalChoice = kb.nextLine();
				if (animalChoice.equals("1")) {
					Cow c = new Cow();
					System.out.println("\nWhat is the cow's name? ");
					String animalName = kb.nextLine();
					c.setName(animalName + " the cow");
					sanctuary.addAnimal(c);
					break;
				}

				else if (animalChoice.equals("2")) {
					Parrot p = new Parrot();
					System.out.println("\nWhat is the parrot's name? ");
					String animalName = kb.nextLine();
					p.setName(animalName + " the parrot");
					sanctuary.addAnimal(p);
					break;
				}

				else if (animalChoice.equals("3")) {
					Wolf w = new Wolf();
					System.out.println("\nWhat is the wolf's name? ");
					String animalName = kb.nextLine();
					w.setName(animalName + " the wolf");
					sanctuary.addAnimal(w);
					break;
				}

				else {
					System.out.println("\nInvalid choice. Please submit a new response.");
					break;
				}
				
			case "3":
				System.out.println("\nThe attendant will now start their rounds.\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				sanctuary.startAttendantRounds();
				break;

			case "4":
				System.out.println("\nThanks for vising the Skill Distillery Sanctuary.\nWe hope to see you again soon!");
				keepGoing = false;
				break;

			default:
				System.out.println("\nInvalid input.");
			}
		} while (keepGoing);
		kb.close();
	}

	public void displayMenu() {
		System.out.println("............................................");
		System.out.println(".         Please select an option:         .");
		System.out.println(". 1: See who's currently in the sanctuary  .");
		System.out.println(". 2: Add a new member to the sanctuary     .");
		System.out.println(". 3: Start the attendant's feeding round   .");
		System.out.println(". 4: Exit the menu                         .");
		System.out.println("............................................");
	}

	public void displayAnimalsToAdd() {
		System.out.println("\nWhat kind of animal are you adding to the sanctuary?");
		System.out.println("1: Cow");
		System.out.println("2: Parrot");
		System.out.println("3: Wolf");
	}

}
