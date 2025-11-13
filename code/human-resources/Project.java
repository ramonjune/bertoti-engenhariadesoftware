package testTwo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Project 
{
	private String title;
	private LocalDate term;
	private boolean active = false;
	
	public Project(String title, LocalDate term)
	{
		this.title = title;
		this.term = term;
	}
	
	public void StartProject()
	{
		active = true;
	}
	
	public float EstimateCost()
	{
		return (ChronoUnit.DAYS.between(LocalDate.now(), term) * 24) * 50f;
	}
}
