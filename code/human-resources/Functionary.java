package testTwo;

import java.time.LocalDateTime;

public class Functionary 
{
	private float salary;
	private String fullName;
	private String position;
	
	public String getFullName()
	{
		return fullName;
	}
	
	public Functionary(float salary, String fullName, String position)
	{
		this.salary = salary;
		this.fullName = fullName;
		this.position = position;
	}
	
	public void UpdateSalary(float amount)
	{
		salary += amount;
	}
	
	public LocalDateTime ClockIn()
	{
		return LocalDateTime.now();
	}
}
