package test;

public class Car 
{
	private String brand;
	private float speed = 0f;
	
	public String getBrand()
	{
		return brand;
	}
	
	public float getSpeed()
	{
		return speed;
	}
	
	public Car(String brand)
	{
		this.brand = brand;
	}
	
	public void Accelerate(float increase)
	{
		speed += increase;
	}
}
