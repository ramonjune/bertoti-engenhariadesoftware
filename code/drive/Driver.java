package test;

public class Driver 
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public Driver(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public boolean Drive(Car car)
	{
		if (age >= 18)
		{
			car.Accelerate(100f);
			return true;
		}
		
		else 
		{
			return false;
		}
	}
}
