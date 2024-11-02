package com.skilldistillery.sanctuary.app;

import java.util.Scanner;

import com.skilldistillery.sanctuary.entities.Sanctuary;

public class AnimalSanctuaryApp {
	private Sanctuary sanctuary;
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	public void launchApp() {
	Sanctuary sanctuary = new Sanctuary();
	System.out.println("Welcome to the Skill Distillery Sanctuary!");
		do {
		displayMenu();
		char userInput = (char) kb.nextInt();
		     switch(userInput) {
		     case '1': 
		    	 System.out.println("The sanctuary currently includes: ");
		    	 listAnimals();
		    	 break;
		     case '2':  
		    	 displayAnimalsToAdd();
		    	 char animalToAdd = (char) kb.nextInt();
		    	 if (animalToAdd == 1) {
		    		 animalToAdd = new Cow;
		    		 break;
		    	 }
		    	 
		    	 else if (animalToAdd ==2) {
		    		 animalToAdd = new Parrot;
		    		 break;
		    	 }
		    	 
		    	 else if (animalToAdd==3) {
		    		 animalToAdd = new Wolf;
		    		 break;
		    		 }
		    	 else {
		    		 System.out.println("Invalid choice. Please submit a new response.");
		    		 break;
		    	 }
		     case '3':
		    	 attendant.startAttendantRounds();
		    	 break;
		     case '4': 
		    	 System.out.println("Thanks for vising the Skill Distillery Sanctuary. /nGoodbye.");
		    	 break;
		     }
		}
			while(true);
	
	}
	
	// TODO instantiate new sanctuary & new attendant
	public void displayMenu() {
		System.out.println("********************************************");
		System.out.println("*         Please select an option:         *");
		System.out.println("* 1: See who's currently in the sanctuary  *");
		System.out.println("* 2: Add a new member to the sanctuary     *");
		System.out.println("* 3: Start the attendant's feeding round   *");
		System.out.println("* 4: Exit the menu                         *");
		System.out.println("********************************************");
	}

	public void displayAnimalsToAdd() {
		System.out.println("What kind of animal are you adding to the sanctuary?");
		System.out.println("/t/t1: Cow");
		System.out.println("/t/t2: Parrot");
		System.out.println("/t/t3: Wolf");
	}
	
}
