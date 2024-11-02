package com.skilldistillery.sanctuary.entities;

public class Cow extends Animal {
	private static String noise = "MoOOoo. ";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
	makeNoise();
	System.out.print("These " + amount + " bales of hay are so delicious.\n----------------\n");
	}
	
	

}
