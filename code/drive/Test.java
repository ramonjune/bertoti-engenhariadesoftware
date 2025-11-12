package test;

import static org.junit.jupiter.api.Assertions.*;

class Test 
{
	@org.junit.jupiter.api.Test
	void Over18() 
	{
		Car carOne = new Car("stutz");
		Driver driverOne = new Driver("license", 20);
		
		boolean didAccelerate = driverOne.Drive(carOne);
		
		assertTrue(didAccelerate);
		assertEquals(100.0f, carOne.getSpeed(), 0.001);
	}
	
	@org.junit.jupiter.api.Test
	void Under18()
	{
		Car carTwo = new Car("sallen");
		Driver driverTwo = new Driver("olivia", 17);
		
		boolean didAccelerate = driverTwo.Drive(carTwo);
		
		assertFalse(didAccelerate);
		assertEquals(0.0f, carTwo.getSpeed(), 0.001);
	}
}
