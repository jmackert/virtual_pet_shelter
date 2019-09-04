package virtual_pet_shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	static Scanner input = new Scanner(System.in);
	static VirtualPetShelter myShelter = new VirtualPetShelter();
	static boolean isRunning = true;

//	public static void displayInteractionMenu() {
//	
//	System.out.println("What would you like to do?");
//	System.out.print("1: Feed ");
//	myShelter.getNameOfPet();
//	System.out.println("");
//	System.out.print("2: Water ");
//	myShelter.getNameOfPet();
//	System.out.println("");
//	System.out.print("3: Play with ");
//	myShelter.getNameOfPet();
//	System.out.println("");
//	System.out.print("4: Have ");
//	myShelter.getNameOfPet();
//	System.out.println(" sleep");
//	System.out.println("5: Do nothing");
//	System.out.println("6: QUIT");
//	int interaction = input.nextInt();
//	switch(interaction) {
//	case 1:
//		myShelter.decreaseHungerLevel();
//		break;
//	case 2:
//		myShelter.decreaseThirstLevel();
//		break;
//	case 3:
//		myShelter.decreaseBoredomLevel();
//		break;
//	case 4:
//		myShelter.decreaseTirednessLevel();
//		break;
//	case 5:
//		myShelter.increaseTimePassed();
//		System.out.println("You did nothing");
//		break;
//	case 6:
//		isRunning = false;
//		default:
//			myShelter.increaseTimePassed();
//	}
//	
//}
	
	public static void main(String[] args) {
		while (isRunning) {
			myShelter.addPet();
			myShelter.showShelter();
			System.out.println("Would you like to sell a pet? y/n");
			String sell = input.nextLine();
			if(sell.equals("y")) {
				myShelter.removePet();
				myShelter.showShelter();
			}
			// displayInteractionMenu();
		}

	}

}
