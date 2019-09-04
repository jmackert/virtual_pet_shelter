package virtual_pet_shelter;

public class VirtualPet {
	String nameOfPet;
	int hungerLevel = 0;
	int timePassed = 1;
	int thirstLevel = 0;
	int boredomLevel = 0;
	int tirednessLevel = 0;

	public VirtualPet(String name) {
		this.nameOfPet = name;
	}

	public String getNameOfPet() {
		return nameOfPet;
	}

	public void increaseTimePassed() {
		timePassed++;
	}

	public void getTimePassed() {
		System.out.println("Time passed is: " + timePassed);
	}

	public void increaseHungerLevel() {
		hungerLevel++;
	}

	public int getHungerLevel() {
		if (timePassed % 2 == 0) {
			hungerLevel++;
		}
		return hungerLevel;
	}

	public void decreaseHungerLevel() {
		hungerLevel = 0;
		increaseThirstLevel();
		increaseTimePassed();
		System.out.println("You fed " + nameOfPet);
	}

	public void increaseThirstLevel() {
		thirstLevel++;
	}

	public int getThirstLevel() {
		if (timePassed % 2 == 0) {
			thirstLevel++;
		}
		return thirstLevel;
	}

	public void decreaseThirstLevel() {
		thirstLevel = 0;
		increaseTimePassed();
		increaseHungerLevel();
		System.out.println("You gave " + nameOfPet + " something to drink");
	}

	public void increaseBoredomLevel() {
		boredomLevel++;
	}

	public int getBoredomLevel() {
		if (timePassed % 2 == 0) {
			boredomLevel++;
		}
		return thirstLevel;
	}

	public void decreaseBoredomLevel() {
		boredomLevel = 0;
		increaseThirstLevel();
		increaseHungerLevel();
		increaseTimePassed();
		System.out.println("You played with " + nameOfPet);
	}

}
