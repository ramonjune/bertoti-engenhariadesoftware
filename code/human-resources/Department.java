package testTwo;

import java.util.List;
import java.util.LinkedList;

public class Department 
{
	private String name;
	private String location;
	private float budget;
	private List<String> employees = new LinkedList<>();
	
	public Department(String name, String location, float budget)
	{
		this.name = name;
		this.location = location;
		this.budget = budget;
	}
	
	public void AddFunctionary(Functionary functionary)
	{
		employees.add(functionary.getFullName());
	}
	
	public float DisplayBudget()
	{
		return budget;
	}
}
