package virtual_pet_shelter;

public class VirtualPet {
	String nameOfPet;
	String descriptionOfPet;
	int hungerLevel = 0;
	int timePassed = 1;
	int thirstLevel = 0;
	int boredomLevel = 0;
	int tirednessLevel = 0;

	public VirtualPet(String name, String description) {
		this.nameOfPet = name;
		this.descriptionOfPet = description;
	}

	public String getNameOfPet() {
		return nameOfPet;
	}

	public String getDescriptionOfPet() {
		return descriptionOfPet;
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
	}

	public void increaseBoredomLevel() {
		boredomLevel++;
	}

	public int getBoredomLevel() {
		if (timePassed % 2 == 0) {
			boredomLevel++;
		}
		return boredomLevel;
	}

	public void decreaseBoredomLevel() {
		boredomLevel = 0;
		increaseThirstLevel();
		increaseHungerLevel();
		increaseTimePassed();
		System.out.println("You played with " + nameOfPet);
	}

}
