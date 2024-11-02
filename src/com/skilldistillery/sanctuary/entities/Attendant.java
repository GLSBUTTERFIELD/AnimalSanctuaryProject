package com.skilldistillery.sanctuary.entities;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		for (int i=0;i < animals.length; i++) {
			if (animals[i]!=null) {
				int amountToFeed = (int)((Math.random()*10) +1);
				System.out.println("Enclosure " + (i+1) + "\nI will feed " + animals[i].getName() + " " + amountToFeed + " foods");
				animals[i].eat(amountToFeed);
			}
			
			else {
				System.out.println("Enclosure " + (i+1) + ": This enclosure is empty, on to the next one.");
			}
			
		}
		System.out.println("\nEveryone's fed now, I can take a break.\n\n");	
	}

}
