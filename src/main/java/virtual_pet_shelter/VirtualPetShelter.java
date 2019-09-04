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
	}

	public void removePet() {
		System.out.println("Enter the name of the pet you would like to adopt:");
		String name = input.next();
		for (int i = shelter.size() - 1; i >= 0; i--) {
			if (shelter.get(i).getNameOfPet().equals(name)) {
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

}
