package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void feed() {
		// Arrange
		VirtualPet underTest = new VirtualPet();
		// Act
		String feed = underTest.feedPet(5);
		// Assert
		assertEquals("5", feed);
	}

}
