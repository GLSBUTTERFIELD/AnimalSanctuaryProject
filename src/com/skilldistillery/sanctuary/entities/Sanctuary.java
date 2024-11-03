package com.skilldistillery.sanctuary.entities;

public class Sanctuary {

	private Animal[] animalsInSanctuary = new Animal[5];
	private Attendant attendant;

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void listAnimals() {
		for (int i = 0; i < animalsInSanctuary.length; i++) {
			if (animalsInSanctuary[i] != null) {
				System.out.println("Enclosure " + (i + 1) + ": " + animalsInSanctuary[i].getName());
			}

			else {
				System.out.println("Enclosure " + (i + 1) + ": This enclosure is empty.");
			}
		}
		System.out.println();
	}

	public boolean isFull() {
		for (int i = 0; i < animalsInSanctuary.length; i++) {
			if (animalsInSanctuary[i] == null) {
				return false;
			}
		}
		return true;
	}

	public void addAnimal(Animal animal) {
		for (int i = 0; i < animalsInSanctuary.length; i++) {
			if (animalsInSanctuary[i] == null) {
				animalsInSanctuary[i] = animal;
				return;
			}

		}

	}

	public void startAttendantRounds() {
		System.out.println("La de da, I love feeding my Animal Friends ...\n");
		attendant.makeRounds(animalsInSanctuary);
	}

}
