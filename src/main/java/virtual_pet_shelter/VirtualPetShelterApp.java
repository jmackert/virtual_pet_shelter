package virtual_pet_shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter myShelter = new VirtualPetShelter();
	static boolean isRunning = true;

	public static void displayPets() {
		myShelter.showShelter();
		System.out.println("");
	}
	public static void displayInteractionMenu() {
	
	System.out.println("What would you like to do?");
	System.out.println("1: Feed pets");
	System.out.println("2: Water pets");
	System.out.println("3: Play with a pet");
	System.out.println("4: Admit a pet");
	System.out.println("5: Sell with a pet");
	System.out.println("6: Do nothing");
	System.out.println("7: QUIT");
	int interaction = input.nextInt();
	switch(interaction) {
	case 1:
		myShelter.feedPets();
		break;
	case 2:
		myShelter.waterPets();
		break;
	case 3:
		myShelter.playWithPet();
		break;
	case 4:
		myShelter.addPet();
		break;
	case 5:
		myShelter.removePet();
		break;
	case 6:
		myShelter.increaseTime();
		System.out.println("You did nothing");
		break;
	case 7:
		isRunning = false;
		default:
			myShelter.increaseTime();
	}
	
}
	
	public static void main(String[] args) {
		while (isRunning) {
			displayPets();
			displayInteractionMenu();
		}

	}

}
