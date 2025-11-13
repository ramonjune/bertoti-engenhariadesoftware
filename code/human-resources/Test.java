package testTwo;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Test 
{
	@org.junit.jupiter.api.Test
	void department() 
	{
		Department departmentOne = new Department("technology", "florida", 100000f);
		
		Functionary functionaryOne = new Functionary(2000f, "John Doe", "developer");
		
		assertEquals(100000f, departmentOne.DisplayBudget());
	}
	
	@org.junit.jupiter.api.Test
	void functionary()
	{
		Functionary functionaryTwo = new Functionary(2000f, "Jane Doe", "developer");
		
		assertEquals("Jane Doe", functionaryTwo.getFullName());
		
		LocalDateTime clockInTime = functionaryTwo.ClockIn();
		assertNotNull(clockInTime);
	}
	
	@org.junit.jupiter.api.Test
	void project()
	{
		Project projectOne = new Project("Project X", LocalDate.of(2025, 11, 27));
		
		float estimatedCost = projectOne.EstimateCost();
		
		assertTrue(estimatedCost > 10000);
	}
}