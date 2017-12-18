package pokemon.model;

public class Trapinch extends Pokemon implements Ground
{
	public Trapinch(int number, String name)
	{
		super(number, name);
	}
	
	public String moveEarthquake()
	{
		return "Trapinch uses Earthquake";
	}
	
	public String moveFissure()
	{
		return "Trapinch uses Fissure";
	}
	
	public String moveDig()
	{
		return "Trapinch uses Dig";
	}
}
