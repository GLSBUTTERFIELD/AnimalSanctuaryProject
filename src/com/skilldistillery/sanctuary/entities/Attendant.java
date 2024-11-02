package com.skilldistillery.sanctuary.entities;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		for (int i=0;i < animals.length; i++) {
			if (animals[i]!=null) {
				int amountToFeed = 10;
				System.out.println("I will feed " + animals[i].getName() + amountToFeed + " foods");
				animals[i].eat(amountToFeed);
			}
			
			else {
				System.out.println("This enclosure is empty, on to the next one.");
			}
			
		}
		System.out.println("Everyone's fed now, I can take a break.");	
	}

}
