package com.skilldistillery.sanctuary.entities;

public class Parrot extends Animal {
	private static String noise = "Squawk! ";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.print("Thank you for the " + amount + " crackers.\n----------------\n");

	}

}
