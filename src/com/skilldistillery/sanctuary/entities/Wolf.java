package com.skilldistillery.sanctuary.entities;

public class Wolf extends Animal {
	private static String noise = "AwooOOoo. ";

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.print("I love eating these " + amount + " pounds of meat.\n\n");

	}

}
