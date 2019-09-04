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
	public void showShelter() {
		for(VirtualPet pets:shelter) {
			System.out.println("Name: " + pets.getNameOfPet() + " Hunger: " + pets.getHungerLevel() + " Thirst: " + pets.getThirstLevel() + " Boredom: " + pets.getBoredomLevel());
		}
	}

}
