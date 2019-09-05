package virtual_pet_shelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class virtualPetShelterTest {

	@Test
	public void ShouldAddPet() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		//Action
		String result = underTest.addPet(1);
		//Assertion
		assertEquals("1", result);
	}
	
	@Test
	public void ShouldRemovePet() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		//Action
		String result = underTest.removePet(1);
		//Assertion
		assertEquals("0", result);
	}
	
	@Test
	public void ShouldDecreaseHunger() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		//Action
		String result = underTest.feedPets(1);
		//Assertion
		assertEquals("0", result);
	}
	@Test
	public void ShouldIncreaseTime() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		//Action
		String result = underTest.increaseTime(1);
		//Assertion
		assertEquals("1", result);
	}
}
