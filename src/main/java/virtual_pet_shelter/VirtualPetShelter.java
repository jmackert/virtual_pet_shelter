package virtual_pet_shelter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualPetShelter {

	List<VirtualPet> shelter = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	public void addPet() {
		System.out.println("Enter Pet's name: ");
		String name = input.next();
		VirtualPet newPet = new VirtualPet(name);
		shelter.add(newPet);
		newPet.increaseTimePassed();
	}

	public void removePet() {
		System.out.println("Enter the name of the pet you would like to adopt:");
		String petToAdopt = input.next();
		for (int i = shelter.size() - 1; i >= 0; i--) {
			if (shelter.get(i).getNameOfPet().equals(petToAdopt)) {
				shelter.remove(i);
			}
		}
	}

	public void showShelter() {
		for (VirtualPet pets : shelter) {
			System.out.println("Name: " + pets.getNameOfPet() + " Hunger: " + pets.getHungerLevel() + " Thirst: "
					+ pets.getThirstLevel() + " Boredom: " + pets.getBoredomLevel());
		}
	}

	public void feedPets() {
		for (VirtualPet pets : shelter) {
			pets.decreaseHungerLevel();
			System.out.println("You fed the pets.");
		}
	}

	public void waterPets() {
		for (VirtualPet pets : shelter) {
			pets.decreaseHungerLevel();
			System.out.println("You gave the pets water.");
		}
	}

	public void playWithPet() {
		System.out.println("Choose a pet would you like to play with:");
		String petToPlayWith = input.next();
			for (int i = shelter.size() - 1; i >= 0; i--) {
				if (shelter.get(i).getNameOfPet().equals(petToPlayWith)) {
					shelter.get(i).decreaseBoredomLevel();
//					System.out.println("You played with " + petToPlayWith);
				}
				else {
					System.out.println("That is an invalid pet.");
				}
			}
		}
	

	public void increaseTime() {
		for (VirtualPet pets : shelter) {
			pets.increaseTimePassed();
		}
	}
}
